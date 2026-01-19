package Ejercicio7;

public class Agencia {

	private String cOrigen;
	private String cDestino;
	private String codigo;
	private int plazas;
	private double importePersona;
	
	public static int contViaje=0;
	
	
	public Agencia(String cOrigen, String cDestino, String codigo, int plazas, double importePersona) {
		this.cOrigen = cOrigen;
		this.cDestino = cDestino;
		this.codigo = codigo;
		this.plazas = plazas;
		this.importePersona = importePersona;
	}

	public String crearCodigo() {
		String codigo = this.cOrigen.substring(0,2).toUpperCase() + this.cDestino.substring(0,2).toUpperCase() + contViaje;
		return codigo;
	}
	
	public double reservaPlazas (int p) {
		
	}
	
}
