package Hoja5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contador=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		num=sc.nextInt();
		
		while (num >=0) {
			contador=contador+1;
			
			System.out.println("Dame otro número:");
			num=sc.nextInt();
		}
			System.out.println("ERROR. Número negativo. Se han contado: "+contador+" números. Fin del programa.");
	}

}
