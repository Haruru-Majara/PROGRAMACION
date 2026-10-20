package examenBuclesEscritos;

/**
 * Realiza un programa que solicite al usuario un número entero y muestre por pantalla todos sus divisores
 * */

import java.util.Scanner;

public class ejer1BucleForMario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				System.out.println(i);
		}
	}

}
