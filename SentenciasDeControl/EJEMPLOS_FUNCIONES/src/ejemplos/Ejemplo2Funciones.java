package ejemplos;

/**
 * Programa que lee el precio de un producto, su precio rebajado y calcula el
 * descuento(en %) realizado mediante una función.

				(precioO-precioF)*100/precioO
 * */

import java.util.Scanner;

public class Ejemplo2Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double precioO,precioF,descuento;
		
		System.out.println("Anota el precio inicial: ");
		precioO=sc.nextDouble();
		System.out.println("Anota el precio rebajado: ");
		precioF=sc.nextDouble();
		
		descuento=calcDescuento(precioO,precioF);
		
		System.out.println("El descuento es del: "+descuento+"%");
		
	}
	public static double calcDescuento(double pO, double pF) {
		double resultado;
		resultado=(pO-pF)*100/pO;
		return resultado;
	}
}
