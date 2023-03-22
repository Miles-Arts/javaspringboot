package com.alura.forum.controller;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.controller.form.TopicoForm;
import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;
import com.alura.forum.service.TopicoServices;


@RestController
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired
	private TopicoServices topicoServices;
	
	
	@GetMapping
	public List<TopicoDTO> listado(String nombreCurso) {
		
		//System.out.println(nombreCurso);
		
		/*Topico topico = new Topico("Titulo del tópico", "Mesaje del tópico", new Curso("Spring Boot Parte 1", "Desarrollo"));
		Topico topico2 = new Topico("Titulo del tópico2", "Mesaje del tópico", new Curso("Spring Boot Parte 1", "Desarrollo"));*/
		
		//return TopicoDTO.convertir(Arrays.asList(topico, topico2 ));
		
		return topicoServices.listado(nombreCurso);
		
	}
	
	@PostMapping
	public void registrar(TopicoForm topicoForm) {
		
		
		
	}
}



