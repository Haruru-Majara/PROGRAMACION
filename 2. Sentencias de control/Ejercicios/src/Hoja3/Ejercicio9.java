package Hoja3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora, minuto, segundo;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Qué hora tienes?:");
		hora=sc.nextInt();
		System.out.println("¿Qué minutos tienes?:");
		minuto=sc.nextInt();
		System.out.println("¿Qué segundos tienes?:");
		segundo=sc.nextInt();
		
		if (hora <23 && minuto <59 && segundo <59) {
			segundo=segundo + 1;
			System.out.println("La hora es esta: "+hora+":"+minuto+":"+segundo);
		}
		else
			if (hora <23 && minuto <59 && segundo == 59 ) {
				segundo = 0;
				minuto= minuto+ 1;
				//System.out.println("La hora es esta: "+hora+":"+minuto+":"+segundo);
			}
			else
				if (hora <23 && minuto == 59 && segundo == 59) {
					segundo = 0;
					minuto = 0;
					hora= hora + 1;
					//System.out.println("La hora es esta: "+hora+":"+minuto+":"+segundo);
				}
				else
					if (hora ==23 && minuto ==59 && segundo ==59) {
						segundo = 0;
						minuto = 0;
						hora = 0;
						//System.out.println("La hora es esta: "+hora+":"+minuto+":"+segundo);
					}
		System.out.println("La hora es esta: "+hora+":"+minuto+":"+segundo);
	
	}

}
