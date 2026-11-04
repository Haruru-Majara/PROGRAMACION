package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee dos cadenas por teclado y calcula el número de veces que se repite
 * la de menor longitud en la de mayor sustituyendo todas sus apariciones por
 * mayúsculas.
 * */

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String c1, c2;
		int cont=0,pos=0;
		
		System.out.println("Introduce la primera cadena: ");
		c1=sc.nextLine().toLowerCase();
		System.out.println("Introduce la segunda cadena: ");
		c2=sc.nextLine().toLowerCase();
		
		if(c1.length()>c2.length()) {
			if(c1.indexOf(c2)>=0) {
				for(int i=pos;i<c1.length()-1;i++) {
					pos=c1.indexOf(c2)+c2.length();
					cont++;
					c1=c1.substring(pos,c1.length());	
				}
				System.out.println("La cadena "+c2+" se ha repetido en "+c1+" : "+cont+" veces.");
			}else
				System.out.println("No se ha encontrado la cadena "+c2+" en "+c1);
		}else {
			if(c2.indexOf(c1)>=0) {
				for(int i=pos;i<c2.length()-1;i++) {
					pos=c2.indexOf(c1)+c1.length();
					cont++;
					c2=c2.substring(pos,c2.length());
				}
				System.out.println("La cadena "+c1+" se ha repetido en "+c2+" : "+cont+" veces.");	
			}else
				System.out.println("No se ha encontrado la cadena "+c1+" en "+c2);
		}

	}
}
