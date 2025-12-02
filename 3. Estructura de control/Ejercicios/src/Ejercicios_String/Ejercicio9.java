package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Programa que lee dos cadenas por teclado y calcula el número de veces que se repite
		la de menor longitud en la de mayor sustituyendo todas sus apariciones por
		mayúsculas.*/

		String cadena1, cadena2, larga, corta,cortaMayus;
		int  cont=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Anota la primera cadena: ");
		cadena1=sc.nextLine();
		System.out.println("Anota la segunda cadena: ");
		cadena2=sc.nextLine();
		 
		
		if (cadena1.length() > cadena2.length()) {
			larga=cadena1;
			corta=cadena2;
		}
		else {
			corta=cadena1;
			larga=cadena2;
		}
		cortaMayus=corta.toUpperCase();
		
		for (int i = larga.indexOf(corta); i!=-1; i=larga.indexOf(corta, i+ corta.length()))
			cont++;
		
		System.out.println("Se repite "+cont+" veces.");
	}

}
