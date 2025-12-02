package Hoja3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distancia, dias, total, descuento;
		final double precio=0.05;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce la distancia del viaje:");
		distancia=sc.nextDouble();
		System.out.println("Introduce los días del viaje:");
		dias=sc.nextDouble();
		total=precio*distancia;
		/*
		if ( distancia <= 1.000 || dias <= 7 ) {
			
			System.out.println("El precio del viaje será: "+total+" euros.");
		}
		else { //distancia >1000 && dias >7
			descuento=total - total*30/100;
			System.out.println("El precio del viaje con el descuento será: "+descuento+" euros");
		}
		*/
		
		if (distancia > 1000 && dias >7) {
			descuento=total - total*30/100;
			System.out.println("El precio del viaje con el descuento será: "+descuento+" euros");
		
		}
		else
			System.out.println("El precio del viaje será: "+total+" euros.");
	}

}
