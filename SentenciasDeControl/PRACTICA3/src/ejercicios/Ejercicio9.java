package ejercicios;

import java.util.Scanner;

/**
 * Programa que recibe como datos de entrada una hora expresada en horas, minutos y
 * segundos y nos devuelve la hora, minutos y segundos que serán transcurridos un segundo
 * más tarde
 * */

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hora,min,seg;
		
		System.out.println("Introduce la hora (00 - 23");
		hora=sc.nextInt();
		System.out.println("Introduce los minutos (00 - 59");
		min=sc.nextInt();
		System.out.println("Introduce los segundos (00 - 59");
		seg=sc.nextInt();
		
		System.out.println("Vamos a semarle un segundo a: "+hora+":"+min+":"+seg);
	}

}
