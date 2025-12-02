package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio5b {

	public static void main(String[] args) {
		/*Programa que lee tres cadenas y las escribe por orden alfabético, ignorando mayúsculas y minúsculas.*/
		
		String s1, s2, s3;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la cadena 1:");
		s1=sc.nextLine();
		System.out.println("Introduce la cadena 2:");
		s2=sc.nextLine();
		System.out.println("Introduce la cadena 3:");
		s3=sc.nextLine();
	
		if (s1.compareToIgnoreCase(s2)<=0 && s1.compareToIgnoreCase(s3)<=0) {
			if(s2.compareToIgnoreCase(s3)<=0)
				System.out.println(s1+","+s2+","+s3);
			else
				System.out.println(s1+","+s3+","+s2);
		}
		if (s2.compareToIgnoreCase(s1)<=0 && s2.compareToIgnoreCase(s3)<=0) {
			if(s1.compareToIgnoreCase(s3)<=0)
				System.out.println(s2+","+s1+","+s3);
			else
				System.out.println(s2+","+s3+","+s1);
		}
		if (s3.compareToIgnoreCase(s1)<=0 && s3.compareToIgnoreCase(s2)<=0) {
			if(s1.compareToIgnoreCase(s2)<=0)
				System.out.println(s3+","+s1+","+s2);
			else
				System.out.println(s3+","+s2+","+s1);
		}
	}
}
	


