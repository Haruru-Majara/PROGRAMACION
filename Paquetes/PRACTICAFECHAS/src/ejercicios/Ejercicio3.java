package ejercicios;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Leer una fecha por teclado (día, mes y año) y calcular la nueva fecha
 * transcurridos un no de días anotado por teclado.
 * */

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		LocalDate fechaInicial=null,fechaFinal=null;
		int diasSumados;
		
		fechaInicial=leerFecha(sc);
		
		System.out.println("Anota dias que quieras que transcurran: ");
		diasSumados=sc.nextInt();
		fechaFinal=fechaInicial.plusDays(diasSumados);
		
		System.out.println("La fecha antigua era: "+fechaInicial.getDayOfMonth()+"/"+fechaInicial.getMonthValue()+"/"+fechaInicial.getYear());
		System.out.println("La nueva fecha es: "+fechaFinal.getDayOfMonth()+"/"+fechaFinal.getMonthValue()+"/"+fechaFinal.getYear());
		
	}
	public static LocalDate leerFecha(Scanner sc) {
		LocalDate fecha=null;
		int dia,mes,año;
		boolean correcta=false;
		
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
				
			}catch(DateTimeException e){
				System.out.println("Fecha incorrecta");
			}
			System.out.println(" ");
		}while(correcta==false);
		
		return fecha;
	}
}
