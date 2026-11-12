package ejercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que lea tu fecha de nacimiento y diga el día de la semana (lunes, martes, miércoles...).
 * */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		boolean exito;
		int d,m,a;
		LocalDate fecha;
		
		do {
			exito=false;
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
			exito=validarFecha(d,m,a);
			if(!exito)
				System.out.println("Fecha incorrecta, inténtelo de nuevo.");
			System.out.println(" ");
		}while(!exito);
		
		fecha=LocalDate.of(a, m, d);
		
		
		
		
		switch(fecha.getDayOfWeek().getValue()) {
		case 1:
			System.out.println("Día de la semana en el que naciste: Lunes");
			break;
		case 2:
			System.out.println("Día de la semana en el que naciste: Martes");
			break;
		case 3:
			System.out.println("Día de la semana en el que naciste: Miércoles");
			break;
		case 4:
			System.out.println("Día de la semana en el que naciste: Jueves");
			break;
		case 5:
			System.out.println("Día de la semana en el que naciste: Viernes");
			break;
		case 6:
			System.out.println("Día de la semana en el que naciste: Sábado");
			break;
		case 7:
			System.out.println("Día de la semana en el que naciste: Domingo");
			break;
		}
		
	}
	
	public static boolean validarFecha(int d,int m,int a) {
		LocalDate fecha;
		
		if (a<=0)
			return false;
		try{
			fecha=LocalDate.of(a,m,d); 
			return true; 
			
		}catch(DateTimeException e){
			return false;
		}
	}
}
