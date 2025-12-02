package Hoja7;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Programa que determina cuantas cifras tiene un número. Utilizar un método
			que recibe el números y nos retorna la cantidad de cifras que tiene*/
		int num, digitos;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		digitos=calcularDigitos(num);
		
		System.out.println("El número: "+num+" tiene "+digitos+" dígitos.");
	}
	public static int calcularDigitos (int num) {
		int cont=0;
		while(num !=0) {
			cont++;
			num=num/10;
		}
		return cont;
	}
}
