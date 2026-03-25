package Ej3_Banco;

import java.util.HashSet;

public class Cuenta {
	private static final double interesInicialCuenta=3;
	protected double interes;
	private int numCuenta;
	private HashSet titulares;
	private double saldo;
	
	public Cuenta(HashSet titulares, double saldo) {
		super();
		this.titulares = titulares;
		this.saldo = saldo;
		this.interes=interesInicialCuenta;
	}
	
	public int asignarNum () {
		int cont=0;
		
	}
	
}
