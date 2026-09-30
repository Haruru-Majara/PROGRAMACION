package ejercicios;

import java.util.Scanner;

/**
 * Programa que recibe como datos de entrada una hora expresada en horas, minutos y
 * segundos y nos devuelve la hora, minutos y segundos que serán transcurridos un segundo
 * más tarde
 * 
 * Validando también que los datos estén correctos
 * */

public class Ejercicio9b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hora,min,seg;
		
		System.out.println("Introduce la hora (00 - 23):");
		hora=sc.nextInt();
		System.out.println("Introduce los minutos (00 - 59):");
		min=sc.nextInt();
		System.out.println("Introduce los segundos (00 - 59):");
		seg=sc.nextInt();
	
		
		if(hora<0 || hora>23 || min<0 || min>59 || seg<0 || seg>59)
			System.out.println("Hora introducida incorrecta");
		else {
			System.out.println("Vamos a sumarle un segundo a: "+hora+":"+min+":"+seg);
			if(seg!=59) 
				seg++;
			else { //Estoy aqui porque seg es == 59
				if(min!=59) {
					seg=0;
					min++;
				}else { //Estoy aqui porque seg == 59 y min == 59
					if(hora!=23) {
						seg=0;
						min=0;
						hora++;
					}else {//Estoy aqui porque seg == 59 , min == 59 y hora == 23
						seg=0;
						min=0;
						hora=0;
					}
				}
			}
			System.out.println(" ");
			System.out.println("Un segundo después son las: "+hora+":"+min+":"+seg);
		}
		
	}

}
