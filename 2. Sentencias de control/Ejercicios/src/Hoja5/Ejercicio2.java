package Hoja5;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime un número positivo o negativo");
		num=sc.nextInt();
		
		while (num !=0) {
			if (num <0) {
				System.out.println("Tu número es negativo");
				System.out.println("Dime un número positivo o negativo");
				num=sc.nextInt();
			}
			else {
				System.out.println("Tu número es positivo");
				System.out.println("Dime un número positivo o negativo");
				num=sc.nextInt();
			}
		}
		System.out.println("EL número dado es 0. Fin del programa.");
	}

}
