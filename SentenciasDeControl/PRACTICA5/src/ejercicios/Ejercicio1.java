package ejercicios;

import java.util.Scanner;

/**
 * Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca
 * un número negativo.
 * */
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num,cuadrado;
		
		System.out.println("Introduce un número para mostrar su cuadrado: ");
		num=sc.nextInt();
		
		while(num>=0) {
			cuadrado=num*num;
			System.out.println("El cuadrado de "+num+" es: "+cuadrado);
			System.out.println("Introduce un número para mostrar su cuadrado: ");
			num=sc.nextInt();
		}
		System.out.println("El número introducido es negativo. Fin del programa.");
	}

}
