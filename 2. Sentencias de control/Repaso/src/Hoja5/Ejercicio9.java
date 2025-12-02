package Hoja5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad, alumnos=0, mayor18=0,alturaMax=0;
		double altura, edadMedia=0, estaturaMedia=0;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		for (int i=0; i<5; i++) {
			System.out.println("Introduce la edad: ");
			edad=sc.nextInt();
			System.out.println("Introduce la altura: ");
			altura=sc.nextDouble();
			
			edadMedia=edadMedia+edad;
			estaturaMedia=estaturaMedia+altura;
			alumnos++;
			
			if (edad > 18)
				mayor18++;
			if (altura > 1.75 )
				alturaMax++;
		}
		edadMedia=edadMedia/alumnos;
		estaturaMedia=estaturaMedia/alumnos;
		
		System.out.println("La edad media de los alumnos es: "+edadMedia);
		System.out.println("La estatura media de los alumnos es: "+estaturaMedia);
		System.out.println("Los alumnos mayores de 18 años son: "+mayor18);
		System.out.println("Los alumnos que miden mas de 1.75 son: "+alturaMax);
	}

}
