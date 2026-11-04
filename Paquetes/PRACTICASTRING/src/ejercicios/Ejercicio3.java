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
		String nom,ape1,ape2=" ",codigo;
		numPer=r.nextInt(5)+1;
		
		System.out.println("Pediremos el nombre de "+numPer+" persona/s: ");
		do {
			System.out.println("Anota un nombre: ");
			nom=sc.nextLine().toUpperCase();
			System.out.println("Anota un apellido: ");
			ape1=sc.nextLine().toUpperCase();
			
			if(ape1.length()<3) {
				System.out.println("Anota un segundo apellido: ");
				ape2=sc.nextLine().toUpperCase();
			}
			
		codigo=generarCodigo(nom,ape1,ape2);
		
		System.out.println("El código es: "+codigo);
		
		cont++;
		System.out.println(" ");
		}while(cont<numPer);
	}
	public static String generarCodigo (String n, String a1, String a2) {
		String codigo=" ";
		
		if(a1.length()>=3)
			codigo=n.substring(0,1)+a1.substring(0, 3);
		else {
			if(a1.length()<3 && a2.length()>=3)
				codigo=n.substring(0,1)+a2.substring(0, 3);
			else {
				if(a2.length()<3) {
					if(a1.length()>a2.length())
						codigo=n.substring(0,1)+a1;
					else
						codigo=n.substring(0,1)+a2;
				}
			}
		}
		
		return codigo;
	}
}
