package com;

public class Principal {

	public static void main(String[] args) {
		
		Automovil automovil1 = new Automovil("Honda", "Civic", "210 km/h", 2);
		
		
		System.out.println(automovil1);
		automovil1.mensajeAutomovil();
		
		Motocicleta moto1 = new Motocicleta("Yamaha", "XTR 250", "160 km/h", "Estandar");
		
		System.out.println(moto1);
		moto1.mensajeMotocicleta();

	}

}
