package ejercicios;

import java.util.Scanner;

/**
 * Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de
 * dicho número.
 * */

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Introduce un número entre 0 y 10 para ver su tabla de multiplicar:");
			num=sc.nextInt();
			if(num<0 || num>10)
				System.out.println("Error, número incorrecto. ");
		}while(num<0 || num>10);
		
		System.out.println(" ");
		System.out.println("----TABLA DE MULTIPLICAR DEL "+num+"----");
		for(int i=0;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
