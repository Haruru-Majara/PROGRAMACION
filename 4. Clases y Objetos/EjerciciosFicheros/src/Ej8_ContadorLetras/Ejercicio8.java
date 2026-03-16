package Ej8_ContadorLetras;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Programa que lee un archivo y cuenta las veces que se repite una letra
		 * anotada desde teclado.
		 */
		Scanner sc = new Scanner(System.in);
		Path entrada = Paths.get("entrada.txt");
		InputStream istream = null;
		char letra;
		int cont = 0;
		int c;
		System.out.println("Introduce la letra que quieres contar");
		letra = sc.nextLine().charAt(0);
		try {
			istream = Files.newInputStream(entrada);
			while ((c = istream.read()) != -1) {
				// comparamos el caracter con la letra introducida
				if (c == letra) {
					cont++;
				}
			}
		} catch (IOException io) {
			System.err.println(io);
		}
		System.out.println("El numero de veces que   " + letra + "aparece,  son " + cont);

	}

}
