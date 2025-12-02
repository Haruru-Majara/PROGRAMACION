package Hoja5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alumno=0, edad, edadMedia, sumaEdad= 0, mayores=0, medir=0;
		double estatura, estMedia, sumaEstatura=0;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		do {
			System.out.println("Dime tu edad: ");
			edad=sc.nextInt();
		
			System.out.println("Y tu estatura: ");
			estatura=sc.nextDouble();
			
			alumno=alumno+1;
			sumaEdad=sumaEdad+edad;
			sumaEstatura=sumaEstatura+estatura;
			
			if (edad > 18) 
				mayores=mayores+1;
		
			if (estatura > 1.75) 
				medir=medir+1;
			
		}while (alumno <5 );
		
		edadMedia=sumaEdad/alumno;
		estMedia=sumaEstatura/alumno;
		System.out.println("La media de edad es: "+edadMedia);
		System.out.println("La media de estatura es: "+estMedia);
		System.out.println("Los alumnos que tienen más de 18 años son: "+mayores);
		System.out.println("Los alumnos que miden más de 1.75 son: "+medir);
	}

}
