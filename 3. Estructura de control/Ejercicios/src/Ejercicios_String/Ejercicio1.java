package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Programa que lee cadenas hasta anotar “fin” y las muestra en mayúsculas.*/
		
		/*
		sc.nextLine() para leer cadenas completas
		.toUpperCase() para convertir a mayúsculas
		.equals("fin") para comparar strings
		*/
		
		String cadena;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Anota algo: ");
			cadena=sc.nextLine();
			System.out.println(cadena.toUpperCase());
			
		}while(!cadena.equals("fin") );
			
	}

}
