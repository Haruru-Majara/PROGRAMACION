package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		/*
		 * Programa que lee nombre y primer apellido de personas. Para cada una de ellas
		 * genera un código con la primera letra del nombre y las tres primeras del
		 * apellido. Si dicho apellido tiene una longitud inferior a 3, se le pide el
		 * segundo apellido y se cogen sus tres primeras letras. Si éste, también tiene
		 * menos longitud se genera el código con la primera del nombre y el apellido
		 * completo que sea más largo de los dos. El código se genera en una función.
		 */

		String nombre, apellido1, apellido2 = " ";
		int longitud = 3;
		boolean continuar = true;

		Scanner sc = new Scanner(System.in);

		do {
			nombre="";
			apellido1= "";
			System.out.println("Introduce tu nombre");
			nombre = sc.nextLine();

			System.out.println("Introduce tu primer apellido");
			apellido1 = sc.nextLine();

			if (apellido1.length() < longitud) {
				System.out.println("Introduce tu segundo apellido");
				apellido2 = sc.nextLine();
			}

			System.out.println("El código para tu nombre es: " + codigoNombre(nombre, apellido1, apellido2));

			System.out.println("¿Quieres continuar con otro? (True/False)");
			continuar = sc.nextBoolean();

			if (continuar == false)
				break;

		} while (continuar == true);

	}

	public static String codigoNombre(String nombre, String apellido1, String apellido2) {
		String codigo = "";

		codigo = codigo + nombre.charAt(0);

		if (apellido1.length() >= 3)
			codigo = codigo + apellido1.substring(0, 3);
		else if (apellido2.length() >= 3)
			codigo = codigo + apellido2.substring(0, 3);
		else if (apellido1.length() >= apellido2.length())
			codigo = codigo + apellido1;
		else
			codigo = codigo + apellido2;

		return codigo;

	}
}
