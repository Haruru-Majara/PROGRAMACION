package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que lee dos números, si son positivos los suma, si son negativos los resta y si
 * alguno es nulo saca un mensaje de error.
 * */

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double num1,num2,suma,resta;
		
		System.out.println("Dame el primer número: ");
		num1=sc.nextDouble();
		System.out.println("Dame el segundo número: ");
		num2=sc.nextDouble();
		
		if (num1==0 || num2==0) {
			System.out.println("Alguno de los dos números es nulo");
		}else {
			if(num1>0 && num2>0) {
				suma=num1+num2;
				System.out.println("Resultado de la suma: "+suma);
			}else {
				resta=num1-num2;
				System.out.println("Resultado de la resta: "+resta);
			}
				
		}
		
		
	}

}
