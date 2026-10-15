package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que determina cuantas cifras tiene un número
 * */

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		int cifra=0;
		int num;
		char otro;
		
		do {
			System.out.println(" ");
			System.out.println("Introduce un número para saber cuantas cifras tiene: ");
			num=sc.nextInt();
			
			for(int i=num;i>0;i=i/10) {
				//System.out.println(i);
				cifra++;
			}
			System.out.println("El número elegido tiene: "+cifra+" cifra/s.");
			
			sc.nextLine();
			System.out.println("¿Otro número?");
			otro=sc.nextLine().charAt(0);
			
			while(otro!='s' && otro!='n') {
				System.out.println("Error, introducir de nuevo la respuesta: ");
				otro=sc.nextLine().charAt(0);
			}
			
			cifra=0;
		}while(otro!='n');
	
		System.out.println(" ");
		System.out.println("Fin del programa.");
	}

}
