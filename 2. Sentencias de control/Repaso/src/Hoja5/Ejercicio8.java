package Hoja5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salarioSuper=0;
		double salario;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		for (int i=0; i<10 ; i++) {
			System.out.println("Introduce un salario: ");
			salario=sc.nextDouble();
			
			if (salario <=0) {
				System.out.println("ERROR en la cifra del salario.");
			 	System.exit(0);
			}
			else
			 	if (salario >1000)
			 		salarioSuper++;
		}
		System.out.println("Las personas que ganan más de 1000 euros son "+salarioSuper);
	}

}
