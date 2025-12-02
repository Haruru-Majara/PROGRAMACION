package Hoja5;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		while(num>0) {
			if (num % 2 == 0)
				num=num-2;
			else
				num=num-1;
			System.out.println(num);
		}
	}

}
