package Ejercicio7;

public class Viaje {

	private String cOrigen;
	private String cDestino;
	private String codigo;
	
	private double importePersona;
	
	public static int contViaje=0;
	
	
	private int plazasTotales;
	private int plazasReservadas;

	private static double totalRecaudado = 0;
	

	public Viaje(String cOrigen, String cDestino, int plazasTotales, int plazasReservadas) {
		super();
		this.cOrigen = cOrigen;
		this.cDestino = cDestino;
		this.plazasTotales = plazasTotales;
		this.plazasReservadas = plazasReservadas;
	}

	public String crearCodigo() {
		String codigo = this.cOrigen.substring(0,2).toUpperCase() + this.cDestino.substring(0,2).toUpperCase() + contViaje;
		return codigo;
	}
	
	public double reservaPlazas(int numPlazas, int numNinos) {

		if (plazasReservadas + numPlazas > plazasTotales) {
			return 0; // No hay plazas suficientes
		}

		int adultos = numPlazas - numNinos;
		
		double importeAdultos = adultos * importePersona;
		double importeNinos = numNinos * importePersona * 0.8; // 20% descuento

		double totalReserva = importeAdultos + importeNinos;

		plazasReservadas += numPlazas;
		totalRecaudado += totalReserva;

		return totalReserva;
	}

	// 3. Modificar número de plazas
	
	public boolean modificarPlazas(int nuevasPlazas) {

		if (nuevasPlazas < plazasReservadas) {
			return false; // No se puede
		}

		plazasTotales = nuevasPlazas;
		return true;
	}

	// 4. toString
	@Override
	public String toString() {
		return "Viaje [Código=" + codigo +
			   ", Origen=" + cOrigen +
			   ", Destino=" + cDestino +
			   ", Plazas Totales=" + plazasTotales +
			   ", Plazas Reservadas=" + plazasReservadas +
			   ", Importe por persona=" + importePersona + "]";
	}

	// 5. Total recaudado por la agencia
	
	public static double getTotalRecaudado() {
		return totalRecaudado;
	}
}
