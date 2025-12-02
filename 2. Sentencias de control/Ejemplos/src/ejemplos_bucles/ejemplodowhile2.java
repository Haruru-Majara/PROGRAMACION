package ejemplos_bucles;

import java.util.Scanner;

public class ejemplodowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter;
		
		Scanner sc=new Scanner(System.in);
		
		
		do {
			System.out.println("Introduce un caracter de entre estos: +  -  /  *");
			caracter=sc.nextLine().charAt(0);
		}while (caracter != '+' && caracter != '-' && caracter != '/' && caracter != '*');
		System.out.println("Caracter incorrecto.");
	}

}
