package Ejercicio3;

import java.util.Scanner;

public class MainAlmacen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Tamaño máximo del array:");
        int tam = sc.nextInt();

        CargamentoFruta [] cargamentos = new CargamentoFruta[tam];
        int num = 0;

        int opcion;

        do {
            System.out.println("\n------ MENÚ ------");
            System.out.println("1. Dar de alta cargamento");
            System.out.println("2. Mostrar todos");
            System.out.println("3. Rebajar cargamento");
            System.out.println("4. Vender");
            System.out.println("5. Mostrar beneficio total");
            System.out.println("6. Borrar cargamentos vacíos");
            System.out.println("7. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                // =========================
                // ALTA
                // =========================
                case 1:

                    if (num == cargamentos.length) {
                        System.out.println("Array lleno.");
                        break;
                    }

                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Procedencia:");
                    String proc = sc.nextLine();

                    System.out.println("Kilos:");
                    double kilos = sc.nextDouble();

                    System.out.println("Precio coste:");
                    double coste = sc.nextDouble();

                    System.out.println("Precio venta:");
                    double venta = sc.nextDouble();

                    cargamentos[num] = new CargamentoFruta(nombre, proc, kilos, coste, venta);

                    num++;
                    break;

                // =========================
                // MOSTRAR
                // =========================
                case 2:

                    for (int i = 0; i < num; i++) {
                        System.out.println(cargamentos[i].info());
                    }
                    break;

                // =========================
                // REBAJAR
                // =========================
                case 3:

                    System.out.println("Nombre:");
                    String n = sc.nextLine();

                    System.out.println("Procedencia:");
                    String p = sc.nextLine();

                    System.out.println("Cantidad rebaja:");
                    double rebaja = sc.nextDouble();

                    for (int i = 0; i < num; i++) {
                        if (cargamentos[i].getNombre().equalsIgnoreCase(n)
                                && cargamentos[i].getProcedencia().equalsIgnoreCase(p)) {

                            cargamentos[i].rebajar(rebaja);
                        }
                    }
                    break;

                // =========================
                // VENDER
                // =========================
                case 4:

                    System.out.println("Nombre fruta:");
                    String fruta = sc.nextLine();

                    System.out.println("Kilos a vender:");
                    double ventaKilos = sc.nextDouble();

                    boolean vendido = false;

                    for (int i = 0; i < num && !vendido; i++) {

                        if (cargamentos[i].getNombre().equalsIgnoreCase(fruta)) {

                            double importe = cargamentos[i].vender(ventaKilos);

                            if (importe != -1) {
                                System.out.println("Venta realizada. Importe: " + importe);
                                vendido = true;
                            }
                        }
                    }

                    if (!vendido)
                        System.out.println("No hay kilos suficientes.");

                    break;

                // =========================
                // BENEFICIO
                // =========================
                case 5:
                    System.out.println("Beneficio total: "+CargamentoFruta.getBeneficioTotal());
                    break;

                // =========================
                // BORRAR VACÍOS
                // =========================
                case 6:

                    for (int i = 0; i < num; i++) {

                        if (cargamentos[i].getKilos() == 0) {

                            for (int j = i; j < num - 1; j++) {
                                cargamentos[j] = cargamentos[j + 1];
                            }

                            num--;
                            i--;
                        }
                    }

                    break;

                case 7:
                    System.out.println("Fin.");
                    break;
            }

        } while (opcion != 7);
	}

}
