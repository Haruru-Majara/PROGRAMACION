package Hoja3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, resto;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		numero=sc.nextInt();
		
		resto=numero%2;
		
		if ( resto == 0 )
			System.out.println("El número que has elegido es par.");
		else
			System.out.println("El número que has elegido es impar.");
	}

}
