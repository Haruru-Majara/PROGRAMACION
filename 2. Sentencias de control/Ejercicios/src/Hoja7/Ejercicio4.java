package Hoja7;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, factorial;
		boolean continuar = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número para saber su factorial: ");
		num = sc.nextInt();

		while (continuar) {
			if (num <= 0)
				System.out.println("ERROR. Número introducido es 0 o negativo.");
			else {

				factorial = calcularFactorial(num);
				System.out.println("El factorial de " + num + " es " + factorial);
			}
			System.out.println("¿Quieres saber el factorial de otro número?");
			continuar = sc.nextBoolean();
			if (continuar == false) {
				System.out.println("Fin del programa.");
				System.exit(0);
			}
			System.out.println("Introduce un número para saber su factorial: ");
			num = sc.nextInt();
		}
	}

	public static int calcularFactorial(int num) {
		int total = 1;
		for (int i = num; i > 0; i--) {
			total = total * i;
		}
		return total;
	}
}
