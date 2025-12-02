package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Programa que nos dice si una palabra se lee igual del derecho que del revés.*/

		 String palabra;
	        boolean esPalindromo;

	        // 🔹 Inicialización del Scanner
	        Scanner sc = new Scanner(System.in);

	        // 🔹 Entrada de datos
	        System.out.print("Introduce una palabra: ");
	        palabra = sc.nextLine();

	        // 🔹 Llamada a la función que comprueba si es palíndromo
	        esPalindromo = comprobarPalindromo(palabra);

	        // 🔹 Resultado
	        if (esPalindromo)
	            System.out.println("✅ La palabra '" + palabra + "' se lee igual del derecho y del revés.");
	        else
	            System.out.println("❌ La palabra '" + palabra + "' NO es un palíndromo.");

	        sc.close();
	    }

	    // 🔹 Función que comprueba si una palabra es palíndroma
	    public static boolean comprobarPalindromo(String palabra) {
	        palabra = palabra.toLowerCase(); // ignorar mayúsculas
	        String invertida = "";

	        // Invertimos la palabra carácter a carácter
	        for (int i = palabra.length() - 1; i >= 0; i--) {
	            invertida += palabra.charAt(i);
	        }

	        // Comparamos original e invertida
	        return palabra.equals(invertida);
	}

}
