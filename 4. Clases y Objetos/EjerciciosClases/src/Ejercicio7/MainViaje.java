package Ejercicio7;

public class MainViaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// 1. Crear dos viajes
		
				Viaje v1 = new Viaje("Madrid", "Paris", 10, 150);
				Viaje v2 = new Viaje("Sevilla", "Roma", 8, 180);

				// 2. Mostrar información inicial
				
				System.out.println("INFORMACIÓN INICIAL:");
				System.out.println(v1);
				System.out.println(v2);

				// 3. Reservar plazas
				
				System.out.println("\nRESERVAS:");
				System.out.println("Reserva v1: " + v1.reservaPlazas(4, 1) + " €");
				System.out.println("Reserva v2: " + v2.reservaPlazas(3, 0) + " €");

				// 4. Modificar número de plazas del primer viaje
				
				System.out.println("\nMODIFICACIÓN DE PLAZAS:");
				if (v1.modificarPlazas(12)) {
					System.out.println("Plazas modificadas correctamente");
				} else {
					System.out.println("No se pudieron modificar las plazas");
				}

				// 5. Mostrar información final
				
				System.out.println("\nINFORMACIÓN FINAL:");
				System.out.println(v1);
				System.out.println(v2);

				// 6. Mostrar total recaudado
				
				System.out.println("\nTOTAL RECAUDADO POR LA AGENCIA:");
				System.out.println(Viaje.getTotalRecaudado() + " €");
	}

}
