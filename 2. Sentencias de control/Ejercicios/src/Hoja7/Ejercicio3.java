package Hoja7;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, factorial;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número para saber su factorial: ");
		num=sc.nextInt();
		
		if (num <=0 )
			System.out.println("ERROR. Número introducido es 0 o negativo.");
		else {
			factorial=calcularFactorial(num);
			System.out.println("El factorial de "+num+" es "+factorial);
		}
		
	}
	public static int calcularFactorial (int num) {
		int resultado=1;
		for (int i=num;i>0;i--) {
			resultado=resultado*i;
			
		}
		return resultado;	
	}
}
