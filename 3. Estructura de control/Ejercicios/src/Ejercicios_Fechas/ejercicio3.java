package Ejercicios_Fechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Leer una fecha por teclado (día, mes y año) y calcular la nueva fecha transcurridos un no de días anotado por teclado.
		
		LocalDate fecha = null;
		int dia, mes, año, dias = 0;
		boolean correcto = false;

		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.println("Introduce día: ");
				dia = sc.nextInt();
				System.out.println("Introduce mes: ");
				mes = sc.nextInt();
				System.out.println("Introduce año: ");
				año = sc.nextInt();

				fecha = LocalDate.of(año, mes, dia); // hacer un patron
				correcto = true;
			} catch (DateTimeException e) {
				System.out.println("Fecha incorrecta");
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("No se pueden introducir caracteres");
			}

		} while (correcto == false);

		correcto = false;
		do {

			try {
				System.out.println("Introduce número de días:");
				dias = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("No se pueden introducir caracteres");
			}
		} while (!correcto);

		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yy");
				
		System.out.println(fecha.plusDays(dias).format(patron)); //plusDays los suma minusDays los resta
	}

}
