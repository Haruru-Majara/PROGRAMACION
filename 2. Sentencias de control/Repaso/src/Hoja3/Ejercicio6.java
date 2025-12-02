package Hoja3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precioInicial, precioFinal=0;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce el precio de tu producto: ");
		precioInicial=sc.nextDouble();
		
		if (precioInicial <=0)
			System.out.println("ERROR. Precio incorrecto.");
		else
			if (precioInicial <6) 
				System.out.println("El precio final de tu producto sin descuento es: "+precioInicial);
			else
				if (precioInicial <60) {
					precioFinal=precioInicial*0.95;
					System.out.println("El precio final de tu producto con descuento del 5% es: "+precioFinal);
				}
				else {
					precioFinal=precioInicial*0.90;
					System.out.println("El precio final de tu producto con descuento del 10% es: "+precioFinal);
				}
		
		
				
	}

}
