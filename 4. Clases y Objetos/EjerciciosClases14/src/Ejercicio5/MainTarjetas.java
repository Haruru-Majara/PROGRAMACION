package Ejercicio5;

import java.util.Scanner;

public class MainTarjetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        Tarjeta[] tarjetas = new Tarjeta[10];
	        int numTarjetas = 0;

	        int opcion;

	        do {
	            System.out.println("\n--- MENÚ TARJETAS ---");
	            System.out.println("1. Dar de alta tarjeta");
	            System.out.println("2. Realizar pago");
	            System.out.println("3. Comparar titular y borrar más antigua");
	            System.out.println("4. Recargar tarjeta");
	            System.out.println("5. Bloquear / desbloquear tarjeta");
	            System.out.println("6. Mostrar información");
	            System.out.println("7. Mostrar número de tarjetas bloqueadas");
	            System.out.println("8. Salir");

	            opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {

	                // =====================
	                // DAR DE ALTA
	                // =====================
	                case 1:
	                    if (numTarjetas == tarjetas.length) {
	                        System.out.println("Array lleno.");
	                        break;
	                    }

	                    System.out.println("Número tarjeta:");
	                    String num = sc.nextLine();

	                    System.out.println("Titular:");
	                    String titular = sc.nextLine();

	                    System.out.println("Password:");
	                    String pass = sc.nextLine();

	                    System.out.println("Saldo inicial:");
	                    double saldo = sc.nextDouble();

	                    System.out.println("Año emisión:");
	                    int anio = sc.nextInt();
	                    sc.nextLine();

	                    tarjetas[numTarjetas++] = new Tarjeta(num, titular, pass, saldo, anio);
	                    break;

	                // =====================
	                // PAGAR
	                // =====================
	                case 2:
	                    System.out.println("Número tarjeta:");
	                    String numPago = sc.nextLine();
	                    try {
	                        int posPago = buscar(tarjetas, numPago, numTarjetas);

	                        System.out.println("Password:");
	                        String passPago = sc.nextLine();
	                        System.out.println("Importe:");
	                        double impPago = sc.nextDouble();
	                        sc.nextLine();

	                        boolean exito = tarjetas[posPago].pagar(passPago, impPago);
	                        if (exito)
	                            System.out.println("Pago realizado.");
	                        else
	                            System.out.println("Pago fallido.");

	                    } catch (Exception e) {
	                        System.out.println(e.getMessage());
	                    }
	                    break;

	                // =====================
	                // COMPARAR TITULAR Y BORRAR MÁS ANTIGUA
	                // =====================
	                case 3:
	                    System.out.println("Número tarjeta 1:");
	                    String t1 = sc.nextLine();
	                    System.out.println("Número tarjeta 2:");
	                    String t2 = sc.nextLine();

	                    try {
	                        int p1 = buscar(tarjetas, t1, numTarjetas);
	                        int p2 = buscar(tarjetas, t2, numTarjetas);

	                        if (tarjetas[p1].mismoTitular(tarjetas[p2])) {
	                            int borrar = tarjetas[p1].getAnioEmision() < tarjetas[p2].getAnioEmision() ? p1 : p2;

	                            for (int i = borrar; i < numTarjetas - 1; i++)
	                                tarjetas[i] = tarjetas[i + 1];

	                            numTarjetas--;
	                            System.out.println("Tarjeta más antigua borrada.");
	                        } else {
	                            System.out.println("No son del mismo titular.");
	                        }

	                    } catch (Exception e) {
	                        System.out.println(e.getMessage());
	                    }
	                    break;

	                // =====================
	                // RECARGAR
	                // =====================
	                case 4:
	                    System.out.println("Número tarjeta:");
	                    String tRec = sc.nextLine();
	                    System.out.println("Importe a recargar:");
	                    double impRec = sc.nextDouble();
	                    sc.nextLine();

	                    try {
	                        int posRec = buscar(tarjetas, tRec, numTarjetas);
	                        tarjetas[posRec].recargar(impRec);
	                        System.out.println("Recarga realizada.");
	                    } catch (Exception e) {
	                        System.out.println(e.getMessage());
	                    }
	                    break;

	                // =====================
	                // BLOQUEAR / DESBLOQUEAR
	                // =====================
	                case 5:
	                    System.out.println("Número tarjeta:");
	                    String tBloq = sc.nextLine();

	                    try {
	                        int posBloq = buscar(tarjetas, tBloq, numTarjetas);
	                        if (tarjetas[posBloq].isBloqueada()) {
	                            tarjetas[posBloq].desbloquear();
	                            System.out.println("Tarjeta desbloqueada.");
	                        } else {
	                            tarjetas[posBloq].bloquear();
	                            System.out.println("Tarjeta bloqueada.");
	                        }
	                    } catch (Exception e) {
	                        System.out.println(e.getMessage());
	                    }
	                    break;

	                // =====================
	                // MOSTRAR INFO
	                // =====================
	                case 6:
	                    for (int i = 0; i < numTarjetas; i++)
	                        System.out.println(tarjetas[i].info());
	                    break;

	                // =====================
	                // NUMERO BLOQUEADAS
	                // =====================
	                case 7:
	                    int bloqueadas = 0;
	                    for (int i = 0; i < numTarjetas; i++)
	                        if (tarjetas[i].isBloqueada()) bloqueadas++;
	                    System.out.println("Tarjetas bloqueadas: " + bloqueadas);
	                    break;

	                case 8:
	                    System.out.println("Fin.");
	                    break;

	                default:
	                    System.out.println("Opción no válida.");
	            }

	        } while (opcion != 8);
	    }

	    // =====================
	    // MÉTODO BUSCAR
	    // =====================
	    public static int buscar(Tarjeta[] t, String num, int n) throws Exception {
	        for (int i = 0; i < n; i++) {
	            if (t[i].getNumero().equals(num)) return i;
	        }
	        throw new Exception("Tarjeta no encontrada [TuNombre]");
	}

}
