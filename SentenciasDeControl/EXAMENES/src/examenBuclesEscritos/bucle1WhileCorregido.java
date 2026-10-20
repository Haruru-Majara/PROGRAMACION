package examenBuclesEscritos;

/**
 * Lee una letra, después lee letras hasta que te tecleen la anotada inicialmente y
 * dí cuantas letras has leído distintas a la inicial.
 * */

import java.util.Scanner;

public class bucle1WhileCorregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char letra=' ',primeraLetra;
		int cont=0;
		
		System.out.println("Introduce una letra: ");
		primeraLetra=sc.nextLine().charAt(0);
		
		while(letra!=primeraLetra) {
			System.out.println("Introduce una letra: ");
			letra=sc.nextLine().charAt(0);
			cont++;
		}
		System.out.println("Ha habido "+cont+" letras distintas a la inicial.");
	}

}
