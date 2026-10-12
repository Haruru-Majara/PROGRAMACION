package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa que lee una secuencia de notas (0 – 10) terminada al introducir –1 y
 * cuenta el no de suspensos, aprobados, notables y sobresalientes. Validar que las
 * notas introducidas sean correctas.
 * */
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		double nota;
		int sus=0,aprob=0,not=0,sobre=0;
		
		do {
			System.out.println("Introducir nota: ");
			nota=sc.nextDouble();
			
			if(nota<-1 || nota >10)
				System.out.println("Nota introducida incorrecta, inténtelo de nuevo. ");
			
			if(nota==-1)
				break;
			else
				if(nota>=0 && nota<5)
					sus++;
				else
					if(nota<=6)
						aprob++;
					else
						if(nota<=8)
							not++;
						else
							sobre++;
		}while(nota!=-1);
		
		System.out.println("Número de suspesos: "+sus);
		System.out.println("Número de aprobados: "+aprob);
		System.out.println("Número de notables: "+not);
		System.out.println("Número de sobresalientes: "+sobre);
	}

}
