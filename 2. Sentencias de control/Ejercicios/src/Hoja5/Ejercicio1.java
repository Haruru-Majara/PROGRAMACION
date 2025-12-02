package Hoja5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cuadrado;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce número: ");
		num=sc.nextInt();
		
		while (num>=0) {
			cuadrado=num*num;
			System.out.println(cuadrado);
			// tambien es el cuadrado de un numero System.out.println("El cuadrado es: "+Math.pow(num, 2));
			System.out.println("Introduce número: ");
			num=sc.nextInt();
			
		}
		System.out.println("ERROR. Número negativo, fin del programa.");
	}

}
