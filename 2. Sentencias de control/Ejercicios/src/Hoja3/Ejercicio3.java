package Hoja3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce el primero número: ");
		n1=sc.nextDouble();
		System.out.println("Introduce el segundo número: ");
		n2=sc.nextDouble();
		
		if ( n1 > n2)
			System.out.println(n1 + " - " + n2);
		else
			System.out.println(n2 + " - " + n1);
	
	}
}
