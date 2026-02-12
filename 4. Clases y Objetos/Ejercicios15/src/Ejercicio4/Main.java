package Ejercicio4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> alumnos = new HashMap<>();
	
	do {
		System.out.println("1.Alta");
		System.out.println("2.Modificar nota");
		System.out.println("3.Sustituir alumno");
		System.out.println("4.Borrar");
		System.out.println("5.Buscar");
		System.out.println("6.Salir");
		opc=sc.nextInt();
		switch(opc) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.out.println("Fin del programa.");
			break;
		default:
			System.out.println("No existe esta opción.");
		
		}
		}while(opc!=6);
	}
}
