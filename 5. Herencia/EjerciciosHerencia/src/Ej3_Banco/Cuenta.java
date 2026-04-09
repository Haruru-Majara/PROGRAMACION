package Ej3_Banco;

import java.util.HashSet;

public class Cuenta {
	private static int contadorCuentas = 0;	
	private static final double interesInicialCuenta=3;
	protected double interes;
	private int numCuenta;
	private HashSet<String> titulares;
	private double saldo;
	
	public Cuenta(HashSet titulares, double saldo) {
		this.titulares = titulares;
		this.saldo = saldo;
		this.interes=interesInicialCuenta;		
		contadorCuentas++;
		this.numCuenta=contadorCuentas;
	}

	public int getNumCuenta() {
		return numCuenta;
	}
	

	
}
