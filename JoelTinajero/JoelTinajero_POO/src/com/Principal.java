package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante estudiante1 = new Estudiante();
		
		estudiante1.setNombre("Joel Tinajero");
		estudiante1.setEdad("25");
		estudiante1.setNotas(94.7);
		
		Estudiante estudiante2= new Estudiante();
		estudiante2.setNombre("Alfonso Lopez");
		estudiante2.setEdad("23");
		estudiante2.setNotas(92.6);
		
		Estudiante estudiante3= new Estudiante();
		estudiante3.setNombre("Saul Hernandez");
		estudiante3.setEdad("24");
		estudiante3.setNotas(95.1);
		
		System.out.println(estudiante1);
		System.out.println(estudiante2);
		System.out.println(estudiante3);
	}

}
