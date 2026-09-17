package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Diseñar un programa que calcule el precio de un billete de ida y vuelta por avión,
 * conociendo la distancia a recorrer, el número de días de estancia y sabiendo que si la
 * distancia es superior a 1.000 Km. y el número de días de estancia es superior a 7, la línea
 * aérea le hace un descuento del 30 %. (Precio por kilómetro = 0,05€.).
 * */

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double pBillete,distancia;
		int dias;
		final int descuento=30;
		final double kilometro=0.05;
		
		System.out.println("¿Cuánta distancia hay (KM)?");
		distancia=sc.nextInt();
		System.out.println("¿Cuántos días de estancia son?");
		dias=sc.nextInt();
		
		pBillete=distancia*kilometro;
		
		if(distancia>1000 && dias>7) {
			pBillete=pBillete-(pBillete*descuento/100);
		}
		
		System.out.println("El precio final del billete se ha quedado en: "+pBillete+"€");
		
	}

}
