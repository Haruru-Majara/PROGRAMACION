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
	
	public static boolean mismoCargamento(Cargamento c1,Cargamento c2) { //Aqui es static porque quiero usarlo para varios
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
	
	public boolean rebajar(double rebaja) {
		double precioFinal;
		if (this.ventaKilo<this.compraKilo)
			return false;
		if (this.ventaKilo<rebaja)
			return false;
		precioFinal=this.ventaKilo-rebaja;
		return true;
	}
	
	public double vender(int kilosVender) {
		double importe;
		if (kilosVender>this.kilos)
			return 0;
		importe=kilosVender*this.ventaKilo;
		this.kilos-=kilosVender;
		beneficioTotal=beneficioTotal+importe;
		return importe;
	}

	public int getKilos() {
		return kilos;
	}

	public static double getBeneficioTotal() {
		return beneficioTotal;
	}
	
	
}
