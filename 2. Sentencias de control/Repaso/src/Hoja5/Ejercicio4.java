package Hoja5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contador=0;
		
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		while(num >=0 ) {
			contador++;
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
		}
		*/
		do {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			
			contador++;
			
			
		}while(num >=0);
		
		System.out.println("Los números introducidos han sido: "+contador);
	}

}
