package Hoja5;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		while(num !=0) {
			if (num >0)
				System.out.println("Número positivo");
			else
				System.out.println("Número negativo");
			
			System.out.println("Introduce otro número: ");
			num=sc.nextInt();
		}
		System.out.println("Número introducido es 0.");
	}

}
