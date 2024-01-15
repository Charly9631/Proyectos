package com;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String velocidad;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String marca, String modelo, String velocidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
	}
	
	
	
}
