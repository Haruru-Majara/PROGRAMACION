package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que lee como datos de entrada una fecha expresada en día (del 1 al
 * 31), mes (del 1 al 12) y año (en número) y nos dice la fecha que será al día
 * siguiente.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		int dia, mes, año;

		System.out.println("Día: ");
		dia = sc.nextInt();
		System.out.println("Mes: ");
		mes = sc.nextInt();
		System.out.println("Año: ");
		año = sc.nextInt();

		System.out.println(" ");
		System.out.println("La fecha es: ");
		System.out.println(" ");

		switch (mes) {
		case 1, 3, 5, 6, 8, 10, 12:
			if (dia < 31) {
				dia++;
				System.out.println(dia + "/" + mes + "/" + año);
			} else {
				if (mes < 12 && dia == 31) {
					dia = 1;
					mes++;
					System.out.println(dia + "/" + mes + "/" + año);
				} else {
					if (mes == 12 && dia == 31) {
						dia = 1;
						mes = 1;
						año++;
						System.out.println(dia + "/" + mes + "/" + año);
					} else {
						System.out.println("Ningún mes tiene más de 31 días!");
					}
				}
			}
			break;
		case 2:
			if (dia < 28) {
				dia++;
				System.out.println(dia + "/" + mes + "/" + año);
			} else {
				if (dia == 28) {
					dia = 1;
					mes++;
					System.out.println(dia + "/" + mes + "/" + año);
				} else {
					System.out.println("Febrero no tiene más de 28 días!");
				}
			}
			break;
		case 4, 7, 9, 11:
			if(dia<30) {
				dia++;
				System.out.println(dia + "/" + mes + "/" + año);
			}else {
				if(dia==30) {
					dia=1;
					mes=1;
					System.out.println(dia + "/" + mes + "/" + año);
				}else {
					System.out.println("Estos meses no tienen más de 30 días!");
				}
			}
			break;
		default:
			System.out.println("¡No hay más que 12 meses!");
		}

	}

}
