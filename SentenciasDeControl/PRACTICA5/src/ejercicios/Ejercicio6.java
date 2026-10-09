package ejercicios;

import java.util.Scanner;

/**
 * Programa que va leyendo números desde teclado y calcula la suma de todos ellos.
 * El programa finaliza cuando el número leído es 0.
 * */
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num,acumulador=0;
		
		do {
			System.out.println("Anota número para sumar: ");
			num=sc.nextInt();
			
			acumulador=acumulador+num;
		}while(num!=0);
			
		System.out.println("Resultado final: "+acumulador);
	}

}
