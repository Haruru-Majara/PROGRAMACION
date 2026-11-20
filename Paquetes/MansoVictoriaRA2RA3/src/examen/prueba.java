package examen;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		LocalTime horaMaxima=LocalTime.of(23, 00);
		LocalTime ahora=LocalTime.now();
		int horas=0,hora,minuto;
		LocalTime hDevolver=null;
		boolean horaCorrecta=false;
		
		do {
			try {
				System.out.println("Hora a la que devuelves el patinete: ");
				System.out.println("Hora: ");
				hora=sc.nextInt();
				System.out.println("Minuto: ");
				minuto=sc.nextInt();
			
				hDevolver=LocalTime.of(hora, minuto);
				
				if(hDevolver.isBefore(horaMaxima)) {
					System.out.println("La hora marcada de la devolución es: "+hDevolver);
					horaCorrecta=true;
				}
				else
					System.out.println("La hora se excede del tiempo pautado.");
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("Se esperaba un número...");
			}catch(DateTimeException e) {
				System.out.println("Hora incorrecta.");
			}
		}while(horaCorrecta==false);
		
		long minutos=ChronoUnit.MINUTES.between(ahora,hDevolver);
		
		System.out.println(minutos);
		//long horas=ChronoUnit.HOURS.between(ahora,hDevolver);
		
		long resto;
		for(int i=0;i<minutos;i++) {
			
			minutos=minutos/60;
			resto=minutos%60;
			i++;
			System.out.println("horas"+i);
			System.out.println("minutos"+minutos);
			System.out.println("restoMinutos"+resto);
			
		}
		System.out.println(horas);
	}

}
