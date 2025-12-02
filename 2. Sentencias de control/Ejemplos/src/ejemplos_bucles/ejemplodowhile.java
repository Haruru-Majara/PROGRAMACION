package ejemplos_bucles;

import java.util.Scanner;

public class ejemplodowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Introduce número positivo: ");
		num=sc.nextInt();
		while (num<=0) {
			System.out.println("Introduce número positivo: ");
			num=sc.nextInt();
		}
		*/
		do {
			System.out.println("Introduce un número positivo: ");
			num=sc.nextInt();
		}while(num<=0);
		System.out.println("Número leído correcto");
		
	}

}
