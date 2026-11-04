package ejercicios;

import java.util.Scanner;

/**
 * Programa que dadas dos cadenas nos dice si la menor está contenida en la
 * mayor y si es así nos dice la posición en la cual la ha encontrado.
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String cad1, cad2;

		int pos;

		System.out.println("Introduce cadena 1: ");
		cad1 = sc.nextLine().toUpperCase();

		System.out.println("Introduce cadena 2: ");
		cad2 = sc.nextLine().toUpperCase();

		if (cad1.length() > cad2.length()) {
			System.out.println(cad1 + " es la mayor de las dos cadenas.");
			pos = cad1.indexOf(cad2);
			if (cad1.indexOf(cad2) >= 0)
				System.out.println("Se ha encontrado " + cad2 + " en la posición " + pos);
			else
				System.out.println("No se ha encontrado la cadena.");
		} else {
			System.out.println(cad2 + " es la mayor de las dos cadenas");
			pos = cad2.indexOf(cad1);
			if (cad2.indexOf(cad1) >= 0)
				System.out.println("Se ha encontrado " + cad1 + " en la posición " + pos);
			else
				System.out.println("No se ha encontrado la cadena.");
		}
	}

}
