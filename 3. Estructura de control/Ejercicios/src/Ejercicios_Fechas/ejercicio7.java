package Ejercicios_Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// Lee la fecha de nacimiento de una persona y calcula su edad.
		LocalDate fecha=null;
		
		boolean correcto=false;
		
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		
		Scanner sc=new Scanner (System.in);
		
		do {
			System.out.println("Introduce fecha con formato dd/MM/yyyy");
			String fechaS=sc.nextLine();
			
			try {
				fecha=LocalDate.parse(fechaS,patron);
				correcto=true;
			} catch (DateTimeParseException e) {
				System.out.println("Formato de fecha no valido");
			}
		
		}while(!correcto);
		
		long años=Math.abs(ChronoUnit.YEARS.between(fecha, LocalDate.now()));
		
		System.out.println("Tienes "+años+" años");
	}

}
