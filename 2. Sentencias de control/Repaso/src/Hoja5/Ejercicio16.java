package Hoja5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0, litros, codigo, facturasMayor600=0, litros1=0;
		double facturacionTotal=0,precioLitro, precioLitroTotal=0;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		do {
			System.out.println("Introduce el código del artículo: ");
			codigo=sc.nextInt();
			System.out.println("Introduce litros: ");
			litros=sc.nextInt();
			System.out.println("Introduce precio por litro: ");
			precioLitro=sc.nextDouble();
			
			contador++;
			precioLitroTotal=litros*precioLitro;
			facturacionTotal=facturacionTotal+precioLitroTotal;
			if (codigo == 1)
				litros1=litros1+litros;
			
			if (precioLitroTotal > 600)
				facturasMayor600++;

		}while(contador <5); 
		System.out.println("Facturación Total: "+facturacionTotal+" euros");
		System.out.println("Cantidad de litros vendidos del artículo 1: "+litros1);
		System.out.println("Facturas de más de 600 euros: "+facturasMayor600);
	}

}
