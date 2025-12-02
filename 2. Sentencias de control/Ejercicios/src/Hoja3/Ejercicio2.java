package Hoja3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero1, numero2;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce el primero número: ");
		numero1=sc.nextDouble();
		System.out.println("Introduce el segundo número: ");
		numero2=sc.nextDouble();
		
		if ( numero1 > numero2)
			System.out.println(numero1+" es mayor que "+numero2);
		else
			System.out.println(numero2+" es mayor que "+numero1);	
	}

}
