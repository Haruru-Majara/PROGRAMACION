package ejercicios;

import java.util.Scanner;

/**
 * Pedir números hasta que se introduzca uno negativo, y calcular la media.
 * */
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double num,media,acumulador=0,contador=0;
		
		do {
			System.out.println("Anota un número para calcular la media: ");
			num=sc.nextDouble();
			
			if(num<0)
				break;
			
			acumulador=acumulador+num;
			contador++;
			
		}while(num>=0);
		
		media=acumulador/contador;
		System.out.println("La media es: "+media);
	}

}
