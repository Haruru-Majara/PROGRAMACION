package ejercicios;

import java.util.Scanner;

/**
 * Programa que dado un número, en este caso el 5, imprima lo siguiente. La
 * impresión se realiza en una función
 * 
 * 			1
 * 			22
 *			333
 * 			4444
 * 			55555
 * */

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Di un número del 1 al 20");
			num=sc.nextInt();
			
			if(num<1 || num>20)
				System.out.println("Error en el número.");
			
			System.out.println(" ");
		}while(num<1 || num>20);
		
		imprimirNumero(num);
	}
	public static void imprimirNumero(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
