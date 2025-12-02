package Hoja3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce el primero número: ");
		n1=sc.nextDouble();
		System.out.println("Introduce el segundo número: ");
		n2=sc.nextDouble();
		System.out.println("Introduce el tercer número: ");
		n3=sc.nextDouble();
		if (n1==n2 || n1==n3 || n2==n3)
			System.out.println("Los números son iguales, tienen que ser distintos.");
		else
			if ( n1 > n2 && n1 > n3) 
				System.out.println(n1+" es el mayor de los tres.");
			else
				if ( n2 > n1 && n2 > n3 )
					System.out.println(n2+" es el mayor de los tres.");
				else
					System.out.println(n3+" es el mayor de los tres.");
	}

}
