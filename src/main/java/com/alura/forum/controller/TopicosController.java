package com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;
import com.alura.forum.service.TopicoServices;


@RestController
public class TopicosController {

	@Autowired
	private TopicoServices topicoServices;
	
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> listado() {

		/*Topico topico = new Topico("Titulo del tópico", "Mesaje del tópico", new Curso("Spring Boot Parte 1", "Desarrollo"));
		Topico topico2 = new Topico("Titulo del tópico2", "Mesaje del tópico", new Curso("Spring Boot Parte 1", "Desarrollo"));*/
		
		return topicoServices.listado();
		

		//return TopicoDTO.convertir(Arrays.asList(topico, topico2 ));

	}

}
