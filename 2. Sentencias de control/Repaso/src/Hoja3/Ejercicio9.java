package Hoja3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora, min, seg;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la hora: ");
		hora=sc.nextInt();
		System.out.println("Introduce los minutos: ");
		min=sc.nextInt();
		System.out.println("Introduce los segundos: ");
		seg=sc.nextInt();
		
		System.out.println("La hora actual es: "+hora+":"+min+":"+seg);
		
		if (seg <59)
			seg++;
		else
			if (seg == 59 && min <59) {
				seg=0;
				min++;
			}
			else
				if (seg == 59 && min == 59 && hora <23) {
					seg=0;
					min=0;
					hora++;
				}
				else
					if (seg == 59 && min == 59 && hora == 23) {
						seg=0;
						min=0;
						hora=0;
					}
		System.out.println("La hora un segundo después es: "+hora+":"+min+":"+seg);
	}

}
