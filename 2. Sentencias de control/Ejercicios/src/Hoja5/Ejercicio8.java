package Hoja5;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sueldo;
		int empleado=0;
		int contador=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un sueldo: ");
		sueldo=sc.nextDouble();
		
		while (empleado <10) {
			if (sueldo > 1000) 
				contador=contador+1;
			empleado=empleado+1;
			System.out.println("Escribe otro sueldo: ");
			sueldo=sc.nextDouble();
			
		}
		System.out.println("Las personas con un sueldo mayor de 1000 son: "+contador);
	}

}
