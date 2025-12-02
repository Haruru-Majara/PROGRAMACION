package Hoja7;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*Programa que dado un número, en este caso el 5, imprima lo siguiente. La
        impresión se realiza en una función
          1
          22
          333
          4444
          55555*/
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		impresion(num);
	}
	public static void impresion (int num) {
		for(int i=1;i <= num;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();	
		}
		
	}
	
}
