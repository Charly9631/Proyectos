package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner en = new Scanner(System.in);
		
		try {
			System.out.println("Ingrese un numero: ");
			int num = en.nextInt();
			System.out.println("Su numero es: "+num);
		}catch(InputMismatchException e) {
			System.out.println("Favor de ingresar un numero!");
		}finally {
			en.close();
		}
		
	}

}
