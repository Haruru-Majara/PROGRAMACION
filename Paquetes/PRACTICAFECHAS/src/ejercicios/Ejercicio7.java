package ejercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lee la fecha de nacimiento de una persona y calcula su edad.
 * */

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int d,m,a;
		LocalDate fechaNac,fechaActual;
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		
		do {
			d=0;
			m=0;
			a=0;
			System.out.println("Introduce la fecha de tu cumpleaños: ");
			try {
				System.out.println("Día: ");
				d=sc.nextInt();
				System.out.println("Mes: ");
				m=sc.nextInt();
				System.out.println("Año: ");
				a=sc.nextInt();
			}catch(InputMismatchException e) {
				sc.nextLine(); //Limpio por producirse la InputMismatchException
				//si no quedaria en bucle infinito
				System.out.println("Los datos introducidos tienen que ser números");
				System.out.println(" ");
				continue; //volver al principio del bucle
			}
			
			if(!validarFecha(d,m,a))
				System.out.println("Fecha incorrecta, inténtelo de nuevo.");
			System.out.println(" ");
		}while(!validarFecha(d,m,a));
		
		fechaNac=LocalDate.of(a, m, d);
		
		System.out.println("Tu fecha de nacimiento es: "+patron.format(fechaNac));
		fechaActual=LocalDate.now();
		Period period = Period.between(fechaNac,fechaActual);
		int años= period.getYears();
		
		System.out.println("Tienes "+años+" años.");
		
	}
	
	public static boolean validarFecha(int d,int m,int a) {
		LocalDate fecha;
		
		try{
			fecha=LocalDate.of(a,m,d); 
			return true; 
			
		}catch(DateTimeException e){
			return false;
		}
	}
}
