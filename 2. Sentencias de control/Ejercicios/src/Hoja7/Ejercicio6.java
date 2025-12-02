package Hoja7;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Programa que lee fechas en formato dd( 1 al 31), mm ( 1 a 12) y aa (4 dígitos) y
		obtiene el número de orden del día en el total del año.
		Ejemplo:
		3 de Febrero ............ día 34

		Leer tantas fechas como el usuario quiera, utilizar un método que recibe dd ,
		mm aa y retorna un entero.*/
		
		int dia, mes, año,total;
		boolean continuar=true;
		Scanner sc=new Scanner (System.in);
		
		do {
			System.out.println("Introduce un día: ");
			dia=sc.nextInt();
			System.out.println("Introduce un mes: ");
			mes=sc.nextInt();
			System.out.println("Introduce un año: ");
			año=sc.nextInt();	
			if (validarFecha(dia,mes,año)==false)
				System.out.println("Fecha incorrecta");
			else {
			total=diasAño(dia,mes,año);
			System.out.println("El día del año es: "+total);
			}
			System.out.println("¿Quieres anotar otra fecha? (true/false)");
			continuar=sc.nextBoolean();
		}while(continuar);
		
			
	}
	public static boolean validarFecha(int dia,int mes,int año) {
		if (año<0)
			return false;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia<1 || dia>31)
				return false;
			return true;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia<1 || dia>30)
				return false;
			return true;
		case 2:
			if (esBisiesto(año))
				if (dia<1 || dia>29)
					return false;
				else
					return true;
			else
				if (dia<1 || dia>28)
					return false;
				else
					return true;
		default:
			return false;
		}
	}
	public static int diasAño(int d, int m, int a) {
		int totalDias=0;
		for(int i=1;i<m;i++) {
			totalDias=totalDias+diasMes(i,a);
		}
			return d+totalDias;
	}
	public static int diasMes(int m, int a) {
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if (esBisiesto(a))
				return 29;
			else
				return 28;
		default:
			return -1;
		}
	}
	public static boolean esBisiesto(int a) {
		if ((a % 4 == 0 && a % 10 != 0) || a % 400 == 0)
			return true;
		return false;
	}
	// diasMes (1,2022) -> 31
	// diasMes (4,2023) -> 30
	// diasMes (2,2024) -> 29
	// diasMes (2,2025) -> 28
	
	/*13 mayo
	 * diasMes (1,2025) -> 31
	// diasMes (2,2025) -> 28
	// diasMes (3,2025) -> 31
	// diasMes (4,2025) -> 30
	///
	///+ los 13 dias de mayo ---- 31+28+31+30+13 = 133 / el dia 133 es el 13 de Mayo
	 */
	
}
