package examenBucles21102026;

import java.util.Scanner;

/**
 * Lee letras de teclado hasta que anoten una vocal (en mayusculas) y mostrar al finalizar el total de 
 * letras leidas
 * */

public class ejer2While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char letra;
		int cont=1;
		
		System.out.println("Anota letra: ");
		letra=sc.nextLine().charAt(0);
		
		while(letra!='A' && letra!='E' && letra!='I' && letra!='O' && letra!='U') {
			System.out.println("Anota otra letra: ");
			letra=sc.nextLine().charAt(0);
			cont++;
		}
		System.out.println("Se han leido: "+cont+" letras");
	}

}
