package Ejercicios_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		/* Programa que lee números de teclado hasta anotar un 0 y calcula su media.
		Usa excepciones para que si el usuario se equivoca al introducir un número se
		muestre un error y se vuelva a pedir, también usa una excepción para controlar
		la división por cero.*/

		int numero=0,acumulador=0,contador=0;
		double media=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Introduce un número: ");
				numero = sc.nextInt();
				if (numero!=0) {
					acumulador=acumulador+numero;
					contador++;
				}
				media=acumulador/contador;
			}catch (InputMismatchException e) {
				System.out.println("No puede ser un caracter");
				numero=-1;
				sc.nextLine(); 
			}catch (ArithmeticException e) {
				System.out.println("No se puede dividir entre 0");
			}
		}while(numero != 0);
		
		System.out.println("La media de los números anotados es: "+media);

	}

}
