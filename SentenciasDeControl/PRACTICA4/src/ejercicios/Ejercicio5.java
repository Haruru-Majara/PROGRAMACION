package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee como dato de entrada un año y nos dice si se trata de un año
 * bisiesto o no. Se sabe que son bisiestos todos los años múltiplos de 4, excepto
 * los que sean múltiplos de 100 sin ser múltiplos de 400.
 * */

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a;
		
		System.out.println("Dime un año: ");
		a=sc.nextInt();
		
		if((a%4==0 && a%100==0 && a%400!=0) || (a%4!=0))
			System.out.println(a+" no es bisiesto");
		else
			System.out.println(a+" es bisiesto");
	}

}
