package Hoja5;

import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un número: ");
			num = sc.nextInt();
			if (num != 0)
				if (num % 2 == 0)
				System.out.println("El número es par.");
				else 
				System.out.println("El número es impar.");
		} while (num != 0);
		System.out.println("El número dado es 0. Fin del programa.");
	}

}
