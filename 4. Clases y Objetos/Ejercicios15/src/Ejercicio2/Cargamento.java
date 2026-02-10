package Ejercicio2;

public class Cargamento {
	private String nombre;
	private String procedencia;
	private int kilos;
	private double compraKilo;
	private double ventaKilo;
	
	private static double beneficioTotal;

	public Cargamento(String nombre, String procedencia, int kilos, double compraKilo, double ventaKilo) {
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.kilos = kilos;
		this.compraKilo = compraKilo;
		this.ventaKilo = ventaKilo;
	}

	@Override
	public String toString() {
		return "Cargamento [nombre=" + nombre + ", procedencia=" + procedencia + ", kilos=" + kilos + ", compraKilo="
				+ compraKilo + ", ventaKilo=" + ventaKilo + "]";
	}
	
	public static boolean mismoCargamento(Cargamento c1,Cargamento c2) {
		if (c1.procedencia.equalsIgnoreCase(c2.procedencia))
			return true;
		return false;
	}
	
	public boolean mismoCargamento(Cargamento c) {
		if (this.procedencia.equalsIgnoreCase(c.procedencia))
			return true;
	    return false;
	}

	public String getProcedencia() {
		return procedencia;
	}
	
	
	
}
