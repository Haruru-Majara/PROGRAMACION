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
		
		int contGrup=1,adultos,peques,entradas,entradasMayor=0;
		char tarifa;
		final double AdulN=3,AdulR=2,PequeN=2,PequeR=1.2;
		double adultosTotal=0,pequesTotal=0,importeGrupo,importeTotal=0;
		
		System.out.println("-----BIENVENIDOS AL MUSEO-----");
		
		//Hace un bucle hasta que el importeTotal sea mayor que 100
		do {
			System.out.println(" ");
			System.out.println("Grupo "+contGrup+" :"); //muestra el grupo en el que estamos
			System.out.println("¿Cuántos adultos sois?"); //pregunta n adultos
			adultos=sc.nextInt();
			System.out.println("¿Cuántos niños sois?"); //pregunta n niños
			peques=sc.nextInt();
			
			//si niños y adultos son 0 da error y vuelve a preguntar por ambos
			while(adultos==0 && peques==0) {
				System.out.println("Error. Vuelva a introducir los datos.");
				System.out.println("¿Cuántos adultos sois?");
				adultos=sc.nextInt();
				System.out.println("¿Cuántos niños sois?");
				peques=sc.nextInt();
			}
			
			sc.nextLine();
			//pregunta si tarifa es reducima con s y n
			System.out.println("¿Se aplica tarifa reducida? (s/n)");
			tarifa=sc.nextLine().charAt(0);
			
			//aqui si tarifa no es ni s ni n entonces da error y vuelve a preguntar
			while(tarifa!='s' && tarifa!='n') {
				System.out.println("Error, vuelva a introducir el dato.");
				System.out.println("¿Se aplica tarifa reducida?");
				tarifa=sc.nextLine().charAt(0);
			}
			
			//aqui estamos viendo si tarifa es s o n
			if(tarifa=='s') {
				adultosTotal=AdulR*adultos;
				pequesTotal=PequeR*peques;
			}else {
				adultosTotal=AdulN*adultos;
				pequesTotal=PequeN*peques;
			}
			
			//contabilizar el total de importeGrupo e importeTotal para poder parar
			importeGrupo=adultosTotal+pequesTotal;
			importeTotal=importeTotal+importeGrupo;
			
			if(importeTotal>100) {
				System.out.println("Lo sentimos el límite ha sido excedido, no hemos podido realizar la operación.");
				break;
			}
			
			System.out.println("Importe total del grupo: "+importeGrupo);
			
			//contabiliza las entradas para mostrar al final el mayor numero de entradas
			entradas=adultos+peques;
			if(entradas>entradasMayor)
				entradasMayor=entradas;
		
			//suma a la variable 1 para al principio del bucle mostrarla y organizar los grupos
			contGrup++;
			
		}while(importeTotal<=100);
		
		System.out.println("");
		System.out.println("El grupo que más entradas ha comprado ha sido de: "+entradasMayor);
	}

}