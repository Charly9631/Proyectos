package com.pruebas.Modelo;

public class Usuario {

	private int Id;
	private String nombre;
	private String email;
	private String telefono;
	
	
	
	public Usuario() {
		super();
	}


	public Usuario(int id, String nombre, String email, String telefono) {
		super();
		Id = id;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
