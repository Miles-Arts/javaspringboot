package com.alura.forum.controller.dto;


import java.time.LocalDateTime;

public class TopicoDTO {
	
	private Long id;
	
	private String titulo;
	
	private String mensaje;
	
	private LocalDateTime fechaCreacion;

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	
	
	
}
