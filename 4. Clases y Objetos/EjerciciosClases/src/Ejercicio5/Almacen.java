package Ejercicio5;

public class Almacen {
	private String nombre;
	private String procedencia;
	private double kilos;
	private double precioKilo;
	private double ventaKilo;
	
	
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
	
	public infoCargamento ()
}


