package Hoja5;

import java.util.Scanner;

public class Ejercicio15b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduce número del 0-10 ");
			num=sc.nextInt();
			if (num<0 || num>10)
				System.out.println("Número incorrecto.");
		}while(num<0 || num>10);
		System.out.println("Introduce un número del 0-10");
	}

}
