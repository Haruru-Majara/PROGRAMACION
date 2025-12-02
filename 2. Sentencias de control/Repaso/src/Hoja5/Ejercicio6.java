package Hoja5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma=0;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			
			suma=suma+num;
			
		}while(num!=0);

			System.out.println("La suma total es de: "+suma);
	}

}
