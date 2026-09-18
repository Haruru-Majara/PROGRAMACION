package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee un número y nos dice si es par o impar
 * */

public class EJercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num,resto;
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		resto=num%2;
		
		if(resto==0) {
			System.out.println("El número "+num+" es par");
		}else {
			System.out.println("El número "+num+" es impar");
		}
			
		
	}

}
