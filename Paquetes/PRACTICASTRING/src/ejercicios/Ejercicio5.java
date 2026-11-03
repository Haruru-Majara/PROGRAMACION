package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee tres cadenas y las escribe por orden alfabético, ignorando
 * mayúsculas y minúsculas.
 * */

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String cad1,cad2,cad3;
		
		System.out.println("Anota cadena: ");
		cad1=sc.nextLine();
		System.out.println("Anota cadena: ");
		cad2=sc.nextLine();
		System.out.println("Anota cadena: ");
		cad3=sc.nextLine();
		
		if(cad1.compareTo(cad2)<=0 && cad1.compareTo(cad3)<=0) {
			System.out.println(cad1);
			if(cad2.compareTo(cad3)<=0) {
				System.out.println(cad2);
				System.out.println(cad3);
			}else {
				System.out.println(cad3);
				System.out.println(cad2);
			}
				
		}
		
		if(cad2.compareTo(cad1)<=0 && cad2.compareTo(cad3)<=0) {
			System.out.println(cad2);
			if(cad1.compareTo(cad3)<=0) {
				System.out.println(cad1);
				System.out.println(cad3);
			}else {
				System.out.println(cad3);
				System.out.println(cad1);
			}
				
		}
		
		if(cad3.compareTo(cad1)<=0 && cad3.compareTo(cad2)<=0) {
			System.out.println(cad3);
			if(cad1.compareTo(cad2)<=0) {
				System.out.println(cad1);
				System.out.println(cad2);
			}else {
				System.out.println(cad2);
				System.out.println(cad1);
			}
				
		}
		
		//si quisieramos que nos ordenara sin tener en cuenta mayus y minus
		//pondriamos compareToIgnoreCase
	}

}
