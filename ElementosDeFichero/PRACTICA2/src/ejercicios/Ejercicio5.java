package ejercicios;

/**
 * Programa que calcula el área de un triángulo.
 * 
 * */

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double base,altura,area;
		
		System.out.println("---Vamos a calcular el área de un triángulo---");
		System.out.println(" ");
		System.out.println("¿Cuál es la base?");
		base=sc.nextDouble();
		System.out.println("¿Cuál es la altura?");
		altura=sc.nextDouble();
		
		area=(base*altura)/2;
		
		System.out.println(" ");
		System.out.println("El área del triángulo es: "+area);
	}

}
