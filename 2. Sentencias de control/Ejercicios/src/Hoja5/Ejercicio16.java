package Hoja5;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factura=0, codigo, facturaSuper=0;
		double litros, precioLitro, facturaTotal;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduzca código de artículo: ");
			codigo=sc.nextInt();
			System.out.println("Introduzca cantidad de litros: ");
			litros=sc.nextDouble();
			System.out.println("Introduzca el precio por litro: ");
			precioLitro=sc.nextDouble();
			
			factura=factura+1;
			facturaTotal=litros*precioLitro;
			litros=litros+litros;
			
			if (facturaTotal > 600)
				facturaSuper=facturaSuper+1;
			
			
		}while (factura <5);
		
		System.out.println("Facturación total: "+facturaTotal);
		System.out.println("Cantidad de litros vendidos: "+litros);
		System.out.println("Número de facturas que se emitieron de más de 600 euros: "+facturaSuper+1);
	}

}
