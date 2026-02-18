package Ejercicio7;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
	
		 HashSet<Integer> numeros = new HashSet<Integer>();
		 HashSet<Integer> numeros2 = new HashSet<Integer>();
		 System.out.println("Anota números para el conjunto 1 : ");
		 LeerConjunto(numeros);
		 System.out.println("Anota números para el conjunto 2 : ");
		 LeerConjunto(numeros2);
			 
		 System.out.println("Conjunto 1: "+numeros);
		 System.out.println("Conjunto 2: "+numeros2);
		 
		if ( numeros.containsAll(numeros2))
			System.out.println("El conjunto 1 contiene al 2");
		else {
			if (numeros2.containsAll(numeros))
				System.out.println("El conjunto 2 contiene al 1");
			else
				System.out.println("Ningún conjunto contiene al otro");
		}
	
	}
	
	public static void LeerConjunto(HashSet<Integer> numeros) {
		int numero; 
		do {
			 numero=sc.nextInt();
			 if(numero==0)
				 break;
			 else
				 if (!numeros.contains(numero)) {
				 numeros.add(numero);
				 System.out.println("Añadido");
				 }
				 else
					 System.out.println("Ya has anotado este número");
			 
		 }while(numero!=0);
		 
	}
	

}
