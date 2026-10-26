package ejercicios;

import java.util.Scanner;

/**
 * Programa que calcula el factorial de un número, éste no debe ser negativo
 * 
 * 						4!= 4*3*2*1
 * */

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num,total;
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		while(num<0) {
			System.out.println("El número debe ser positivo!!!");
			System.out.println("Vuelve a introducir el número: ");
			num=sc.nextInt();
		}
		
		total=factorial(num);
		System.out.println("El factorial de "+num+" es: "+total);
		
	}
	public static int factorial(int num) {
		int total=num;
		while(num>1) {
			num--;
			total=total*num;
		}
		return total;
	}
}
