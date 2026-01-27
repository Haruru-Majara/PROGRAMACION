package Ejercicio3;

public class Cargamento {
	private String nombre;
	private String procedencia;
	private int kilos;
	private double precioKilos;
	private double precioVenta;
	
	
	private static double beneficioTotal;
	
	
	public Cargamento(String nombre, String procedencia, int kilos, double precioKilos, double precioVenta) {
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.kilos = kilos;
		this.precioKilos = precioKilos;
		this.precioVenta = precioVenta;
	}


	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", procedencia=" + procedencia + ", kilos=" + kilos + ", precioKilos="
				+ precioKilos + ", precioVenta=" + precioVenta + "]";
	}
	
	public static double getBeneficioTotal() {
		return beneficioTotal;
	}


	public boolean rebajar (double precio) {
		if (this.precioVenta-precio < this.precioKilos)
			return false;
		this.precioKilos=precio;
		return true;
	}
	
	public double vender (int kilosVender) {
		if (kilosVender <= kilos) {
			kilos = kilos - kilosVender;
			
			double importeVenta = kilosVender * this.precioVenta;
			double coste = kilosVender * this.precioKilos;
			
			beneficioTotal = beneficioTotal + (importeVenta - coste);
			
			return importeVenta;
		}
		else {
			System.out.println("No hay suficientes kilos para vender");
			return -1;
		}

}
