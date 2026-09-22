package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Una empresa tiene trabajadores de categorías A, B y C. Todos cobran un
 * salario base. Los de las categorías A y B cobran además un suplemento de 240
 * euros. En la categoría C, en la sección 1a están los contratados por días,
 * que cobran un suplemento de 0.5 € por día trabajado y se les descuenta 30 €
 * por baja injustificada. El resto de las secciones de esta categoría cobra
 * 120€ de suplemento. Programa que lee los datos de un trabajador y nos calcula
 * su sueldo final.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		char categoria;
		int seccion, dias, baja;
		final int supleAB = 240;
		final int supleCResto = 240;
		final double supleC1 = 0.5;
		double salario;

		System.out.println("¿A qué categoría perteneces?");
		categoria = sc.nextLine().charAt(0);

		if (categoria == 'c' || categoria == 'C') {
			System.out.println("¿A qué sección perteneces?");
			seccion = sc.nextInt();
			if (seccion == 1) {
				System.out.println("¿Salario base?");
				salario = sc.nextDouble();
				System.out.println("¿Por cuántos días te contratan?");
				dias = sc.nextInt();
				System.out.println("¿Cuántos días has estado de baja justificada?");
				baja = sc.nextInt();

				salario = salario + dias * supleC1;

				if (baja > 0) {
					salario = salario - baja * 30;
				}
				System.out.println(" ");
				System.out.println("El salario total es: " + salario);
			} else {
				System.out.println("¿Salario base?");
				salario = sc.nextDouble();
				salario = salario + supleCResto;
				System.out.println(" ");
				System.out.println("El salario total es: " + salario);

			}
		} else {
			System.out.println("¿Salario base?");
			salario = sc.nextDouble();
			salario = salario + supleAB;
			System.out.println(" ");
			System.out.println("El salario total es: " + salario);
		}

	}

}
