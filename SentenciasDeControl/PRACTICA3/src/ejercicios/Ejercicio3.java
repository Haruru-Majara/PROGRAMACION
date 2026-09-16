package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que lee dos números (no necesariamente distintos) y los escribe ordenados
 * 
 * */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double num1,num2;
		
		System.out.println("Dame el primer número: ");
		num1=sc.nextDouble();
		System.out.println("Dame el segundo número: ");
		num2=sc.nextDouble();
		
		if(num1==num2) {
			System.out.println("Los números se ordenan así: "+num1+","+num2);	
		}else {
			if(num1>num2) {
				System.out.println("Los números se ordenan así: "+num1+","+num2);
			}else {
				System.out.println("Los números se ordenan así: "+num2+","+num1);
			}
		}
	}

}
