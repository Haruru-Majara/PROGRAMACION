package Hoja5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota; 
		int suspenso=0,aprobado=0,notable=0,sobresaliente=0;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce una nota del 0-10: ");
		nota=sc.nextDouble();
		
		while (nota !=-1) {
			if (nota >=0 && nota<=10) 
				if (nota <5)
					suspenso++;
				else
					if (nota <7)
						aprobado++;
					else
						if (nota <9)
							notable++;
						else
							if (nota <=10)
								sobresaliente++;
			
			
			System.out.println("Introduce otra nota del 0-10: ");
			nota=sc.nextDouble();
		}
		System.out.println("Hay "+suspenso+" notas suspensas.");
		System.out.println("Hay "+aprobado+" notas aprobadas.");
		System.out.println("Hay "+notable+" notas notables.");
		System.out.println("Hay "+sobresaliente+" notas sobresalientes.");
	}

}
