package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Programa que dadas dos cadenas nos dice si la menor está contenida en la
         mayor y si es así nos dice la posición en la cual la ha encontrado.*/
		
		String cadena1,cadena2;
		int pos;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Anota primera cadena: ");
		cadena1=sc.nextLine();
		System.out.println("Anota segunda cadena: ");
		cadena2=sc.nextLine();
		
		if(cadena1.length()>cadena2.length())
			pos=cadena1.indexOf(cadena2);
		else
			pos=cadena2.indexOf(cadena1);
		
		if (pos==-1)
			System.out.println("La cadena no está incluida");
		else
			System.out.println("Cadena encontrada en la posición: "+pos);
	}
 
}
