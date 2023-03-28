package com.alura.forum.controller.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ActualizaTopicoForm {
	
	
	@NotEmpty @Size(min = 5)
	private String tiutulo;
	
	@NotEmpty @Size(min = 5)
	private String mensaje;

	
	public String getTiutulo() {
		return tiutulo;
	}

	public void setTiutulo(String tiutulo) {
		this.tiutulo = tiutulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
