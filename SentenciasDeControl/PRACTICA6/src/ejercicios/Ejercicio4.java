package ejercicios;

import java.util.Scanner;

/**
 * En un museo se tienen las siguientes tarifas:
 * 
 * 			  Normal    Reducida
 * Adultos    3 euros   2 euros
 * Niños      2 euros   1,2 euros
 * 
 * Hacer un programa en el que se simula la compra de entradas en el museo de la siguiente forma:
 * 
 * Por cada grupo que llega se anota el número de adultos y el número de niños y si se aplica
 * tarifa reducida o no. Con esta información se calcula el importe total de las entradas de
 * cada grupo y se muestra por pantalla. El programa termina cuando se hayan recaudado
 * más de 100 euros.
 * 
 * Mostrar al final el número de entradas del grupo que más entradas ha comprado.
 * */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		boolean next=true;
		int contGrup=1,adultos,peques;
		char tarifa;
		final double adultosN=3,adultosR=2,pequesN=2,pequesR=1.2;
		double adultosTotal,pequesTotal;
		
		System.out.println("-----BIENVENIDOS AL MUSEO-----");
		
		do {
			System.out.println("Grupo "+contGrup+" :");
			System.out.println("¿Cuántos adultos sois?");
			adultos=sc.nextInt();
			System.out.println("¿Cuántos niños sois?");
			peques=sc.nextInt();
			
			while(adultos==0 && peques==0) {
				System.out.println("Error. Vuelva a introducir los datos.");
				System.out.println("¿Cuántos adultos sois?");
				adultos=sc.nextInt();
				System.out.println("¿Cuántos niños sois?");
				peques=sc.nextInt();
			}
			
			System.out.println("¿Se aplica tarifa reducida?");
			tarifa=sc.nextLine().charAt(0);
			
			while(tarifa!='s' && tarifa!='n') {
				System.out.println("Error, vuelva a introducir el dato.");
				System.out.println("¿Se aplica tarifa reducida?");
				tarifa=sc.nextLine().charAt(0);
			}
			
			if(tarifa=='s') {
				adultosTotal=adultosR*adultos;
			}
			
			contGrup++;
			
		}while(next);
	}

}
