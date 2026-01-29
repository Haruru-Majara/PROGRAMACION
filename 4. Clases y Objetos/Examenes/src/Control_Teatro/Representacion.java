package Control_Teatro;

import java.time.LocalDate;

public class Representacion {
	private String codigo;
	private String titulo;
	private LocalDate fecha;
	private int entradasVip=15,entradasNormales=25;
	private double recaudacion;
	
	private static double totalRecaudado;
	
	public Representacion(String codigo, String titulo) {
		this.titulo = titulo;
		this.fecha = fecha;
	}
	
	
}
