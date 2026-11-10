package ejercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que lee dos fechas de teclado y nos dice cuántos días hay entre ellas.
 * */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int dia,mes,año;
		LocalDate fecha1=null,fecha2=null;
		boolean correcta=false;;
		
		do {
			try {
				System.out.println("Introduce dia: ");
				dia=sc.nextInt();
				System.out.println("Introduce mes: ");
				mes=sc.nextInt();
				System.out.println("Introduce año: ");
				año=sc.nextInt();
			}catch(InputMismatchException e) {
				sc.nextLine(); //Limpio por producirse la InputMismatchException
				//si no quedaria en bucle infinito
				System.out.println("Los datos introducidos tienen que ser números");
				System.out.println(" ");
				continue; //volver al principio del bucle
			}
			try{
				fecha1=LocalDate.of(año,mes,dia); 
				System.out.println("Fecha correcta");
				System.out.println(fecha1);
				correcta=true; 
				
			}catch(DateTimeException e){
				System.out.println("Fecha incorrecta");
			}
			System.out.println(" ");
		}while(correcta==false);
		
		do {
			try {
				System.out.println("Introduce dia: ");
				dia=sc.nextInt();
				System.out.println("Introduce mes: ");
				mes=sc.nextInt();
				System.out.println("Introduce año: ");
				año=sc.nextInt();
			}catch(InputMismatchException e) {
				sc.nextLine(); //Limpio por producirse la InputMismatchException
				//si no quedaria en bucle infinito
				System.out.println("Los datos introducidos tienen que ser números");
				System.out.println(" ");
				continue; //volver al principio del bucle
			}
			try{
				fecha2=LocalDate.of(año,mes,dia); 
				System.out.println("Fecha correcta");
				System.out.println(fecha2);
				correcta=true; 
				
			}catch(DateTimeException e){
				System.out.println("Fecha incorrecta");
			}
			System.out.println(" ");
		}while(correcta==false);
		
		long dias=ChronoUnit.DAYS.between(fecha1, fecha2);
		System.out.println("Diás transcurridos: "+dias);
		
		long meses=ChronoUnit.MONTHS.between(fecha1, fecha2);
		System.out.println("Meses transcurridos: "+meses);
	}

}
