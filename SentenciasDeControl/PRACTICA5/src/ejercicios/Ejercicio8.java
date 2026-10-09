package ejercicios;

import java.util.Scanner;

/**
 * Pedir el salario de 10 empleados. Mostrar cuantos ganan más de 1000€.
 * */
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double salario;
		int cont=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Anota salario "+i+": ");
			salario=sc.nextDouble();
			
			if(salario>1000)
				cont++;
		}
		
		System.out.println("Empleados que ganan más de 1000 euros: "+cont);
	}

}
