package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Programa que lee nombres de ciudades europeas y cuenta cuantas empiezan
		por una letra introducida por teclado*/
		
		int cont=0;
		String ciudad;
		char letra;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Anota una letra:");
		letra=sc.nextLine().charAt(0);
		letra=Character.toUpperCase(letra);
		
		for (int i = 1;i<=5;i++) {
			System.out.println("Anota una ciudad");
			ciudad=sc.nextLine();
			ciudad=ciudad.toUpperCase(); //Convertir ciudad a mayusculas
			
			if (ciudad.charAt(0)==letra)
				cont++;
		}
		
		System.out.println("Hay "+cont+" ciudades que empiezan por la letra "+letra);
	}

}
