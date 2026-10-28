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

public class Ejercicio5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char diaSemana,siguiente;
		int edad=0;
		double precioETotal;
		boolean diaCorrecto;
		
		System.out.println("-----ENTRADAS CINE-----");
		
		do {
			System.out.println(" ");
			System.out.println("Dia se la semana:  ");
			diaSemana=sc.nextLine().charAt(0);
			diaSemana=Character.toUpperCase(diaSemana);
				
			diaCorrecto=diaCorrecto(diaSemana);
				
			if(diaCorrecto!=true)
				System.out.println("Error, introducir de nuevo. ");
		}while(diaCorrecto!=true);
			
		do {
			edad=0;
			if(diaSemana=='M' || diaSemana=='S' || diaSemana=='D') {
				
				System.out.println("Introduzca la edad: ");
				edad=sc.nextInt();
				sc.nextLine();
			}
					
			precioETotal=calcularPrecio(diaSemana,edad);
			System.out.println(" ");
			System.out.println("El precio de la entrada es: "+precioETotal+" euros.");
			System.out.println(" ");
			System.out.println("¿Hay más clientes esperando?");
			siguiente=sc.nextLine().charAt(0);
			siguiente=Character.toUpperCase(siguiente);
			
		}while(siguiente=='S');	
		
	}
	public static boolean diaCorrecto(char dia) {
		if(dia=='L' || dia=='M' || dia=='X' || dia=='J' || dia=='V' || dia=='S' || dia=='D')
			return true;
		return false;
	}
	
	public static double calcularPrecio(char dia, int edad) {
		final double PRECIO=5;
		double precioFinal;
		
		precioFinal=PRECIO;
		
		if(dia == 'M' && edad >65)
			precioFinal=precioFinal*0.5;
		if(dia == 'X')
			precioFinal=precioFinal*0.8;
		if((dia=='S' || dia=='D') && edad<18) 
			precioFinal=precioFinal*0.85;
		
		return precioFinal;
	}
}
