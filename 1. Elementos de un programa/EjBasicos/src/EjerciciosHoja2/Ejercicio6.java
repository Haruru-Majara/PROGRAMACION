package EjerciciosHoja2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioInicial, precioFinal, descuento;
		
		Scanner sc=new Scanner(System.in); //Leer por teclado
		sc.useLocale(Locale.ENGLISH); //Leer decimales con .
		
		System.out.println("Introduce el precio inicial (si es un número decimal, usa . para separar:");
		precioInicial=sc.nextDouble();
		System.out.println("Introduce el precio final (si es un número decimal, usa . para separar:");
		precioFinal=sc.nextDouble();
		
		descuento=((precioInicial-precioFinal)/precioInicial)*100;
		//descuento=100-precioFInal*100/precioInicial (Sería lo mismo)
		
		System.out.println("El descuento que se ha aplicado ha sido de: "+descuento+"%");
	}

}
