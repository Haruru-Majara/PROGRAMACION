package ejercicios;

import java.util.Scanner;

/**
 * Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que
 * se introduzca un 0.
 * */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		while(num!=0) {
			if(num>0)
				System.out.println("Es positivo");
			else
				System.out.println("Es negativo");
			
			System.out.println("Introduce otro número: ");
			num=sc.nextInt();
		}
		System.out.println("El número introducido es 0. Fin del programa.");
	}

}
