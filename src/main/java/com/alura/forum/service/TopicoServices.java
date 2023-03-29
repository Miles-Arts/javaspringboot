package com.alura.forum.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.alura.forum.controller.dto.DetalleTopicoDTO;
import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.controller.form.ActualizaTopicoForm;
import com.alura.forum.controller.form.TopicoForm;
import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;
import com.alura.forum.model.Usuario;
import com.alura.forum.repository.CursoRepository;
import com.alura.forum.repository.TopicoRepository;
import com.alura.forum.repository.UsuarioRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@SpringBootApplication
@Service
public class TopicoServices {

	@Autowired
	private TopicoRepository topicoRespository;

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CursoRepository cursoRepository;

	private CrudRepository<Curso, Long> topicoRepository;
	
	public List<TopicoDTO> listado(String nombreCurso) {

		List<Topico> resultado;
		
		if (nombreCurso == null) {
			resultado = topicoRespository.findAll();

		} else {
			//resultado = topicoRespository.buscaNativaPorNombreDelCurso(nombreCurso);
			//resultado = topicoRespository.buscaTopicosPorNombreDelCurso(nombreCurso);
			//resultado = topicoRespository.findByCurso_Nombre(nombreCurso);
			resultado = topicoRespository.findByCursoNombre(nombreCurso);
		}
			
		return TopicoDTO.convertir(resultado);
	}

	public Topico registrar(TopicoForm topicoForm) {
		
		Optional<Usuario> usuario = usuarioRepository.findById(topicoForm.getIdUsuario());
		
		
		Optional<Curso> curso = cursoRepository.findByNombre(topicoForm.getNombreCurso());
		
		Topico topico = topicoForm.convertir(usuario, curso);
		
		return topicoRespository.save(topico);
		
	}

	public DetalleTopicoDTO detalle(Long id) {
		
		/*Optional<Curso> topico = topicoRepository.getReferenceById(ID id);*/
		
		Topico topico = topicoRepository.findById(id);
		
		return new DetalleTopicoDTO(topico);
	}

	
	@Transactional
	public void actualizar(Long id, @Valid ActualizaTopicoForm actualizaTopicoForm) {
		
		Topico topico = topicoRepository.findById(id);
		
		topico.setTitulo(actualizaTopicoForm.getTiutulo());
		topico.setMensaje(actualizaTopicoForm.getMensaje());
		
		return topico;
	}

}
