package ejemplos_funciones;

import java.util.Scanner;

public class ejsuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, resultado;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce número 1: ");
		num1=sc.nextInt();
		System.out.println("Introduce número 2: ");
		num2=sc.nextInt();
		
		resultado=suma(num1,num2);
		
		System.out.println("La suma es: "+resultado);
	}
	public static int suma(int a, int b) {
		int r;
		r=a+b;
		return r;
	}

}
