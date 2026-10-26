package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *En una empresa se rellena una ficha por cada empleado con los siguientes datos:
 *
 *Número de empleado
 *Sueldo
 *Horas extras
 *Precio hora extra
 *Otros ingresos
 *
 *Algoritmo que escribe aquellos empleados(su número) que reciben más de 600
 *€ al mes, así como lo que perciben. El proceso termina cuando el número de
 *empleado es 0. Se utilizarán un método para calcular el salario final:
 *
 *float calcularSalario(float sueldo, int horas, float precioHora, float otros)
 * */

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		int num,horasExtras;
		float sueldo,precioHE,otros,sueldoFinal;
		
		do {
			System.out.println(" ");
			System.out.println("-----FICHA DE EMPLEADO-----");
			System.out.println("_Número de empleado: ");
			num=sc.nextInt();
			if(num==0)
				break;
			System.out.println("_Sueldo: ");
			sueldo=sc.nextFloat();
			System.out.println("_Horas extra: ");
			horasExtras=sc.nextInt();
			System.out.println("_Precio hora extra: ");
			precioHE=sc.nextFloat();
			System.out.println("_Otros ingresos: ");
			otros=sc.nextFloat();
			
			sueldoFinal=calcularSalario(sueldo,horasExtras,precioHE,otros);
			
			if(sueldoFinal>600) {
				System.out.println("El empleado número: "+num+" cobra más de 600 euros");
				System.out.println("Sueldo final: "+sueldoFinal);
			}
			
		}while(num!=0);
	}
	public static float calcularSalario(float sueldo, int horas, float precioHora, float otros) {
		float sueldoTotal;
		
		sueldoTotal=sueldo+horas*precioHora+otros;
		
		return sueldoTotal;
	}
}
