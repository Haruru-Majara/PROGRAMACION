package ejercicios;

import java.util.Scanner;

/**
 * En un cine las entradas cuestan 5 euros. Se hace el 50% de descuento los
 * martes a los mayores de 65 años, los miércoles el 20% a todos los públicos y el
 * fin de semana el 15% a los menores de 18 años. Hacer un programa que simule
 * el siguiente proceso : se pide por teclado el día de la semana , se valida que sea
 * correcto (L,M,X,J,V,S o D). Se van pidiendo las edades de la gente que llega a la
 * taquilla, si es necesario, y se muestra el precio de la entrada.
 * 
 * Utilizar un método para validar el día y otro para calcular el precio de cada entrada
 * */

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char diaSemana;
		int edad=0;
		double precioEntrada=5,precioETotal;
		boolean diaCorrecto,siguiente;
		
		System.out.println("-----ENTRADAS CINE-----");
		do {
			do {
			System.out.println(" ");
			System.out.println("Dia se la semana:  ");
			diaSemana=sc.nextLine().charAt(0);
			diaCorrecto=diaCorrecto(diaSemana);
			if(diaCorrecto!=true)
				System.out.println("Error, introducir de nuevo. ");
			}while(diaCorrecto!=true);
			
			if(diaSemana=='M' || diaSemana=='S' || diaSemana=='D') {
				do {
					System.out.println("Introduzca la edad: ");
					edad=sc.nextInt();
					if(edad<0)
						System.out.println("Error en la edad, volver a introducir.");
				}while(edad<0);
			}
			
			precioETotal=calcularPrecio(precioEntrada,diaSemana,edad);
			
			System.out.println(" ");
			System.out.println("El precio de la entrada es: "+precioETotal);
			System.out.println(" ");
			System.out.println("¿Hay más clientes esperando?");
			siguiente=sc.nextBoolean();
			sc.nextLine();
			
		}while(siguiente==true);
	}
	public static boolean diaCorrecto(char dia) {
		if(dia=='L' || dia=='M' || dia=='X' || dia=='J' || dia=='V' || dia=='S' || dia=='D')
			return true;
		return false;
	}
	
	public static double calcularPrecio(double precioBase,char dia, int edad) {
		double precioFinal=0;
		switch(dia) {
		case 'M':
			if (edad>65)
				precioFinal=precioBase-precioBase*50/100;
			else
				precioFinal=precioBase;
			break;
		case 'X':
			precioFinal=precioBase-precioBase*20/100;
			break;
		case 'S':
		case 'D':
			if(edad<18)
				precioFinal=precioBase-precioBase*15/100;
			else
				precioFinal=precioBase;
			break;
			default:
				precioFinal=precioBase;
		}
		return precioFinal;
	}
}
