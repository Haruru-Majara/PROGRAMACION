package Ej3_Banco;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc, opc2, opcTitulares;
		String nombre1, nombre2, nombre3;
		LinkedList<Cuenta> cuentas = new LinkedList<>();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("------MENÚ------");
			System.out.println("1.Dar de alta una cuenta.");
			System.out.println("2.Borrar todas las cuentas de un titular.");
			System.out.println("3.Información de cuenta.");
			System.out.println("4.Sorteo de viaje entre los cuentones.");
			System.out.println("5.Salir.");
			opc = sc.nextInt();

			switch (opc) {
			case 1:

				do {
					System.out.println("¿Cuántos titulares hay? (1, 2 o 3)");
					opcTitulares = sc.nextInt();
				} while (opcTitulares < 1 || opcTitulares > 3);
				
				HashSet<String> titulares=new HashSet<>();
				
				for (int i=1;i<=opcTitulares;i++) {
					sc.nextLine();
					System.out.println("Anota titular "+i+":");
					titulares.add(sc.nextLine());
					
				}
			//	C_Cuenton c =new C_Cuenton(titulares,1000);
			//	Cuenta c1=new Cuenta(titulares,500);
				/*
				 * System.out.println("¿Qué tipo de cuenta quieres abrir?");
				 * System.out.println("1.Cuenta normal"); System.out.println("2.Cuentón");
				 * opc2=sc.nextInt();
				 * 
				 * if (opc2 == 1) {
				 */
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Elija otra opción");
			}
		} while (opc != 5);
	}

}
