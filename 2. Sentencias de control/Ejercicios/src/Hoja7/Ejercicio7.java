package Hoja7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/* Programa que lee números (1 a 365) correspondientes al número de orden de un día y nos dice la fecha
			Ejemplo:
						34 ................. 3 de Febrero

			Leer tantos números como el usuario quiera, utilizar un método que recibe un
			número y escribe la fecha.*/
		
		int num, año;
		boolean seguir=true;
		
		Scanner sc=new Scanner (System.in);
		
		do {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			System.out.println("Introduce el año: ");
			año=sc.nextInt();
			sacarFecha(num,año);
			System.out.println("¿Quieres sacar otra fecha?");
			seguir=sc.nextBoolean();
			if (seguir == false)
				System.exit(0);
		}while(seguir);
		
		
	}
	public static void sacarFecha (int num,int año) {
		 int m=1, diames;
		 
		 int dia;
		 
		 while(m<=12) {
			 diames=diasMes(m,año);
			 num=num-diames;
			 if (num==0) {
				 System.out.println(diames + "/"+m+"/"+año);
				 break;
			 }
			 if (num<0) {
				 System.out.println((num+diames) );
			 }
			 m++;
			 
		 }
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
	
	public static boolean esBisiesto (int año) {
		if (año % 4 == 0 && año % 100 !=0 || año % 400 == 0)
			return true;
		return false;
	}
}
