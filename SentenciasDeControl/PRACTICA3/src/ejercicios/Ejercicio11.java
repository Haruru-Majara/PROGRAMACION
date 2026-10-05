package ejercicios;

/**
 * Una empresa maneja códigos numéricos con las siguientes características:
 * 
 * Cada código consta de cuatro dígitos
 * El primero representa a una provincia
 * El segundo el tipo de operación
 * Los dos últimos el número de la operación
 * 
 * Escriba un programa que lea de teclado un número de cuatro dígitos, y posteriormente
 * imprima en pantalla la siguiente información:
 * 
 * PROVINCIA &
 * TIPO DE OPERACIÓN &
 * NÚMERO DE OPERACIÓN &&
 * 
 * En caso de que el número tenga más de 4 dígitos, en lugar del mensaje anterior, habrá que
 * imprimir en pantalla el siguiente mensaje de error: ERROR: CÓDIGO NO VÁLIDO. Si tiene
 * menos de 4 dígitos se suponen 0 los primeros.
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int codigo, provincia, tOp, nOp;

		System.out.println("Pon el código (4 dígitos)");
		codigo = sc.nextInt();
		System.out.println(" ");

		System.out.println("El código es: " + codigo);
		System.out.println(" ");

		if (codigo<0 || codigo>9999) {
			System.out.println("ERROR:CÓDIGO NO VÁLIDO");
		} else {
			provincia = codigo / 1000;
			codigo = codigo % 1000;
			tOp = codigo / 100;
			nOp = codigo % 100;
			
			System.out.println("PROVINCIA:               "+provincia);
			System.out.println(" ");
			System.out.println("TIPO DE OPERACIÓN:       "+tOp);
			System.out.println(" ");
			System.out.println("NÚMERO DE OPERACIÓN:     "+nOp);
		}
		
	
	}

}
