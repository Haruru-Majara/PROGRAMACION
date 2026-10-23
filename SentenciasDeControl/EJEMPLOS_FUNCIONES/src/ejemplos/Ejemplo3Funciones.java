package ejemplos;

import java.util.Scanner;

/**
 * Programa que lee un año (cifra de 4 dígitos) y nos dice si es bisiesto. Utilizar
 * una función

			a%4==0 && a%100!=0 || a%400==0
 * */

public class Ejemplo3Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int año;
		boolean bisiesto;
		
		do {
			
			System.out.println("Anota un año: ");
			año=sc.nextInt();
			
			if(año<1000 || año>9999)
				System.out.println("El año anotado no tiene 4 cifras");
			System.out.println(" ");
		}while(año<1000 || año>9999);
		
		bisiesto=esBisiesto(año);
		
		if(bisiesto==true)
			System.out.println("El año "+año+" es bisiesto");
		else
			System.out.println("El año "+año+" no es bisiesto");
	}
	
	public static boolean esBisiesto(int a) {
		if(a%4==0 && a%100!=0 || a%400==0)
			return true;
		
		return false;
	}
}
