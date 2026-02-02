package Control_Teatro;

import java.time.LocalDate;

public class Representacion {
	private String codigo;
	private String titulo;
	private LocalDate fecha;
	private int eVip=15,eNormales=25;
	private double recaudacion;
	
	private static double totalRecaudado;
	
	public Representacion(String codigo, String titulo, LocalDate fecha) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.fecha = fecha;
	}

	public String getCodigo() {
		return codigo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double comprar (int vip, int normales) {
		
	}
	public boolean tieneEntradas() {
		
	}
	
}
