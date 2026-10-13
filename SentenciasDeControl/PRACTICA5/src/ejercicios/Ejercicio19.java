package ejercicios;

import java.util.Random;

/**
 * Programa que lea dos números enteros y muestre por pantalla todos los números
 * comprendidos entre esos dos, ambos incluidos. El programa no debe suponer que
 * el primero será menor que el segundo ni viceversa, pero sí deberá tenerlo en
 * cuenta para mostrar los números en orden creciente o decreciente según
 * corresponda.
 * */

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		
		int num1=r.nextInt(101);
		System.out.println("Número 1: "+num1);
		int num2=r.nextInt(101);
		System.out.println("Número 2: "+num2);
	
		while(num1==num2) {
			System.out.println("Han salido iguales, hacemos otra tirada.");
			num1=r.nextInt(101);
			num2=r.nextInt(101);
		}
		System.out.println(" ");
		System.out.println("Los números comprendidos entre "+num1+" y "+num2+" son: ");
		if(num1>num2) {
			for(int i=num1;i>=num2;i--) {
				System.out.println(i);
			}
		}else {
			for(int i=num1;i<=num2;i++) {
				System.out.println(i);
			}
		}
			
	}

}
