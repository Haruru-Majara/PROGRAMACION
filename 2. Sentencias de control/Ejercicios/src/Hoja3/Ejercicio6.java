package Hoja3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio, precioFinal;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce el precio:");
		precio=sc.nextDouble();
		
		if ( precio >= 60) {
			precioFinal=precio-precio*10/100;
			System.out.println("El precio de tu producto es "+precio+" se te aplicará un descuento del 10% y tu precio se quedará en: "+precioFinal);
		}
		else
			if ( precio < 60) {
				precioFinal=precio-precio*0.50/100;
				System.out.println("El precio de tu producto es "+precio+" se te aplicará un descuento del 5% y tu precio se quedará en: "+precioFinal);
			}
			else
				if ( precio < 6)
					System.out.println("El precio de tu producto es "+precio+" y no se te aplicará ningún descuento.");
	}

}
