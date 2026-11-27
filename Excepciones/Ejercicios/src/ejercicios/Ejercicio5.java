package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realizar un programa que quiere calcular el total de emisiones de CO2 de varios
 * vehículos en una ciudad, terminad al anotar F. Hacer una función que reciba el
 * tipo de distintivo del vehículo (0,E,C,B) y los kms recorridos y devuelva las
 * emisiones de co2. Por cada km según el tipo de distintivo se producen las
 * siguientes emisiones:
 * 
 * 0: cero
 * E: 0.001
 * C: 0.02
 * B: 0.05
 * 
 * Si la función recibe un distintivo que no es ninguno de los anteriores, devuelve
 * una excepción propia DistintivoErroneoException.
 * */

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char distintivo=' ';
		boolean kmsCorrectos=false;
		int kms=0;
		int vehiculo=1;
		
		do {
			System.out.println("VEHÍCULO "+vehiculo);
			System.out.println(" ");
			do {
				try {
					System.out.println("Anota kilómetros: ");
					kms=sc.nextInt();
					kmsCorrectos=true;
				}catch(InputMismatchException e) {
					sc.nextLine();
					System.out.println("No se esperaba un caracter");
				}
			}while(kmsCorrectos==false);
			
			sc.nextLine();
			try {
				System.out.println("Anota distintivo (0,E,C,B): ");
				distintivo=Character.toUpperCase(sc.nextLine().charAt(0));
				
				if(distintivo=='F')
					break;
				System.out.println("Las emisiones que se han hecho han sido de: "+calcularEmisiones(kms,distintivo));
			}catch(DistintivoErroneoException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(" ");
			vehiculo++;
			kmsCorrectos=false;
		}while(distintivo!='F');
			
	}

	public static double calcularEmisiones(int kms, char dist) throws DistintivoErroneoException{
		
		switch(dist) {
		case '0':
			return 0;
		case 'E':
			return kms*0.001;
		case 'C':
			return kms*0.02;
		case 'B':
			return kms*0.05;
		default:
			throw new DistintivoErroneoException("No se reconoce el distintivo");	
		}
	}
}
