package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio6b {

	public static void main(String[] args) {
		// Programa que nos dice si una palabra se lee igual del derecho que del revés.
		String palabra;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe una palabra que se lea igual al derecho que del revés");
		palabra=sc.nextLine();
		
		if (validarPalabra(palabra)==true)
			System.out.println("Se lee igual");
		else
			System.out.println("No se lee igual");
	}
	public static boolean validarPalabra (String palabra) {
		for (int i=0, j=palabra.length()-1;i<j;i++,j--) {
			if (palabra.charAt(i)!=palabra.charAt(j))
				return false;
		}
		return true;
	}
}
