package Ejercicios_Excepciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ejercicio2 {

	static Scanner sc;
	public static void main(String[] args) {
		// Haced una función que lea una fecha en formato dd/MM/aa mientras sea incorrecta.
		LocalDate fecha=null;
		boolean correcto=false;
		
		sc =new Scanner(System.in);
		
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		
		do {
			correcto = validarFormato(fecha);
		}while (!correcto);
		
	}
	public static boolean validarFormato (LocalDate fecha) {
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		boolean correcto=false;
		
		do {
			System.out.println("Introduce una fecha: ");
			String fechaS = sc.nextLine();
			
			try {
				java.time.LocalDate fechaF = LocalDate.parse(fechaS,patron);
				correcto=true;
			} catch (DateTimeParseException e) {
				System.out.println("Error, vuelve a introducir la fecha");
			}
			
		}while(!correcto);
		return correcto;
	}
}
