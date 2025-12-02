package Hoja3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distancia, precioTotal=0;
		int dias;
		final double precioKm = 0.05;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce distancia: ");
		distancia=sc.nextDouble();
		System.out.println("Introduce días: ");
		dias=sc.nextInt();
		
		precioTotal=distancia*precioKm;
		
		if (dias <= 0)
			System.out.println("ERROR. Número de días incorrecto");
		else
			if (dias >7 && distancia >1000) {
				precioTotal=precioTotal*0.70;
				System.out.println("El precio final por "+distancia+" kilometros y "+dias+" dias. Es: "+precioTotal+" euros.");
			}
			else
				if (dias <=7 || distancia <=1000) {
					System.out.println("El precio final por "+distancia+" kilometros y "+dias+" dias, es de: "+precioTotal+" euros.");
				}
				
	}

}
