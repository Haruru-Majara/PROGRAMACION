package ejercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que lee dos fechas de teclado y nos dice cuántos días hay entre ellas.
 * */

public class Ejercicio4c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		LocalDate fecha1=null,fecha2=null;
		
		fecha1=leerFecha(sc);
		fecha2=leerFecha(sc);
		
		long dias=ChronoUnit.DAYS.between(fecha1, fecha2);
		System.out.println("Diás transcurridos: "+dias);
		
		long meses=ChronoUnit.MONTHS.between(fecha1, fecha2);
		System.out.println("Meses transcurridos: "+meses);
	}

	public static LocalDate leerFecha(Scanner sc) {
		LocalDate fecha=null;
		int dia,mes,año;
		boolean correcta=false;
		String fechaS;
		DateTimeFormatter patron= DateTimeFormatter.ofPattern("dd/LL/yy");
		
		
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
				fecha=LocalDate.of(año,mes,dia); 
				System.out.println("Fecha correcta");
				System.out.println(fecha);
				correcta=true; 
				
			}catch(DateTimeParseException e){
				System.out.println("Fecha incorrecta");
			}
			System.out.println(" ");
		}while(correcta==false);
		
		return fecha;
	}
}
