package ejemplosfechas;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que lee fechas hasta que el usuario anote una correcta
 * */


public class ValidarFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		
		LocalDate fecha;
		boolean correcta=false;
		int dia=0, mes=0, año=0;
		
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
		
	}

}
