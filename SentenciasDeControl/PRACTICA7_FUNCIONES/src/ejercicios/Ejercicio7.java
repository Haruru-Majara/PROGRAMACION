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
					if(dias<1 && dias>366)
						System.out.println("Día incorrecto.");
				}while(dias<1 && dias>366);
			}else {
				do {
					System.out.println("Introduce un día entre 1 y 365");
					dias=sc.nextInt();
					if(dias<1 && dias>365)
						System.out.println("Día incorrecto.");
				}while(dias<1 && dias>365);
			}
			
			sacarFecha(dias,año);
			
			System.out.println("¿Quieres continuar?");
			continuar=sc.nextBoolean();
		}while(continuar==true);
		
}
	public static boolean esBisiesto(int a) {
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
			return true;
		return false;
	}
	
	public static int diasMes(int m,int a) {
		int dias=0;
		switch (m) {
		case 1:
			dias=31;
			break;
		case 2:
			if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
				dias = 29;
			else
				dias = 28;
			break;
		case 3:
			dias=31;
			break;
		case 4:
			dias=30;
			break;
		case 5:
			dias=31;
			break;
		case 6:
			dias=30;
			break;
		case 7:
			dias=31;
			break;
		case 8:
			dias=31;
			break;
		case 9:
			dias=30;
			break;
		case 10:
			dias=31;
			break;
		case 11:
			dias=30;
			break;
		}
		return dias;
	}
	
	public static void sacarFecha(int d,int a) {
		int m=0,diasTotales=d,diasResta=d;
		while(d>0) {
			d=d-diasMes(d,a);
			m++;
		}
		System.out.println("La fecha que corresponde al día "+diasTotales+" es: "+d+" de "+m);
	}
}
