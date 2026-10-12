package ejercicios;

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

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int cod,litros,fact600=0,litro1=0;
		double precioLitro,factIndividual,factTotal=0;
		
		//Recorre un bucle mostrando 5 facturas con sus datos
		for(int i=1;i<=5;i++) {
			System.out.println(" ");
			System.out.println("---Factura "+i+": ");
			cod=r.nextInt(4)+1; //Esto hace que el contador empiece en 1 y no en 0
			
			litros=r.nextInt(151); //Aquí saca un número entre 0 y 150
			while(litros==0) { //si es 0 vuelve a hacer la tirada hasta que sea diferente
				litros=r.nextInt(151);
			}
			
			precioLitro=Math.round(Math.random() * 16 * 100)/100.0; //Hace un random entre 0 y 15 con solo 2 decimales
			while(precioLitro==0) { // si saca 0 hace lo mismo que arriba, otra tirada
				precioLitro=Math.round(Math.random() * 16 * 100)/100.0;
			}
			
			//Hace calculos finales
			factIndividual=litros*precioLitro;
			
			if(cod==1)
				litro1=litro1+litros;
			if(factIndividual>600)
				fact600++;
			
			factTotal=factTotal+factIndividual;
			
			
			//enseña datos de la factura
			System.out.println("Código del artículo: "+cod);
			System.out.println("Litros vendidos del artículo "+cod+": "+litros);
			System.out.println("Precio del litro del artículo "+cod+": "+precioLitro);
			System.out.println("Precio final de la factura: "+factIndividual);
			
		}
		//Muestra resultados
		System.out.println(" ");
		System.out.println("------RESULTADO FINAL DE LAS FACTURAS------");
		System.out.println(" ");
		System.out.println("Facturación total: "+factTotal);
		System.out.println("Litros vendidos del artículo 1: "+litro1);
		System.out.println("Número de facturas que superan los 600 euros: "+fact600);
		
	}

}
