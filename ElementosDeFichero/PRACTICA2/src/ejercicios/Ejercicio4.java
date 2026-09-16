package ejercicios;

/**
 * Programa que dadas 3 notas calcule la media.
 * */

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double n1,n2,n3,media;
		
		System.out.println("Primera nota: ");
		n1=sc.nextDouble();
		System.out.println("Segunda nota: ");
		n2=sc.nextDouble();
		System.out.println("Tercera nota: ");
		n3=sc.nextDouble();
		
		media=(n1+n2+n3)/3;
		
		System.out.println("La media de las notas es: "+media);
	}

}
