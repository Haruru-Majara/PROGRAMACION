package ejercicios;

import java.util.Scanner;

public class Ejercicio6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String palabra;

		System.out.println("Anota la palabra: ");
		palabra = sc.nextLine();

		if (palindromo(palabra))
			System.out.println("Es un palindromo");
		else
			System.out.println("No es un palíndromo");

	}

	public static boolean palindromo(String palabra) {
		palabra = palabra.toUpperCase();

		for (int i = 0, j = palabra.length() - 1; i < j; i++, j--) {
			if (palabra.charAt(i) != palabra.charAt(j))
				return false;
		}
		return true;
	}

}
