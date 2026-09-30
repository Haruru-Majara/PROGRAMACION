package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee una fecha y la valida
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int d, m, a;

		System.out.println("Dime un día: ");
		d = sc.nextInt();
		System.out.println("Dime un mes: ");
		m = sc.nextInt();
		System.out.println("Dime un año: ");
		a = sc.nextInt();
		
		System.out.println(" ");
		System.out.println("Fecha elegida: "+d+"/"+m+"/"+a);
		System.out.println(" ");
		
		if (a >= 1 && a <= 9999) {
			switch (m) {
			case 1:
			case 3:
			case 5:
			case 6:
			case 8:
			case 10:
			case 12:
				if (d <= 31)
					System.out.println("Fecha válida");
				else
					System.out.println("Enero, Marzo, Mayo, Junio, Agosto, Octubre y Diciembre no tienen más de 31 días");
				break;
			case 2:
				if ((a % 4 == 0 && a % 100 == 0 && a % 400 != 0) || a % 4 != 0) {
					if (d <= 28)
						System.out.println("Fecha válida");
					else
						System.out.println("En años no bisiestos, Febrero, no tiene más de 28 días.");
				} else {
					if (d <= 29)
						System.out.println("Fecha válida");
					else
						System.out.println("En años bisiestos, Febrero, no tiene más de 29 días.");
				}
				break;
			case 4:
			case 7:
			case 9:
			case 11:
				if (d <= 30)
					System.out.println("Fecha válida");
				else
					System.out.println("Abril, Julio, Septiembre y Noviembre.");
				break;
			default:
				System.out.println("Este mes no existe.");
			}
		} else
			System.out.println("Año incorrecto.");
	}

}
