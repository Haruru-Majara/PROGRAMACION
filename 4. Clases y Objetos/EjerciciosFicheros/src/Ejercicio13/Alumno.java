package Ejercicio13;

import java.time.LocalDate;

public class Alumno {
	private String nombre;
	private String apellido;
	private double nota;
	private LocalDate fecha_nac;
	
	
	public Alumno(String nombre, String apellido, double nota, LocalDate fecha_nac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.fecha_nac = fecha_nac;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}
