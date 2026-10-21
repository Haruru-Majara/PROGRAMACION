package examenBuclesEscritos;

/**
 * Realiza un programa en java que solicite al usuario que introduzca letras hasta que se escriba una
 * vocal mayúscula (A,E,I,O,U). Si la letra introducida es una vocal mayúscula se muestra un mensaje en pantalla,
 * al final se mostrara el numero total de letras introducidas.
 * */

import java.util.Scanner;

public class ejer3BucleDoWhileMario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char letra;
		int cont=0;
		
		do {
			System.out.println("Introduzca una letra, para terminar introduzca una vocal en mayuscula: ");
			letra=sc.nextLine().charAt(0);
			
			if(letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U') {
				System.out.println("Letra introducida mayúscula, fin del programa");
			}
			cont++;
			
		}while(letra!='A' && letra!='E' && letra!='I' && letra!='O' && letra!='U');
		
		System.out.println("Letras introducidas: "+cont);
	}

}
