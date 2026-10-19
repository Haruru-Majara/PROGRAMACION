package examenBuclesEscritos;

import java.util.Scanner;

public class bucle2While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,acum=0;
		
		System.out.println("Introduce número 1: ");
		num1=sc.nextInt();
		System.out.println("Introduce número 2: ");
		num2=sc.nextInt();
		
		while(num1<=num2) { //AQUI ESTÁ MAL EL =
			if(num1%2!=0)
				num1++;
			else {
				num1=num1+2;
				acum=acum+num1;
			}
		}
		System.out.println("La suma es: "+acum);
	}

}
