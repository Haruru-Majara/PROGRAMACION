package Hoja5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		while (num !=0) {
			if (num % 2 == 0) {
			System.out.println("El número es par.");
			System.out.println("Escribe otro número: ");
			num=sc.nextInt();
			}
			else {
				System.out.println("El número es impar.");
				System.out.println("Escribe otro número: ");
				num=sc.nextInt();
			}
		}
		System.out.println("EL número dado es 0. Fin del programa.");
	}

}
