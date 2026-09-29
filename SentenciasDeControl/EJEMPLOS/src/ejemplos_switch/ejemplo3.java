package ejemplos_switch;

import java.util.Scanner;

public class ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a,b,resultado;
		char operacion;
		
		System.out.println("Introduce número: ");
		a=sc.nextInt();
		System.out.println("Introduce segundo número: ");
		b=sc.nextInt();
		
		sc.nextLine(); //Estoy limpiando el buffer. Siempre limpio cuando después de leer un número,
		// leo un caracter
		
		System.out.println("Introduce operación: (S/R/D/P o M)");
		operacion=sc.nextLine().charAt(0);
		
		switch(operacion) {
		case 'S':
		case 's':
				resultado=a+b;
				System.out.println("La suma es: "+resultado);
			break;
		case 'R':
		case 'r':
			resultado=a-b;
			System.out.println("La resta es: "+resultado);
			break;
		case 'D':
		case 'd':
			resultado=a/b;
			System.out.println("La división es: "+resultado);
			break;
		case 'P':
		case 'p':
		case 'M':
		case 'm':
			resultado=a*b;
			System.out.println("El producto o multiplicación es: "+resultado);
			break;
		default:
			System.out.println("Error, operación incorrecta.");
			
		}
	}

}
