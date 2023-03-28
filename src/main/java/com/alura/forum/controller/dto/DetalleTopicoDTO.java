package com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.alura.forum.model.Curso;
import com.alura.forum.model.StatusTopico;
import com.alura.forum.model.Topico;

public class DetalleTopicoDTO {
	
	
	private Long id;
	
	private String mensaje;
	
	private LocalDateTime fechacreacion;
	
	private String autor;
	
	private StatusTopico status;
	
	private List<RespuestaDTO> respuestas;
	
	
	
	public DetalleTopicoDTO(Topico topico) {
		
		this.id = topico.getId();
		
		this.mensaje = topico.getMensaje();
		
		this.fechacreacion = topico.getFechaCreacion();
		
		this.autor = topico.getAutor().getNombre();
		
		this.status = topico.getStatus();
		
		
		if(topico.getRespuestas() != null && !topico.getRespuestas().isEmpty()) {
			
			this.respuestas = topico.getRespuestas().stream().map(RespuestaDTO::new).collect(Collectors.toList());
			
		}
		
	}



	public Long getId() {
		return id;
	}



	public String getMensaje() {
		return mensaje;
	}



	public LocalDateTime getFechacreacion() {
		return fechacreacion;
	}



	public String getAutor() {
		return autor;
	}



	public StatusTopico getStatus() {
		return status;
	}



	public List<RespuestaDTO> getRespuestas() {
		return respuestas;
	}
	
	

}
