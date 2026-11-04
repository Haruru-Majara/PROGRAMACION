package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee una cadena y un carácter y cuenta el número de veces que
 * aparece dicho carácter en la cadena.
 * */

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String cadena;
		char letra;
		int cont=0;
		
		System.out.println("Escribe algo: ");
		cadena=sc.nextLine().toUpperCase();
		
		System.out.println("Escribe una letra: ");
		letra=Character.toUpperCase(sc.nextLine().charAt(0));
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==letra)
				cont++;
		}
		
		System.out.println("En la cadena: "+cadena);
		System.out.println("La letra "+letra+" ha aparecido "+cont+" veces.");
	}

}
