package ejemplos_ifelse;

import java.util.Scanner;

public class ejemplonumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		char letra = '_';
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dame una letra:");
		letra=sc.nextLine().charAt(0);
		
		while (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
			contador=contador+1;
			System.out.println(letra+"-"+contador);
			System.out.println("Anotame otra letra:");
			letra=sc.nextLine().charAt(0);
		}
		System.out.println("La letra dada es una vocal");
		
	}

}
