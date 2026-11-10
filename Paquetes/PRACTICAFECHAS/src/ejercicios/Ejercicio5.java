package ejercicios;

import java.time.DateTimeException;
import java.time.LocalTime;
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
		
		do{
			System.out.println("PRIMERA HORA: ");
			System.out.println("Introduce una hora: (00-23)");
			hora=sc.nextInt();
			System.out.println("Introduce unos minutos: (00-59)");
			minuto=sc.nextInt();
			
			if(!validarFecha(hora,minuto))
				System.out.println("Fecha no válida, vuelva a introducir los datos.");
			
			System.out.println(" ");
		}while(!validarFecha(hora,minuto));
		
		fecha1=
		do {
			System.out.println("SEGUNDA HORA: ");
			System.out.println("Introduce una hora: (00-23)");
			hora=sc.nextInt();
			System.out.println("Introduce unos minutos: (00-59)");
			minuto=sc.nextInt();
			
			if(!validarFecha(hora,minuto))
				System.out.println("Fecha no válida, vuelva a introducir los datos.");
			
			System.out.println(" ");
		}while(!validarFecha(hora,minuto));
		
		
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
