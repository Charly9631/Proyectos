package com;

public class Automovil extends Vehiculo{

	private int puertas;
	
	public Automovil() {
		
	}
	
	public Automovil(String marca, String modelo, String velocidad, int puertas) {
		super(marca, modelo, velocidad);
		this.puertas = puertas;
	}



	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	
	
	@Override
	public String toString() {
		return "Automovil [puertas=" + puertas + ", toString()=" + super.toString() + "]";
	}

	public void mensajeAutomovil() {
		System.out.println("Este automovil esta encendido");
	}
	
	
}
