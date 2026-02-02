package Ejercicio4;

import java.util.Scanner;

public class MainLiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        Equipo[] equipos = new Equipo[10];

	        // Inicializamos equipos con nombres de ejemplo
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Nombre del equipo " + (i + 1) + ":");
	            String nombre = sc.nextLine();
	            equipos[i] = new Equipo(nombre);
	        }

	        int opcion;

	        do {
	            System.out.println("\n--- MENÚ LIGA ---");
	            System.out.println("1. Anotar partido");
	            System.out.println("2. Ordenar equipos por puntos");
	            System.out.println("3. Mostrar información de equipos");
	            System.out.println("4. Salir");

	            opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {

	                // =========================
	                // ANOTAR PARTIDO
	                // =========================
	                case 1:
	                    System.out.println("Nombre equipo 1:");
	                    String eq1 = sc.nextLine();
	                    System.out.println("Nombre equipo 2:");
	                    String eq2 = sc.nextLine();
	                    System.out.println("Goles equipo 1:");
	                    int g1 = sc.nextInt();
	                    System.out.println("Goles equipo 2:");
	                    int g2 = sc.nextInt();
	                    sc.nextLine();

	                    Equipo e1 = null, e2 = null;

	                    for (int i = 0; i < equipos.length; i++) {
	                        if (equipos[i].getNombre().equalsIgnoreCase(eq1)) e1 = equipos[i];
	                        if (equipos[i].getNombre().equalsIgnoreCase(eq2)) e2 = equipos[i];
	                    }

	                    if (e1 != null && e2 != null) {
	                        e1.registrarPartido(g1, g2);
	                        e2.registrarPartido(g2, g1);
	                        System.out.println("Partido registrado.");
	                    } else {
	                        System.out.println("Uno de los equipos no existe.");
	                    }

	                    break;

	                // =========================
	                // ORDENAR POR PUNTOS
	                // =========================
	                case 2:
	                    for (int i = 0; i < equipos.length - 1; i++) {
	                        for (int j = i + 1; j < equipos.length; j++) {
	                            if (equipos[i].getPuntos() < equipos[j].getPuntos()) {
	                                Equipo aux = equipos[i];
	                                equipos[i] = equipos[j];
	                                equipos[j] = aux;
	                            }
	                        }
	                    }
	                    System.out.println("Equipos ordenados por puntos.");
	                    break;

	                // =========================
	                // MOSTRAR INFORMACIÓN
	                // =========================
	                case 3:
	                    for (int i = 0; i < equipos.length; i++) {
	                        System.out.println(equipos[i].info());
	                    }
	                    break;

	                case 4:
	                    System.out.println("Fin del programa.");
	                    break;

	                default:
	                    System.out.println("Opción no válida.");
	            }

	        } while (opcion != 4);
	}

}
