package Hoja6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0,dia,mes,año, lucky, acumulador=0;
		
		Scanner sc=new Scanner(System.in);
		
		
	
			System.out.println("Introduce tu fecha de nacimiento: ");
			System.out.println("Día: ");
			dia=sc.nextInt();
			System.out.println("Mes: ");
			mes=sc.nextInt();
			System.out.println("Año: ");
			año=sc.nextInt();
			
			suma=dia+mes+año;
			
	
			while (suma >0) {
				acumulador=acumulador+suma %10;
				suma=suma/10;
			}
			suma = acumulador;
			
		System.out.println("Tu número de la suerte es: "+suma);
	}

}
