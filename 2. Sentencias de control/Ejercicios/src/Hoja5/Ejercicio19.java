package Hoja5;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1=sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextInt();
		
		if (num1 > num2)
			for (int i=num1; i>=num2; i--) {
			System.out.println(i);
			}
		else
			for (int i=num1; i<=num2; i++) {
				System.out.println(i);
			}
	}

}
