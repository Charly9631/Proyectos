package com;

public class Principal {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria(500, "12130565");
		
		cuenta1.deposito(280);
		cuenta1.retirar(100);
		cuenta1.consultarSaldo();
	}

}
