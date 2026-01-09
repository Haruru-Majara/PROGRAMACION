package Ejercicios_Arrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {

			do {
				System.out.println("Introduce número[" + i + "]=");
				numeros[i] = sc.nextInt();
				if (numeros[i] < 0) {

					System.out.println("solo se aceptan num positivos");
				}

			} while (numeros[i] < 0);
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] * numeros[i]);
		}
	}

}
