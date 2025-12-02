package ejbasicos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3leer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero1, numero2;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce un número (si es decimal usa .):");
		numero1=sc.nextDouble();
		
		System.out.println("Introduce otro número (si es decimal usa .):");
		numero2=sc.nextDouble();
		
		double suma=numero1+numero2;
		System.out.println(numero1 + " + "+numero2+" = "+suma);
	}

}
