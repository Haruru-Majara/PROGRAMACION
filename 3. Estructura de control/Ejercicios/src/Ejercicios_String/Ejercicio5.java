package Ejercicios_String;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Programa que lee tres cadenas y las escribe por orden alfabético, ignorando mayúsculas y minúsculas.*/

		 	String cadena1, cadena2, cadena3;
	        String[] cadenas;

	        // 🔹 Inicialización del Scanner
	        Scanner sc = new Scanner(System.in);

	        // 🔹 Entrada de datos
	        System.out.print("Introduce la primera cadena: ");
	        cadena1 = sc.nextLine();

	        System.out.print("Introduce la segunda cadena: ");
	        cadena2 = sc.nextLine();

	        System.out.print("Introduce la tercera cadena: ");
	        cadena3 = sc.nextLine();

	        // 🔹 Guardamos las cadenas en un array
	        cadenas = new String[]{cadena1, cadena2, cadena3};

	        // 🔹 Llamamos a la función que las ordena
	        ordenarCadenas(cadenas);

	        // 🔹 Mostramos el resultado
	        System.out.println("\nCadenas ordenadas alfabéticamente:");
	        for (String c : cadenas) {
	            System.out.println(c);
	        }

	        sc.close();
	    }

	    // 🔹 Función que ordena ignorando mayúsculas/minúsculas
	    public static void ordenarCadenas(String[] cadenas) {
	        // Usamos el método Arrays.sort con un comparador que ignora mayúsculas
	        Arrays.sort(cadenas, String::compareToIgnoreCase);
	}

}
