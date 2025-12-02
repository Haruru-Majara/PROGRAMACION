package Hoja3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1=sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextInt();
		
		if (num1 == num2)
			System.out.println("ERROR. Los números tienen que ser diferentes.");
		else
			if (num1 > num2)
				System.out.println(num1+" es mayor que "+num2);
			else
				System.out.println(num2+" es mayor que "+num1);
	}

}
