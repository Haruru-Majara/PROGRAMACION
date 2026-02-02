package NuevoTeatro;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class MainRepresentaciones {

	static Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Representacion[] representaciones = new Representacion[10];
	        int numRep = 0;
	        int opcion;

	        do {
	            System.out.println("\n-------- MENÚ --------");
	            System.out.println("1. Dar de alta una representación");
	            System.out.println("2. Ordenar representaciones por fecha");
	            System.out.println("3. Mostrar con entradas libres");
	            System.out.println("4. Comprar entradas");
	            System.out.println("5. Mostrar total recaudado");
	            System.out.println("6. Salir");

	            opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {

	                // =========================
	                // 1 ALTA
	                // =========================
	                case 1:

	                    if (numRep == representaciones.length) {
	                        System.out.println("Array lleno.");
	                        break;
	                    }

	                    System.out.println("Título:");
	                    String titulo = sc.nextLine();

	                    System.out.println("Día:");
	                    int dia = sc.nextInt();
	                    System.out.println("Mes:");
	                    int mes = sc.nextInt();
	                    System.out.println("Año:");
	                    int anio = sc.nextInt();

	                    try {
	                        LocalDate fecha = LocalDate.of(anio, mes, dia);

	                        // comprobar fecha repetida
	                        boolean repetida = false;
	                        for (int i = 0; i < numRep; i++) {
	                            if (representaciones[i].getFecha().equals(fecha)) {
	                                repetida = true;
	                            }
	                        }

	                        if (repetida) {
	                            System.out.println("Ya existe una obra ese día.");
	                            break;
	                        }

	                        String codigo = titulo.substring(0, 3).toUpperCase() +
	                                "-" + String.format("%02d%02d", mes, dia);

	                        representaciones[numRep] =
	                                new Representacion(codigo, titulo, fecha);

	                        numRep++;

	                        System.out.println("Añadida correctamente.");

	                    } catch (Exception e) {
	                        System.out.println("Fecha incorrecta.");
	                    }

	                    break;

	                // =========================
	                // 2 ORDENAR
	                // =========================
	                case 2:

	                    for (int i = 0; i < numRep - 1; i++) {
	                        for (int j = i + 1; j < numRep; j++) {
	                            if (representaciones[i].getFecha()
	                                    .isAfter(representaciones[j].getFecha())) {

	                                Representacion aux = representaciones[i];
	                                representaciones[i] = representaciones[j];
	                                representaciones[j] = aux;
	                            }
	                        }
	                    }

	                    System.out.println("Ordenadas.");
	                    break;

	                // =========================
	                // 3 MOSTRAR LIBRES
	                // =========================
	                case 3:

	                    for (int i = 0; i < numRep; i++) {
	                        if (representaciones[i].tieneEntradas()) {
	                            System.out.println(representaciones[i]);
	                        }
	                    }

	                    break;

	                // =========================
	                // 4 COMPRAR
	                // =========================
	                case 4:

	                    System.out.println("Código de la obra:");
	                    String cod = sc.nextLine();

	                    Representacion r = null;

	                    for (int i = 0; i < numRep; i++) {
	                        if (representaciones[i].getCodigo().equals(cod)) {
	                            r = representaciones[i];
	                        }
	                    }

	                    if (r == null) {
	                        System.out.println("No existe.");
	                        break;
	                    }

	                    Random rand = new Random();

	                    int vip = rand.nextInt(4);
	                    int normales = rand.nextInt(4);

	                    while (vip + normales > 5) {
	                        vip = rand.nextInt(4);
	                        normales = rand.nextInt(4);
	                    }

	                    double importe = r.comprar(vip, normales);

	                    if (importe == 0) {
	                        System.out.println("No hay suficientes entradas.");
	                    } else {
	                        System.out.println("Compradas: VIP " + vip +
	                                " Normales " + normales);
	                        System.out.println("Importe: " + importe);
	                        r.elegirAsientos(vip + normales, sc);
	                    }

	                    break;

	                // =========================
	                case 5:
	                    System.out.println("Total recaudado: "
	                            + Representacion.getTotalRecaudado());
	                    break;

	                case 6:
	                    System.out.println("Fin.");
	                    break;
	            }

	        } while (opcion != 6);
	}

}
