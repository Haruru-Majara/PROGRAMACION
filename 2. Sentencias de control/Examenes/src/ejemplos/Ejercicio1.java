package ejemplos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* 1. Lee una letra, y después lee letras hasta que tecleen la anotada al inicio y
		 * hay que decir cuantas letras has leído distintas de la inicial
		 */
		
		char letraI, letra;
		int cont=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce letra: ");
		letraI=sc.nextLine().charAt(0);
		do {
			System.out.println("Introduce otra letra: ");
			letra=sc.nextLine().charAt(0);
			if (letra != letraI)
				cont++;
		}while(letra != letraI);
		System.out.println("He leido: "+cont+" letras distintas a "+letraI);
	}

}
