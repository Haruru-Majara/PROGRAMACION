package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String cadena;
		
		do {
			System.out.println("Anota una cadena: ");
			cadena=sc.nextLine();
			cadena=cadena.toUpperCase();
			System.out.println(cadena);
		}while(cadena.equals("FIN")==false);
	}

}
