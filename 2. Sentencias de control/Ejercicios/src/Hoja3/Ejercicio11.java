package Hoja3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo, provincia, tipoOperacion, nOperacion;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un número de cuatro cifras: ");
		codigo=sc.nextInt();
		
		
		if ( codigo > 9999)
			System.out.println("ERROR: CÓDIGO NO VÁLIDO");
		else {
			
		provincia=codigo/1000;
		tipoOperacion=(codigo%1000)/100;
		nOperacion=codigo%100;
		
		System.out.println("El codigo: "+codigo+" corresponde con: ");
		System.out.println("PROVINCIA: "+provincia);
		System.out.println("TIPO DE OPERACIÓN: "+tipoOperacion);
		System.out.println("NÚMERO DE OPERACIÓN: "+nOperacion);
		}
	}

}
