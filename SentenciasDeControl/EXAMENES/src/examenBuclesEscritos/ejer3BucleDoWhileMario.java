package examenBuclesEscritos;

import java.util.Scanner;

public class ejer3BucleDoWhileMario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char letra;
		int cont=0;
		
		do {
			System.out.println("Introduzca una vocal, para terminar introduzca una vocal en mayuscula: ");
			letra=sc.nextLine().charAt(0);
			
			if(letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U') {
				System.out.println("Letra introducida mayúscula, fin del programa");
			}
			cont++;
			
		}while(letra!='A' && letra!='E' && letra!='I' && letra!='O' && letra!='U');
		
		System.out.println("Letras introducidas: "+cont);
	}

}
