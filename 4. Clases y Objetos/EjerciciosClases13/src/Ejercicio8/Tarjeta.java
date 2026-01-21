package Ejercicio8;

import java.time.LocalDate;

public class Tarjeta {

	private String numero;
	private String nombre;
	private  String clave;
	private double saldo;
	private int mes, año;
	private boolean bloqueada=false;

	public static int operacionesTotales=0;
	
	public Tarjeta(String numero, String nombre, String clave, double saldo) {
		LocalDate hoy=LocalDate.now().plusYears(5);
		
		this.numero = numero;
		this.nombre = nombre;
		if (!clave.matches("[0-9]{4}"))
				throw.new
		this.clave = clave;
		this.saldo = saldo;
		
		this.mes = hoy.getMonthValue();
		this.año = hoy.getYear();
	}
	
	public boolean pagar(String password, double importe) {
		LocalDate hoy=LocalDate.now();
		int mes=hoy.getMonthValue();
		int año=hoy.getYear();
		if (this.bloqueada)
			return false;
		if (año>this.año)
			return false;
		if (año==this.año && mes>this.mes)
			return false;
		if (!password.equalsIgnoreCase(this.clave))
			return false;
		if (importe>this.saldo)
			return false;
	
		this.saldo=this.saldo-importe;
		operacionesTotales+=1;
		return true;
		
	}
	public boolean recargar (double recarga) {
		if (this.bloqueada)
			return false;
		if (recarga >0) {
			this.saldo=this.saldo+recarga;
			operacionesTotales+=1;
			return true;
		}
		return false;
	}
	public boolean bloquear () {
		if (this.bloqueada==false) {
			this.bloqueada=true;
			return true;
		}
		else 
			return false;
	}
	public boolean desbloquear () {
		if (this.bloqueada==true) {
			this.bloqueada=false;
			return true;
		}
		else 
			return false;
	}

	@Override
	public String toString() {
		return "Tarjeta [numero=" + numero + ", nombre=" + nombre + ", clave=" + "*****" + ", saldo=" + saldo + ", mes="
				+ mes + ", año=" + año + "]";
	}
	
	public boolean mismaTarjeta(Tarjeta t) {
		if (this.numero.equals(t.numero) && this.nombre.equalsIgnoreCase(t.nombre)) 
			return true;
		else
			return false;
	}
	
	
}
