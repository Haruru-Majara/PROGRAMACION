package ejercicios;

import java.util.Scanner;

/**
 * Programa que lea una hora expresada en segundos transcurridos desde las 12
 * de la noche y la convierta en horas, minutos y segundos o viceversa. Lee una
 * hora como horas, minutos y segundos y la transforma en segundos.
 * */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int h,m,s,op;
		
		System.out.println("1.Hora expresada en segundos para convertir en horas,min y seg");
		System.out.println("2.Hora expresada horas,min y seg y convertirlo en segundos.");
		System.out.println(" ");
		System.out.println("Elige tu opción: ");
		op=sc.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("Segundos que quieres transformar");
			s=sc.nextInt();
			
			m=s/60;
			h=m/60;
			m=m%60;
			s=s%60;
			
			System.out.println("Tu hora es: "+h+":"+m+":"+s);
			break;
		case 2:
			
			System.out.println("Dime una hora: ");
			h=sc.nextInt();
			System.out.println("Dime un minuto: ");
			m=sc.nextInt();
			System.out.println("Dime unos segundos: ");
			s=sc.nextInt();
			
			h=h*60;
			m=m+h;
			m=m*60;
			s=s+m;
			
			System.out.println("Los segundos totales de tu hora son: "+s);
			break;
		default:
			System.out.println("Esta opción no existe.");
		}
	}

}
