package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio7b {

	public static void main(String[] args) {
		//*Programa que lee una cadena y un carácter y cuenta el número de veces que aparece dicho carácter en la cadena.*/
		String cadena;
		char letra;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe algo: ");
		cadena=sc.nextLine();
		
		System.out.println("Introduce una letra");
		letra=sc.nextLine().charAt(0);
		
		System.out.println("El número de veces que ha salido el carácter: "+" "+letra+" "+" es :"+contarVeces(cadena,letra));
		
	}
	public static int contarVeces(String cadena, char letra) {
		int contador=0;
		for (int i=0;i<cadena.length();i++) {
			if (cadena.charAt(i)==letra)
				contador++;
		}
		return contador;
	}
}
