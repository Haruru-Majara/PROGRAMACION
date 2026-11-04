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
		
		do {
			
		
		if(c1.length()>c2.length()) {
			/*while(fin<=c1.length()) {
				if(c1.indexOf(c2)>=0) 
					cont++;
				
			}
			*/
			
			
				for(int i=;i<c1.length()-1;i++) {
					if(c1.indexOf(c2)>=0)
						cont++;
					pos=
				}
				pos=c1.
			}
			System.out.println("La cadena "+c2+" seha repetido en "+c1+" : "+cont+" veces.");
		}else {
			while(c2.length()>-1) {
				if(c2.indexOf(c1)>=0) 
					cont++;
				
			}
			System.out.println("La cadena "+c1+" seha repetido en "+c2+" : "+cont+" veces.");
		}

	}
}
