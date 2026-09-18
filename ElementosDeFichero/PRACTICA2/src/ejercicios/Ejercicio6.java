package ejercicios;

import java.util.Locale;

/**
 * Programa que lee el precio de tarifa de un producto y el precio final pagado por
 * el mismo y nos calcula el descuento (%) realizado
 * */

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double precioIn,precioFin,descuento,aux;
		
		System.out.println("El precio inicial del producto es: ");
		precioIn=sc.nextDouble();
		System.out.println("El precio final del producto es: ");
		precioFin=sc.nextDouble();
		
		while (precioIn<precioFin) {
			System.out.println("El precio inicial no puede ser menor que el precio final");
			System.out.println(" ");
			System.out.println("Precio inicial: ");
			precioIn=sc.nextDouble();
			System.out.println("Precio final: ");
			precioFin=sc.nextDouble();
		}
		
			aux=precioIn-precioFin;
			aux=aux/precioIn;
			descuento=aux*100;	
			
			/**
			 * descuento= 100 - (precioFin*100)/precioIn;
			 * */
			
			System.out.println(" ");
			System.out.println("¿Qué descuento se ha aplicado?");
			System.out.println("El descuento ha sido del: "+descuento+"%");
	
		
		
		
	}

}
