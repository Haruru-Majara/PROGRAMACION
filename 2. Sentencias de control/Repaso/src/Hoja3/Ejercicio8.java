package Hoja3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		if (num % 2 == 0)
			System.out.println("El número es par.");
		else
			System.out.println("El número es impar.");
	}

}
