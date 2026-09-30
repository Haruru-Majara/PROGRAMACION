package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Con objeto de fomentar el ahorro energético, el recibo de la electricidad se elabora de
 * forma que el precio de cada Kw/h consumido es más caro cuanto más se consume:
 * 
 * 2€ de gastos fijos
 * 0,50€/Kwh para los primeros 100 Kwh
 * 0,70€/Khw para los siguientes 150 Kwh
 * 1€/Kwh para el resto
 * 
 * Elabora un programa que lee de teclado los dos últimos valores del contador (lo que marca
 * actualmente y lo que marcaba en la última lectura), y calcula e imprime en pantalla el importe
 * total a pagar.
 * */

public class Ejercicio7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double pKwh=0;
		int kwhActual,kwhPasado,diff;
		
		System.out.println("¿Cuánto marca este mes tu contador?");
		kwhActual=sc.nextInt();
		System.out.println("¿Cuánto marcaba el mes pasado tu contador?");
		kwhPasado=sc.nextInt();
		
		diff=kwhActual-kwhPasado;
		
		System.out.println("La diferencia es de: "+diff+" Kw/h");
		
		if(diff<0) 
			System.out.println("Error, el consumo no puede ser negativo.");
		else 
			if(diff<=100) 
				pKwh=diff*0.50+2;
			else 
				if(diff<=250) 
					pKwh=100*0.50+(diff-100)*0.70+2;
				else 
					pKwh=100*0.50+150*0.70+(diff-250)*1+2; 
		
		System.out.println("El precio a pagar es: "+pKwh+"€");
	}

}
