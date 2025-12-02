package Hoja3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kwAntes,kwAhora, precioTotal,consumo;
		final double gastoFijo=2;
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("¿Cuántos Kw/h usabas antes?: ");
		kwAntes=sc.nextDouble();
		System.out.println("¿Cuántos Kw/h usas ahora?: ");
		kwAhora=sc.nextDouble();
		consumo=kwAhora - kwAntes;
		if ( consumo <= 100 ) 
			precioTotal=consumo*0.5+gastoFijo;
		else
			if (consumo < 250 )
				precioTotal=100*0.5+(consumo-100)*0.7+gastoFijo;
			else
				precioTotal=100*0.5+(150*0.7)+(consumo-250)*1+gastoFijo;
				System.out.println("Antes tus kw eran "+kwAntes+" y ahora son "+kwAhora+"/h así que tu factura será de "+precioTotal+"euros");
	}

}
