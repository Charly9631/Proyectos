package com;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{

	private String nombre;
	
	public UsuarioDTO() {
		
	}

	public UsuarioDTO(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
