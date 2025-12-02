package Hoja5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		while(num >=0) {
			num=num*num;
			System.out.println(num);
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
		}
		System.out.println("El número que has introducido es negativo.");
	}

}
