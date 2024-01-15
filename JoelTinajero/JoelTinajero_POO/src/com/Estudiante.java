package com;

public class Estudiante {

	private String nombre;
	private String edad;
	private double notas;
	
	public Estudiante() {
		
	}

	public Estudiante(String nombre, String edad, double notas) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Estudiantes [nombre=" + nombre + ", edad=" + edad + ", notas=" + notas + "]";
	}
	
	
	
}
