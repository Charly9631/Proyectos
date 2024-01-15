package com;

public class Circulo implements Forma{

	private double radio;
	
	public Circulo() {
		
	}
	
	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (3.1416 * radio * radio);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*(3.1416*radio);
	}

}
