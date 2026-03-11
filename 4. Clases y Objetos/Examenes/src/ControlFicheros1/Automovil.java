package ControlFicheros1;

import java.time.LocalDate;

public class Automovil {
	private String matricula;
	private LocalDate fechaCompra;
	private double precio;
	private String dniPropietario;
	
	public Automovil(String matricula, LocalDate fechaCompra, double precio, String dniPropietario) {
		this.matricula = matricula;
		this.fechaCompra = fechaCompra;
		this.precio = precio;
		this.dniPropietario = dniPropietario;
	}

	public String getDniPropietario() {
		return dniPropietario;
	}

	@Override
	public String toString() {
		return matricula + "," + fechaCompra + "," + precio
				+ "," + dniPropietario;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public double getPrecio() {
		return precio;
	}
		
}
