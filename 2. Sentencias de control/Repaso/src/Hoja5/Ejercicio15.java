package Hoja5;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, multiplicacion;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el número de la tabla que quieras saber: ");
		num=sc.nextInt();
		
		
		while (num >=0 && num <=10) {
			System.out.println("La tabla de multiplicar de "+num+" es:");
			for(int i=0;i<=10;i++) {
				multiplicacion=num*i;
			
				System.out.println(num+" * "+i+" = "+multiplicacion);
			}
			System.out.println("Introduce el número de la tabla que quieras saber: ");
			num=sc.nextInt();
		}
		System.out.println("ERROR. Número incorrecto.");
	}

}
