package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Forma circulo = new Circulo(4);
		Forma rectangulo = new Rectangulo(4, 6);
		
		System.out.println("Area del circulo: "+ circulo.calcularArea());
		System.out.println("Perimetro del circulo: "+ circulo.calcularPerimetro());
		
		System.out.println("Area del rectangulo: "+ rectangulo.calcularArea());
		System.out.println("Perimetro del rectangulo: "+ rectangulo.calcularPerimetro());
	}

}
