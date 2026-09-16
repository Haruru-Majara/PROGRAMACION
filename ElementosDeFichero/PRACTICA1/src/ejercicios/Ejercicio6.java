package ejercicios;

import java.util.Locale;

/**
 * Programa en el que declaramos las variables edad, estudios, ingresos (decidir cuál 
 * es el tipo de dato más adecuado para cada una) y les damos una valor. Almacenar
 * en una variable booleana jasp el valor:
 * Verdadero si la edad es inferior a 28, el nivel de estudios es mayor que tres y los
 * ingresos superan los 28.000 €
 * 
 * Falso en caso contrario
 * 
 * */

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		int edad, estudios;
		double ingresos;
		boolean jasp;
		
		System.out.println("Dime tu edad: ");
		edad =sc.nextInt();
		System.out.println("Dime nivel de estudios (entre 1 y 4): ");
		estudios =sc.nextInt();
		System.out.println("Dime tus ingresos: ");
		ingresos =sc.nextDouble();
		
		jasp=(edad<28) && (estudios>3) && (ingresos>28000);
		
		System.out.println("¿Se considera apto?: "+jasp);
	}

}
