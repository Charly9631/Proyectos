package com;

public class CuentaBancaria {

	private double saldo;
	private String numeroCuenta;
	
	public CuentaBancaria() {
		
	}

	public CuentaBancaria(double saldo, String numeroCuenta) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + "]";
	}
	
	public void deposito(double monto) {
		if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito de $" + monto + " realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto del deposito no puede ser cero o menor.");
        }
	}
	
	public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    
    public void consultarSaldo() {
        System.out.println("Saldo: $"+saldo);
    }
	
}
