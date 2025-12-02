package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Programa que lee una cadena y un carácter y cuenta el número de veces que aparece dicho carácter en la cadena.*/

		 String cadena;
	        char caracter;
	        int contador;

	        // 🔹 Inicialización del Scanner
	        Scanner sc = new Scanner(System.in);

	        // 🔹 Entrada de datos
	        System.out.print("Introduce una cadena: ");
	        cadena = sc.nextLine();

	        System.out.print("Introduce un carácter a buscar: ");
	        caracter = sc.nextLine().charAt(0);

	        // 🔹 Llamada a la función
	        contador = contarCaracter(cadena, caracter);

	        // 🔹 Resultado
	        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");

	        sc.close();
	    }

	    // 🔹 Función que cuenta cuántas veces aparece un carácter
	    public static int contarCaracter(String cadena, char caracter) {
	        int contador = 0;

	        for (int i = 0; i < cadena.length(); i++) {
	            if (cadena.charAt(i) == caracter) {
	                contador++;
	            }
	        }

	        return contador;
	}

}
