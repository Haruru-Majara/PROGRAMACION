package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee un número y escribe todos los anteriores a él
 * */

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Escribe un número y te digo los que van por debajo de el hasta el 0: ");
		num=sc.nextInt();
		
		for(int i=num-1;i>=0;i--) {
			System.out.println(i);
		}
	}

}
