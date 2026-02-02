package Ejercicio3;

public class CargamentoFruta {

	 private String nombre;
	    private String procedencia;
	    private double kilos;
	    private double precioCoste;
	    private double precioVenta;

	    private static double beneficioTotal = 0;

	    // =========================
	    // CONSTRUCTOR
	    // =========================
	    public CargamentoFruta(String nombre, String procedencia, double kilos, double precioCoste, double precioVenta) {

	        this.nombre = nombre;
	        this.procedencia = procedencia;
	        this.kilos = kilos;
	        this.precioCoste = precioCoste;
	        this.precioVenta = precioVenta;
	    }

	    // =========================
	    // INFORMACIÓN
	    // =========================
	    public String info() {
	        return "Fruta: " + nombre +
	                " | Procedencia: " + procedencia +
	                " | Kilos: " + kilos +
	                " | Coste: " + precioCoste +
	                " | Venta: " + precioVenta;
	    }

	    // =========================
	    // REBAJAR
	    // =========================
	    public void rebajar(double cantidad) {

	        precioVenta -= cantidad;

	        if (precioVenta < precioCoste) {
	            precioVenta = precioCoste;
	        }
	    }

	    // =========================
	    // VENDER
	    // =========================
	    public double vender(double kilosVenta) {

	        if (kilosVenta > kilos) {
	            return -1; // error
	        }

	        kilos -= kilosVenta;

	        double beneficio = (precioVenta - precioCoste) * kilosVenta;
	        beneficioTotal += beneficio;

	        return kilosVenta * precioVenta;
	    }

	    // =========================
	    // MISMA PROCEDENCIA
	    // =========================
	    public boolean mismaProcedencia(CargamentoFruta otro) {
	        return this.procedencia.equalsIgnoreCase(otro.procedencia);
	    }

	    // =========================
	    // GETTERS
	    // =========================
	    public String getNombre() {
	        return nombre;
	    }

	    public String getProcedencia() {
	        return procedencia;
	    }

	    public double getKilos() {
	        return kilos;
	    }

	    public static double getBeneficioTotal() {
	        return beneficioTotal;
	    }
}
