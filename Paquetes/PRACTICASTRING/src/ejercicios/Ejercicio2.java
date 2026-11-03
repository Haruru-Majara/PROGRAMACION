package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee nombres de ciudades europeas y cuenta cuantas empiezan
 * por una letra introducida por teclado
 * */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char letraPais,continuar;
		String ciudades;
		int cont=0;
		
		System.out.println("Anota una letra: ");
		letraPais=sc.nextLine().charAt(0);
		
		do {
			System.out.println("Anota nombres de ciudades: ");
			ciudades=sc.nextLine();
			
			if(ciudades.charAt(0)==letraPais)
				cont++;
			
			System.out.println("Otra ciudad?");
			continuar=Character.toUpperCase(sc.nextLine().charAt(0));
			
		}while(continuar=='S');
		System.out.println("Ciudades que empiezan por "+letraPais+": "+cont);
	}

}
