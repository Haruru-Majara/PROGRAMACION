package Ejercicio5;

public class Almacen {
	private String nombre;
	private String procedencia;
	private double kilos;
	private double precioKilo;
	private double ventaKilo;
	
	private static double beneficioTotal=0;
	
	public Almacen(String nombre, String procedencia, double kilos, double precioKilo, double ventaKilo) {
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.kilos = kilos;
		this.precioKilo = precioKilo;
		this.ventaKilo = ventaKilo;
	}


	public String getNombre() {
		return nombre;
	}


	public String getProcedencia() {
		return procedencia;
	}


	public double getKilos() {
		return kilos;
	}


	public double getPrecioKilo() {
		return precioKilo;
	}


	public double getVentaKilo() {
		return ventaKilo;
	}


	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", procedencia=" + procedencia + ", kilos=" + kilos + ", precioKilo="
				+ precioKilo + ", ventaKilo=" + ventaKilo + "]";
	}
	
	public boolean rebajar (double cantidad) {
		if (ventaKilo - cantidad < precioKilo) 
			return false;
		ventaKilo = cantidad;
		return true;
	}
	
	public double vender (double kilosVender) {
		if (kilosVender <= kilos) {
			kilos = kilos - kilosVender;
			
			double importeVenta = kilosVender * ventaKilo;
			double coste = kilosVender * precioKilo;
			
			beneficioTotal = beneficioTotal + (importeVenta - coste);
			
		
			return importeVenta;
		}
		else
			System.out.println("No hay suficientes kilos para vender");
		return -1;
	}


	public static double getBeneficioTotal() {
		return beneficioTotal;
	}
	
	public static boolean mismaProcedencia(Almacen c1, Almacen c2) {
		if (c1.procedencia.equalsIgnoreCase(c2.procedencia))
			return true;
		return false;
	}
}


