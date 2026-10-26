package ejercicios;

import java.util.Scanner;

/**
 * Programa que calcula el factorial de un número, éste no debe ser negativo
 * 
 * 						4!= 4*3*2*1
 * */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num,total;
		boolean seguir;
		
		do {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
		
			while(num<0) {
				System.out.println("El número tiene que ser positivo.");
				System.out.println("Introduce un núevo número: ");
				num=sc.nextInt();
			}
			System.out.println(" ");
			total=factorial(num);
			System.out.println("El factorial de "+num+" es: "+total);
			System.out.println(" ");
			System.out.println("¿Quieres el factorial de otro número?");
			seguir=sc.nextBoolean();
			
		}while(seguir==true);
		
	}
	public static int factorial(int num) {
		int total=1;
		for(int i=1;i<=num;i++) {
			total=total*i;
		}
		return total;
	}
}
