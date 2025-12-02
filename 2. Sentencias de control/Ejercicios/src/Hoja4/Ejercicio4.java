package Hoja4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora, min, seg, sTotales, hTotales, mTotales, opcion;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Elige una opción: ");
		System.out.println("La opción 1 es pasar segundos a horas:minutos:segundos: ");
		System.out.println("La opción 2 es pasar horas:minutos:segundos a segundos: ");
		opcion=sc.nextInt();
		
		switch (opcion) {
		case 1: 
			System.out.println("Escribe los segundos que deseas transformar: ");
			sTotales=sc.nextInt();
			seg=sTotales%60;
			min=(sTotales/60)%60;
			hora=(sTotales/60)/60;
			System.out.println("La hora de "+sTotales+" segundos expresada en horas:minutos:segundos es: "+hora+":"+min+":"+seg);
		break;
		case 2:
			System.out.println("Escribe los segundos que deseas transformar: ");
			seg=sc.nextInt();
			System.out.println("Escribe los minutos que deseas transformar: ");
			min=sc.nextInt();
			System.out.println("Escribe los horas que deseas transformar: ");
			hora=sc.nextInt();
			
			hTotales=hora*60;
			mTotales=(min+hTotales)*60;
			sTotales=mTotales+seg;
			
			System.out.println("La hora "+hora+":"+min+":"+seg+" son estos segundos: "+sTotales);
		break;
		}
	}

}
