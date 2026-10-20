package examenBuclesEscritos;

/**
 * Lee un número y muestra todos los números que no lo dividen.
 * Ejemplo:
 * Anota número: 12
 * No divisores: 5,7,8,9,10,11
 * */

import java.util.Scanner;

public class bucle3For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Introduce num: ");
		num=sc.nextInt();
		
		for(int i=0;i<=num;i++) {
			if(i%num==0)
				System.out.println(i);
		}
	}

}
