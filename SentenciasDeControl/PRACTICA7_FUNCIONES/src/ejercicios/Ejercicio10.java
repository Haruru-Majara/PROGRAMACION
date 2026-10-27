package ejercicios;

import java.util.Scanner;

/**
 * Programa que dado un número de tres cifras, averigüe si es un número de
 * Armstrong: la suma de cada uno de los números que lo componen elevado al
 * número de dígitos de dicho número da como resultado el propio número.
 * 
 * 			153= 1^3+5^3+3^3
 * */

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		boolean numeroAmstrong;
		
		do {
			System.out.println("Introduce un número de 3 cifras: ");
			num=sc.nextInt();
			
			if(num<100 || num>999)
				System.out.println("Error, número incorrecto.");
			
			System.out.println(" ");
		}while(num<100 || num>999);
		
		numeroAmstrong=esAmstrong(num);
		
		if(numeroAmstrong==true)
			System.out.println("El número "+num+" es un número Amstrong.");
		else
			System.out.println("El número "+num+" no es un número Amstrong.");
		
	}
	public static boolean esAmstrong(int n) {
		int temporal=0,temporal2=0,acumulador=0;
		for(int i=n;i>0;i=i/10) {
			temporal=i%10;
			for( int j=1;j<3;j++) {
				if(j==1)
					temporal2=temporal*temporal;
				else
					temporal2=temporal2*temporal;
			}
			acumulador=acumulador+temporal2;
			temporal=0;
			temporal2=0;
		}
		if(acumulador==n)
			return true;
		return false;
	}
}
