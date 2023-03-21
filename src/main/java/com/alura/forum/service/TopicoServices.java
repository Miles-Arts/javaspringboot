package com.alura.forum.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.model.Topico;
import com.alura.forum.repository.TopicoRepository;

@Service
public class TopicoServices {

	@Autowired
	private TopicoRepository topicoRespository;

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

}
