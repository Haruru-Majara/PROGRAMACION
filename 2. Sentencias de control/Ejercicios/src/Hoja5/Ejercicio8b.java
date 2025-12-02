package Hoja5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;
		double sueldo;
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		for(int i=0;i<10;i++) {
			System.out.println("Introduce sueldo: ");
			sueldo=sc.nextDouble();
			if (sueldo>1000)
				cont=cont+1;
		}
		System.out.println("En total hay: "+ cont+" empleados que cobran más de mil.");
	}

}
