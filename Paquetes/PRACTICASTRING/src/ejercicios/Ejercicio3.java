package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa que lee nombre y primer apellido de personas. Para cada una de ellas
 * genera un código con la primera letra del nombre y las tres primeras del apellido. Si
 * dicho apellido tiene una longitud inferior a 3, se le pide el segundo apellido y se cogen
 * sus tres primeras letras. Si éste, también tiene menos longitud se genera el código con
 * la primera del nombre y el apellido completo que sea más largo de los dos. El código se
 * genera en una función.
 * */

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int numPer,cont=0;
		String nom,ape1,ape2;
		numPer=r.nextInt(5);
		
		do {
			System.out.println("Anota un nombre: ");
			nom=sc.nextLine().toUpperCase();
			System.out.println("Anota un apellido: ");
			ape1=sc.nextLine().toUpperCase();
			
			if(ape1.length()<3) {
				System.out.println("Anota un segundo apellido: ");
				ape2=sc.nextLine().toUpperCase();
			}
			
		}while(cont<numPer);
	}
	public static void generarCodigo (String n, String a1, String a2) {
		String codigo;
		
		if(a1.length()>=3)
			n=n.
	}
}
