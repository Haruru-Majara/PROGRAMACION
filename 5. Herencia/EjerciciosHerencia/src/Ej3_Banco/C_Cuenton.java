package Ej3_Banco;

import java.util.HashSet;

public class C_Cuenton extends Cuenta {
	private static final double interesInicialCuenton=4;
	static final double minimo=600;
	
	public C_Cuenton(HashSet titulares, double saldo) {
		super(titulares, saldo);
		this.interes=interesInicialCuenton;
	}
	public double sorteo() {
		double premio=interes*100;
	}

}
