package com;

public class Motocicleta extends Vehiculo{

	private String tipoMotocicleta;
	
	public Motocicleta() {
		
	}

	

	public Motocicleta(String marca, String modelo, String velocidad, String tipoMotocicleta) {
		super(marca, modelo, velocidad);
		this.tipoMotocicleta = tipoMotocicleta;
	}



	public String getTipoMotocicleta() {
		return tipoMotocicleta;
	}

	public void setTipoMotocicleta(String tipoMotocicleta) {
		this.tipoMotocicleta = tipoMotocicleta;
	}

	@Override
	public String toString() {
		return "Motocicleta [tipoMotocicleta=" + tipoMotocicleta + ", toString()=" + super.toString() + "]";
	}
	
	public void mensajeMotocicleta() {
		System.out.println("Esta motocicleta es nueva");
	}
}
