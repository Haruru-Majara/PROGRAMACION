package Hoja7;

import java.util.Scanner;

public class Ejercicio2b {

	public static void main(String[] args) {
		/*
		 * Programa que determina cuantas cifras tiene un número. Utilizar un método que
		 * recibe el números y nos retorna la cantidad de cifras que tiene
		 */

		int num, digitos;

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();

			calcularDigitos(num);
		}

		// System.out.println("El número: "+num+" tiene "+digitos+" dígitos.");
	}

	public static void calcularDigitos(int num) {
		int cont = 0;
		while (num != 0) {
			cont++;
			num = num / 10;
		}
		System.out.println(cont);

	}
}
