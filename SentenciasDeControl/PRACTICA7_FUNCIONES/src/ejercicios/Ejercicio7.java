package ejercicios;

import java.util.Scanner;

/**
 *Programa que lee números (1 a 365) correspondientes al número de orden de
 *un día y nos dice la fecha
 *
 *Ejemplo:
 *
 *34 ................. 3 de Febrero
 *
 *Leer tantos números como el usuario quiera, utilizar un método que recibe un
 *número y escribe la fecha.
 * */

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int dias,año;
		boolean continuar,bisiesto;
		
		do {
			do {
				System.out.println("Introduce año: ");
				año=sc.nextInt();
				
				if(año<1000)
					System.out.println("Año incorrecto.");
				System.out.println(" ");
			}while(año<1000);
			
			bisiesto=esBisiesto(año);
			
			
			if(bisiesto==true) {
				do {
					System.out.println("Introduce un día entre 1 y 366");
					dias=sc.nextInt();
					if(dias<1 || dias>366)
						System.out.println("Día incorrecto.");
					System.out.println(" ");
				}while(dias<1 || dias>366);
			}else {
				do {
					System.out.println("Introduce un día entre 1 y 365");
					dias=sc.nextInt();
					if(dias<1 || dias>365)
						System.out.println("Día incorrecto.");
					System.out.println(" ");
				}while(dias<1 || dias>365);
			}
			
			sacarFecha(dias,año);
			
			System.out.println(" ");
			System.out.println("¿Quieres continuar?");
			continuar=sc.nextBoolean();
			System.out.println(" ");
		}while(continuar==true);
		
}
	public static boolean esBisiesto(int a) {
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
			return true;
		return false;
	}
	
	public static int diasMes(int m,int a) {
		boolean bisiesto=esBisiesto(a);
		switch (m) {
		case 1,3,5,7,8,10:
			return 31;
		case 4,6,9,11:
			return 30;
		case 2:
			if(bisiesto==true)
				return 29;
			else
				return 28;
		default:
			return 0;
		}
	}
	
	public static void sacarFecha(int d,int a) {
		int m=0,diasTotales=d,diasResta=d;
		while(diasTotales>0) {
			m++;
			diasTotales=diasTotales-diasMes(m,a);
			if(diasTotales>0)
				diasResta=diasTotales;
		}
		switch(m) {
		case 1:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Enero");
			break;
		case 2:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Febrero");
			break;
		case 3:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Marzo");
			break;
		case 4:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Abril");
			break;
		case 5:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Mayo");
			break;
		case 6:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Junio");
			break;
		case 7:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Julio");
			break;
		case 8:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Agosto");
			break;
		case 9:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Septiembre");
			break;
		case 10:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Octubre");
			break;
		case 11:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Noviembre");
			break;
		case 12:
			System.out.println("La fecha que corresponde al día "+d+" es: "+diasResta+" de Diciembre");
			break;
		}	
	}
}
