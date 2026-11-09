package ejercicios;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Muestra el día, mes y año actual, incluido el día de la semana.
 * */

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char saber;
		LocalDate fechaActual;
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		
		do {
			System.out.println("¿Quieres saber la fecha de hoy?");
			saber=Character.toUpperCase(sc.nextLine().charAt(0));
			
			if(saber!='S' && saber!='N')
				System.out.println("Error, introducir de nuevo respuesta.");
			
			System.out.println(" ");
		}while(saber!='S' && saber!='N');
			
		if(saber=='S') {
			fechaActual=LocalDate.now();
			System.out.println("Fecha de hoy formato inglés: "+fechaActual);
			System.out.println("Fecha actual con otro formato: "+fechaActual.getDayOfMonth()+"/"+fechaActual.getMonthValue()+"/"+fechaActual.getYear());
			System.out.println("Fecha de hoy con patron a español: "+patron.format(fechaActual));
			
			switch(fechaActual.getDayOfWeek().getValue()) {
			case 1:
				System.out.println("Día de la semana: Lunes");
				break;
			case 2:
				System.out.println("Día de la semana: Martes");
				break;
			case 3:
				System.out.println("Día de la semana: Miércoles");
				break;
			case 4:
				System.out.println("Día de la semana: Jueves");
				break;
			case 5:
				System.out.println("Día de la semana: Viernes");
				break;
			case 6:
				System.out.println("Día de la semana: Sábado");
				break;
			case 7:
				System.out.println("Día de la semana: Domingo");
				break;
			}
		}else {
			System.out.println("Vale, pues tú te lo pierdes :(");
		}
	}

}
