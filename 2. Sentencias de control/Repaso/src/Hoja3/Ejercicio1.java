package Hoja3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, suma, resta;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1=sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextInt();
		
		if (num1 >0 && num2 >0) {
			suma=num1+num2;
			System.out.println(num1+" + "+num2+" = "+suma);
		}
		else
			if (num1 <0 && num2 <0) {
				resta=num1-num2;
				System.out.println(num1+" - "+num2+" = "+resta);
			}
			else
				if (num1 == 0 || num2 ==0)
					System.out.println("ERROR. Algún número es nulo.");
	}

}
