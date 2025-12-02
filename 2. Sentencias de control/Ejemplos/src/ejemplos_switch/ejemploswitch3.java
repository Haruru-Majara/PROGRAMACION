package ejemplos_switch;

import java.util.Scanner;

public class ejemploswitch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra;
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce una letra entre: S/s para sumar, R/r para restar, P/p/M/m para producto y D/d para la división: ");
		letra=sc.nextLine().charAt(0);
		
		System.out.println("Además habrás de elegir dos número para operar.");
		
		System.out.println("Introduce el primer número: ");
		n1=sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		n2=sc.nextInt(); 
		
		switch (letra) {
		case 'S':
		case 's':
			System.out.println("Has elegido que letra sea igual a: ");
			System.out.println((n1+n2));
			break;
		case 'R':
		case 'r':
			System.out.println("Has elegido que letra sea igual a: ");
			System.out.println((n1-n2));
			break;
		case 'P':
		case 'p':
		case 'M':
		case 'm':
			System.out.println("Has elegido que letra sea igual a: ");
			System.out.println((n1*n2));
			break;
		case 'D':
		case 'd':
			System.out.println("Has elegido que letra sea igual a: ");
			System.out.println((n1/n2));
			break;
		}
	}

}
