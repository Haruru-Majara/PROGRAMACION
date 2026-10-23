package ejemplos;

/**
 * Programa que lee un número y me dice si es primo o no
 * */

import java.util.Scanner;

public class EjemploPrimosFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		boolean primo;
		
		System.out.println("Anota un número: ");
		num=sc.nextInt();
		
		primo=esPrimo(num);
		
		if(primo==true)
			System.out.println("El número es primo");
		else
			System.out.println("El número no es primo.");
	}
	public static boolean esPrimo(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
