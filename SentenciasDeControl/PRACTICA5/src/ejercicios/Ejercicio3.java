package ejercicios;

import java.util.Scanner;

/**
 * Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 * */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		while(num!=0) {
			if(num%2==0)
				System.out.println("Es par");
			else
				System.out.println("Es impar");
			
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
		}
		
		System.out.println("Se anotó un 0. Fin del programa.");
	}

}
