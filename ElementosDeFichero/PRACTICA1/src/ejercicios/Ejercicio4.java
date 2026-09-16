package ejercicios;

/**
 * Programa que calcula la longitud de una circunferencia de radio 3 metros (2πr)
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para leer numeros en decimales:
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		int r=3;
		double pi=3.1416;
		
		double longitud=2*pi*r;
		
		System.out.println("La longitud de la circunferencia de radio "+r+" es: "+longitud);
	}

}
