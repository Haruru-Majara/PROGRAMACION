package Ejercicio8;

import java.time.LocalDate;

public class Tarjeta {

	private String numero;
	private String nombre;
	private  String clave;
	private double saldo;
	private int mes, año;
	

	
	public Tarjeta(String numero, String nombre, String clave, double saldo) {
		LocalDate hoy=LocalDate.now();
		
		this.numero = numero;
		this.nombre = nombre;
		this.clave = clave;
		this.saldo = saldo;
		
		this.mes = hoy.getMonthValue();
		this.año = hoy.getYear();
	}
	
	public boolean pagar(String password, double importe) {
		LocalDate hoy=LocalDate.now();
		int mes=hoy.getMonthValue();
		int año=hoy.getYear();
		if (año>this.año)
			return false;
		if (año==this.año && mes>this.mes)
			return false;
		if (!password.equalsIgnoreCase(this.clave))
			return false;
		if (importe>this.saldo)
			return false;
		this.saldo=this.saldo-importe;
		return true;
		
	}
	
}
