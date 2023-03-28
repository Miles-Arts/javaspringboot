package com.alura.forum.controller;

import java.net.URI;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.alura.forum.controller.dto.DetalleTopicoDTO;
import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.controller.form.ActualizaTopicoForm;
import com.alura.forum.controller.form.TopicoForm;
import com.alura.forum.model.Curso;
import com.alura.forum.model.Topico;
import com.alura.forum.service.TopicoServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired
	private TopicoServices topicoServices;

	@GetMapping
	public ResponseEntity<List<TopicoDTO>> listado(String nombreCurso) {

		return ResponseEntity.ok(topicoServices.listado(nombreCurso));

	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalleTopicoDTO> detalle(@PathVariable Long id) {

		DetalleTopicoDTO detalle = topicoServices.detalle(id);
		
		return  ResponseEntity.ok(detalle);
		
	}
	
	@PutMapping("{/id}")
	public ResponseEntity actualizar(@PathVariable Long id, @RequestBody @Valid ActualizaTopicoForm actualizaTopicoForm) {
		
		
		topicoServices.actualizar(id, actualizaTopicoForm);
		
	}

	@PostMapping
	public ResponseEntity<TopicoDTO> registrar(@Valid @RequestBody TopicoForm topicoForm,
			UriComponentsBuilder uriComponentsBuilder) {

		// Respuesta 201
		Topico topico = topicoServices.registrar(topicoForm);

		URI uri = uriComponentsBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();

		return ResponseEntity.created(uri).body(new TopicoDTO(topico));

	}
}
