package ejercicios;

import java.util.Scanner;

/**
 * Programa que determina cuantas cifras tiene un número y seguir hasta que el usuario anote false. Utilizar un método
 * que recibe el números y nos retorna la cantidad de cifras que tiene
 * */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num,nCifras;
		boolean seguir;
		
		do {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			
			nCifras=cifras(num);
			
			System.out.println("El número elegido tiene: "+nCifras+" cifras");
			System.out.println(" ");
			System.out.println("Otro número? (true/false)");
			seguir=sc.nextBoolean();
			
		}while(seguir==true);
		
	}
	public static int cifras(int num) {
		int cont=0;
		do {
			cont++;
			num=num/10;
			
		}while(num!=0);
		return cont;
	}
}
