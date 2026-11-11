package ejercicios;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Programa que lee dos horas (horas y minutos) y nos dice los minutos transcurridos entre ambas.
 * */

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int hora,minuto;
		LocalTime hora1,hora2;
		long minutos;
		
		do{
			System.out.println("PRIMERA HORA: ");
			System.out.println("Introduce una hora: (00-23)");
			hora=sc.nextInt();
			System.out.println("Introduce unos minutos: (00-59)");
			minuto=sc.nextInt();
			
			if(!validarFecha(hora,minuto))
				System.out.println("Hora no válida, vuelva a introducir los datos.");
			
			System.out.println(" ");
		}while(!validarFecha(hora,minuto));
		
		hora1=LocalTime.of(hora, minuto);
				
		do {
			System.out.println("SEGUNDA HORA: ");
			System.out.println("Introduce una hora: (00-23)");
			hora=sc.nextInt();
			System.out.println("Introduce unos minutos: (00-59)");
			minuto=sc.nextInt();
			
			if(!validarFecha(hora,minuto))
				System.out.println("Hora no válida, vuelva a introducir los datos.");
			
			System.out.println(" ");
		}while(!validarFecha(hora,minuto));
		
		hora2=LocalTime.of(hora, minuto);
		
		if(hora1.isBefore(hora2)) {
			minutos=ChronoUnit.MINUTES.between(hora1, hora2);
			System.out.println("Entre las "+hora1+" y las "+hora2+" han pasado: "+minutos+" minutos.");
		}else {
			minutos=ChronoUnit.MINUTES.between(hora2, hora1);
			System.out.println("Entre las "+hora2+" y las "+hora1+" han pasado: "+minutos+" minutos.");
		}
	}
	public static boolean validarFecha(int h, int m) {
		LocalTime fecha;
		
		try {
			fecha=LocalTime.of(h, m);
			return true;
		}catch(DateTimeException e) {
			return false;
		}
		
	}
}
