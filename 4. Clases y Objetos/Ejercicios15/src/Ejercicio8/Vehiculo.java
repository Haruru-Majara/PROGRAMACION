package Ejercicio8;

public class Vehiculo {
	private String matricula;
	private String modelo;
	private String marca;
	private int año;
	private int categoria;
	private boolean alquilado;
	private double ganancias;
	
	private static int totalAlquilados;
	private static double gananciasTotales=0;
	
	
	public Vehiculo(String matricula, String modelo, String marca, int año, int categoria) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.año = año;
		this.categoria = categoria;
	}


	public double alquilarVehiculo(int dias) {
		double precioDia;
		double total;
		if (alquilado)
			return 0;
		if (categoria==1) {
			if (dias<=2)
				precioDia=45;
			else
				precioDia=30;
		}
		else
		{
			if (dias<=2)
				precioDia=50;
			else
				precioDia=40;
		}
		
		total=precioDia*dias;
		alquilado=true;
		gananciasTotales+=total;
		ganancias+=total;
		totalAlquilados++;
		return total;
	}
	
	public boolean devolver() {
		if (!alquilado)
			return false;
		alquilado=false;
		totalAlquilados--;
		return true;
	}


	public boolean isAlquilado() {
		return alquilado;
	}


	public double getGanancias() {
		return ganancias;
	}


	public static double getGananciasTotales() {
		return gananciasTotales;
	}


	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", año=" + año
				+ ", categoria=" + categoria + ", alquilado=" + alquilado + ", ganancias=" + ganancias + "]";
	}


	public String getMatricula() {
		return matricula;
	}


	public static int getTotalAlquilados() {
		return totalAlquilados;
	}
	
}
