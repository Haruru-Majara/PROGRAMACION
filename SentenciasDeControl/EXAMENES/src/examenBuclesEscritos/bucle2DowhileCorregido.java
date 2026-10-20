package examenBuclesEscritos;

/**
 * Calcula la suma de los pares comprendidos entre dos números leídos por
 * teclado.
 * */

import java.util.Scanner;

public class bucle2DowhileCorregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,acum=0;
		
		
		System.out.println("Introduce número 1: ");
		num1=sc.nextInt();
		System.out.println("Introduce número 2: ");
		num2=sc.nextInt();
		
		do {
			if(num1%2!=0)
				num1++;
			else {
				num1=num1+2;
				if(num1==num2)
					break;
				else
					acum=acum+num1;
			}
		}while(num1<num2);
		System.out.println("La suma es: "+acum);
	}

}
