package EjerciciosHoja2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double importe, descuento;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce un importe (si es un número decimal, usa . para separar:");
		importe=sc.nextDouble();
		
		System.out.println("Introduce un descuento");
		descuento=sc.nextDouble();
		
		double totalDescuento=descuento/100;
		double montoDescuento=importe*totalDescuento;
		double precioFinal=importe-montoDescuento;
		
		// mal hecho double precioFinal=((descuento/100)*importe);
		
		System.out.println("El precio inicial era: "+importe);
		System.out.println("El precio con descuento se queda en: "+precioFinal);
	}

}
