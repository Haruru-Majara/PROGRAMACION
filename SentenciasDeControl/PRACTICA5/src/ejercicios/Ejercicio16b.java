package ejercicios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *Una empresa que se dedica a la venta de desinfectantes necesita un programa
 *para gestionar las facturas. En cada factura figura: el código del artículo, la cantidad
 *vendida en litros y el precio por litro.
 *
 *El programa pedirá los datos de 5 facturas introducidas y calculará y mostrará:
 *
 *Facturación total
 *Cantidad en litros vendidos del artículo 1
 *Número de facturas que se emitieron de más de 600 €.
 * */

public class Ejercicio16b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Random r=new Random();
		
		int codigo,cont=0;
		double litros,precioU,precioF,total=0,litros1=0;
		
		//Recorre un bucle mostrando 5 facturas con sus datos
		for(int i=1;i<=5;i++) {
			System.out.println(" ");
			System.out.println("---Factura "+i+": ");
			System.out.println("Introduce codigo: ");
			codigo=sc.nextInt();
			System.out.println("Introduce litros: ");
			litros=sc.nextDouble();
			System.out.println("Introduce precio: ");
			precioU=sc.nextDouble();
			precioF=litros*precioU;
			System.out.println("El precio de la factura es: "+precioF);
			total=total+precioF;
			if(codigo==1)
				litros1=litros1+litros;
			if(precioF>600)
				cont++;
		}
		System.out.println("Precio total: "+total);
		System.out.println("Número de facturas de más de 600: "+cont);
		System.out.println("Total litros producto codigo 1: "+litros1);
	}

}
