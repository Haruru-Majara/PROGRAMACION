package Hoja5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, resultado;
		char oper;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("¿Qué operación deseas hacer?");
		
		System.out.println("Sumar: +");
		System.out.println("Restar: -");
		System.out.println("Multiplicar: *");
		System.out.println("Dividir: /");
		oper=sc.nextLine().charAt(0);
		
		System.out.println("Introduce el primer número: ");
		num1=sc.nextDouble();
		
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextDouble();

		while (oper == '+' && oper == '-' && oper == '*' && oper == '/') {
			if (oper == '+')
				resultado=num1+num2;
			else
				if (oper == '-')
					resultado=num1-num2;
				else
					if (oper == '*')
						resultado=num1*num2;
					else
						resultado=num1/num2;
			System.out.println("Resultado: "+resultado);
			resultado=sc.nextDouble();
			
		}
		System.out.println("ERROR en operación. Fin del programa");
	}

}
