package ejercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lee dos fechas de teclado (día, mes y año) y ordénalas de menor a mayor.
 * */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		
		LocalDate fecha1,fecha2;
		boolean correcta1=false,correcta2=false;
		int d=0, m=0, a=0;
		
		
			do {
				System.out.println("---PRIMERA FECHA--- ");
				try {
					System.out.println("Introduce dia: ");
					d=sc.nextInt();
					System.out.println("Introduce mes: ");
					m=sc.nextInt();
					System.out.println("Introduce año: ");
					a=sc.nextInt();
				}catch(InputMismatchException e) {
					sc.nextLine(); //Limpio por producirse la InputMismatchException
					//si no quedaria en bucle infinito
					System.out.println("Los datos introducidos tienen que ser números");
					System.out.println(" ");
				}
				
				try{
					fecha1=LocalDate.of(a,m,d); 
					System.out.println("Fecha correcta");
					System.out.println(fecha1);
					correcta1=true; 
					
				}catch(DateTimeException e){
					System.out.println("Fecha incorrecta");
				}
				
				System.out.println(" ");
			}while(correcta1==false);
			
			do {
				System.out.println("---SEGUNDA FECHA---");
				try {
					System.out.println("Introduce dia: ");
					d=sc.nextInt();
					System.out.println("Introduce mes: ");
					m=sc.nextInt();
					System.out.println("Introduce año: ");
					a=sc.nextInt();
				}catch(InputMismatchException e) {
					sc.nextLine(); //Limpio por producirse la InputMismatchException
					//si no quedaria en bucle infinito
					System.out.println("Los datos introducidos tienen que ser números");
					System.out.println(" ");
				}
				
				try{
					fecha2=LocalDate.of(a,m,d); 
					System.out.println("Fecha correcta");
					System.out.println(fecha2);
					correcta2=true; 
					
				}catch(DateTimeException e){
					System.out.println("Fecha incorrecta");
				}
				
				System.out.println(" ");
			}while(correcta2==false);
			
		
		System.out.println("----Ambas fechas son válidas, vamos a ordenarlas----");
		
		if(fecha1.getYear()>fecha2.getYear())
			System.out.println();
	}

}
