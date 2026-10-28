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

public class Ejercicio6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int dia, mes, año, diaAño;
		boolean fechaCorrecta;
		char otra;
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

			nombreMes(dia,mes,diaAño,año);

			System.out.println(" ");
			System.out.println("¿Otra fecha? (S/N)");
			sc.nextLine();
			otra=sc.nextLine().charAt(0);
			otra=Character.toUpperCase(otra);
			
			diaAño=0;
		} while (otra == 'S');
	}

	public static void nombreMes(int d,int m, int dA, int a) {
		switch(m) {
		case 1:
			System.out.println("El " + d + " de Enero fue/es/será el día " + dA + " del año " + a);
			break;
		case 2:
			System.out.println("El " + d + " de Febrero fue/es/será el día " + dA + " del año " + a);
			break;
		case 3:
			System.out.println("El " + d + " de Marzo fue/es/será el día " + dA + " del año " + a);
			break;
		case 4:
			System.out.println("El " + d + " de Abril fue/es/será el día " + dA + " del año " + a);
			break;
		case 5:
			System.out.println("El " + d + " de Mayo fue/es/será el día " + dA + " del año " + a);
			break;
		case 6:
			System.out.println("El " + d + " de Junio fue/es/será el día " + dA + " del año " + a);
			break;
		case 7:
			System.out.println("El " + d + " de Julio fue/es/será el día " + dA + " del año " + a);
			break;
		case 8:
			System.out.println("El " + d + " de Agosto fue/es/será el día " + dA + " del año " + a);
			break;
		case 9:
			System.out.println("El " + d + " de Septiembre fue/es/será el día " + dA + " del año " + a);
			break;
		case 10:
			System.out.println("El " + d + " de Octubre fue/es/será el día " + dA + " del año " + a);
			break;
		case 11:
			System.out.println("El " + d + " de Noviembre fue/es/será el día " + dA + " del año " + a);
			break;
		case 12:
			System.out.println("El " + d + " de Diciembre fue/es/será el día " + dA + " del año " + a);
			break;
		}
	}
	public static boolean validarFecha(int d, int m, int a) {
		boolean bisiesto=esBisiesto(a);
		if (a >= 1000) {
			if (m <= 12) {
				switch (m) {
				case 1,3,5,7,8,10,12:
					if (d>=1 || d <= 31)
						return true;
					else
						return false;
				case 4,6,9,11:
					if (d>=1 || d <= 30)
						return true;
					else
						return false;
				case 2:
					if (bisiesto == false) {
						if (d>=1 || d <= 28)
							return true;
						else
							return false;
					} else {
						if (d>=1 || d <= 29)
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
	
	public static boolean esBisiesto(int a) {
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
			return true;
		return false;
	}
	
	public static int diasMes(int m,int a) {
		boolean bisiesto=esBisiesto(a);
		switch (m) {
		case 1,3,5,7,8,10:
			return 31;
		case 4,6,9,11:
			return 30;
		case 2:
			if(bisiesto==true)
				return 29;
			else
				return 28;
		default:
			return 0;
		}
	}

	public static int diaDelAño(int d, int m, int a) {
		int total=0,dias;
		for(int i=1;i<m;i++) {
			dias=diasMes(i,a);
			total=total+dias;
		}
		total=total+d;
		return total;
	}
}
