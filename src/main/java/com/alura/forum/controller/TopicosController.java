package com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;

@Controller
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> listado() {

		Topico topico = new Topico("Titulo del tópico", "Mesaje", new Curso("Spirng Boot Parte 1", "Desarrollo"));
		Topico topico = new Topico("Titulo del tópico", "Mesaje", new Curso("Spirng Boot Parte 1", "Desarrollo"));

		return Arrays.asList(topico, topico, topico);

	}

}
