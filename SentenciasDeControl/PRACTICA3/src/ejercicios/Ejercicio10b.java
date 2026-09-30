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
public class Ejercicio10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		char categoria;
		int seccion, dias, baja;
		double salario;

		System.out.println("¿Salario base?");
		salario = sc.nextDouble();
		sc.nextLine();
		System.out.println("¿A qué categoría perteneces?");
		categoria = sc.nextLine().charAt(0);
		
		if(categoria == 'A' || categoria == 'B') {
			salario=salario+240;
			System.out.println("Salario final: "+salario);
		}
		else
			if(categoria == 'C') {
				System.out.println("Anota sección");
				seccion=sc.nextInt();
				if(seccion!=1) {
					salario=salario+120;
				}else {
					System.out.println("Anota días trabajados: ");
					dias=sc.nextInt();
					System.out.println("Anota las bajas: ");
					baja=sc.nextInt();
					salario=salario+dias*0.5-baja*30;
				}
				System.out.println("Salario final: "+salario);
			}else //Estoy aqui porque la categoria es distinta de A, B y C
				System.out.println("Error, categoría incorrecta");

	}

}
