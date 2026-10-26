package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee fechas en formato dd( 1 al 31), mm ( 1 a 12) y aa (4
 * dígitos) y obtiene el número de orden del día en el total del año.
 * 
 * Ejemplo:
 * 
 * 3 de Febrero ............ día 34
 * 
 * Leer tantas fechas como el usuario quiera, utilizar un método que recibe dd ,
 * mm aa y retorna un entero.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int dia, mes, año, diaAño;
		boolean seguir, fechaCorrecta;

		do {
			do {
				System.out.println("Introduce dia: ");
				dia = sc.nextInt();
				System.out.println("Introduce mes: ");
				mes = sc.nextInt();
				System.out.println("Introduce año: ");
				año = sc.nextInt();

				fechaCorrecta = validarFecha(dia, mes, año);

				if (fechaCorrecta == false)
					System.out.println("Algo ha ido mal, introduce de nuevo la fecha.");

				System.out.println(" ");
			} while (fechaCorrecta == false);

			diaAño = diaDelAño(dia, mes, año);

			System.out.println("El " + dia + " del " + mes + " fue/es/será el día " + diaAño + " del año " + año);

			System.out.println(" ");
			System.out.println("¿Otra fecha?");
			seguir = sc.nextBoolean();
		} while (seguir == true);
	}

	public static boolean validarFecha(int d, int m, int a) {
		boolean bisiesto;
		if (a >= 1000) {
			if (m <= 12) {
				switch (m) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (d <= 31)
						return true;
					else
						return false;
				case 4:
				case 6:
				case 9:
				case 11:
					if (d <= 30)
						return true;
					else
						return false;
				case 2:
					if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
						bisiesto = true;
					else
						bisiesto = false;

					if (bisiesto == false) {
						if (d <= 28)
							return true;
						else
							return false;
					} else {
						if (d <= 29)
							return true;
						else
							return false;
					}
				default:
					return false;
				}
			} else
				return false;
		} else
			return false;
	}

	public static int diaDelAño(int d, int m, int a) {
		int total = 0, diasFebrero = 0;

		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
			diasFebrero = 29;
		else
			diasFebrero = 28;

		switch (m) {
		case 1:
			total = d;
			break;
		case 2:
			total = 31 + d;
			break;
		case 3:
			total = 31 + diasFebrero + d;
			break;
		case 4:
			total = 31 + diasFebrero + 31 + d;
			break;
		case 5:
			total = 31 + diasFebrero + 31 + 30 + d;
			break;
		case 6:
			total = 31 + diasFebrero + 31 + 30 + 31 + d;
			break;
		case 7:
			total = 31 + diasFebrero + 31 + 30 + 31 + 30 + d;
			break;
		case 8:
			total = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + d;
			break;
		case 9:
			total = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + 31 + d;
			break;
		case 10:
			total = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
			break;
		case 11:
			total = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
			break;
		case 12:
			total = 31 + diasFebrero + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
			break;
		}
		return total;
	}
}
