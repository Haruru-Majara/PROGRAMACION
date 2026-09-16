package ejercicios;

/**
 * Programa que dado un importe y un descuento (porcentaje), calcula el importe
 * una vez aplicado el descuento.
 * */

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double importe,descuento,nuevoImp;
		
		System.out.println("Importe del producto: ");
		importe=sc.nextDouble();
		System.out.println("Descuento a aplicar: ");
		descuento=sc.nextDouble();
		
		nuevoImp=importe-((importe*descuento)/100);
		
		System.out.println("El producto pasa de valer "+importe+"€ a valer "+nuevoImp+"€");
	}

}
