package ejemplos_funciones;

import java.util.Scanner;

public class ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int año;
		boolean esBisiesto, respuesta;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("Introduce año: ");
		año=sc.nextInt();
		
		esBisiesto=añoBisiesto(año);
		
	
		if (esBisiesto)
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
		
		System.out.println("¿Quiere anotar otro año?");
		respuesta=sc.nextBoolean();
		
		}while(respuesta==true);
	}
	public static boolean añoBisiesto (int a) {
		if (a%4==0 && a%100!=0 || a%400==0)
			return true;
		//else
			return false;
	}
}
