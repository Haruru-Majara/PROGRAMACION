package ejercicios;

import java.util.Scanner;

/**
 * Programa que nos dice si una palabra se lee igual del derecho que del revés.
 * */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String palabra,palabraReves="";
		int largo;
		boolean iguales=true;
		
		System.out.println("Escribe una palabra: ");
		palabra=sc.nextLine();
		
		for(int i=palabra.length()-1;i>=0;i--) {
			palabraReves=palabraReves+palabra.charAt(i);
		}
		
		//System.out.println(palabraReves.trim());
		
		for(int j=0;j<palabra.length();j++) {
			//System.out.println(palabra.charAt(j));
			if(palabra.charAt(j)!=palabraReves.charAt(j))
				iguales=false;
		}
		
		System.out.println("La palabra se escribe igual al derecho que del revés: "+iguales);
	}

}
