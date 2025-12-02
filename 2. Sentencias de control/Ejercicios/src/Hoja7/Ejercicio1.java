package Hoja7;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	/* 1. En una empresa se rellena una ficha por cada empleado con los siguientes
		datos:
		
		 Número de empleado
		 Sueldo
		 Horas extras
		 Precio hora extra
		 Otros ingresos
			
		Algoritmo que escribe aquellos empleados(su número) que reciben más de 600
		€ al mes, así como lo que perciben. El proceso termina cuando el número de
		empleado es 0. Se utilizarán un método para calcular el salario final
			
		flota calcularSalario(float sueldo, int horas, float precioHora, float otros)*/
		
		
		int numEmp, horasExtras;
		float sueldo, precioExtra, otrosIngresos,sueldoTotal;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce número del empleado: ");
		numEmp=sc.nextInt();
		
		while(numEmp!=0) {
			System.out.println("Introduce sueldo: ");
			sueldo=sc.nextFloat();
			System.out.println("Introduce horas extras: ");
			horasExtras=sc.nextInt();
			System.out.println("Introduce precio hora extra: ");
			precioExtra=sc.nextFloat();
			System.out.println("Introduce otros ingresos: ");
			otrosIngresos=sc.nextFloat();
			
			sueldoTotal=calcularSalario(sueldo,horasExtras,precioExtra,otrosIngresos);
			if (sueldoTotal > 600)
				System.out.println("El empleado "+numEmp+" gana "+sueldoTotal+"euros");
			
			System.out.println("Introduce número del empleado: ");
			numEmp=sc.nextInt();
		}
	}
	public static float calcularSalario(float sueldo, int horas, float precioHora, float otros) {
		float total;
		total=sueldo+horas*precioHora+otros;
		return total;
	}

}
