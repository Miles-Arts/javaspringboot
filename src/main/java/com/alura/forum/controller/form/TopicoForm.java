package com.alura.forum.controller.form;

public class TopicoForm {

	private String titulo;
	
	private String mensaje;
	
	private Long idUsuario;
	
	private String nombreCruso;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreCruso() {
		return nombreCruso;
	}

	public void setNombreCruso(String nombreCruso) {
		this.nombreCruso = nombreCruso;
	}
	
	
	
}
