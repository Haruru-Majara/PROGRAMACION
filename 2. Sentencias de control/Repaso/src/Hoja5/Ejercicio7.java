package Hoja5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num, suma=0, media;
		int contador=0;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		do {
			System.out.println("Introduce un número: ");
			num=sc.nextDouble();
			if (num>=0) {
			suma=suma+num;
			contador++;
			}
			
		}while(num>=0);
		
		media=suma/contador;
		System.out.println("La media de los números dados es: "+media);
	}

}
