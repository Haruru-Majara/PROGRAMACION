package Hoja5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		while(num !=0) {
			if (num % 2 ==0)
				System.out.println("Número par.");
			else
				System.out.println("Número impar.");
			
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
		}
		System.out.println("Número dado es 0.");
	}

}
