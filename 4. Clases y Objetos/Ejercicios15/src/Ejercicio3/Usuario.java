package Ejercicio3;

public class Usuario {
	private String nombre;
	private int nEntradas;
	
	private static int entradasDisp=20;
	
	public Usuario(String nombre, int nEntradas) {
		this.nombre = nombre;
		this.nEntradas = nEntradas;
	}
	
	public boolean comprar() {
		if (nEntradas>entradasDisp)
			return false;
		entradasDisp=entradasDisp-nEntradas;
		return true;
	}

	public static int getEntradasDisp() {
		return entradasDisp;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", nEntradas=" + nEntradas + "]";
	}
	
}
