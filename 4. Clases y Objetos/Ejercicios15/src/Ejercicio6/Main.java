package Ejercicio6;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		Scanner sc=new Scanner(System.in);
		HashSet<String> instrumentos = new HashSet<String>();
		
		do {
			System.out.println("Anota un instrumento: ");
			nombre=sc.nextLine().toUpperCase();
			if (nombre.equalsIgnoreCase("fin"))
				break;
			if (!instrumentos.contains(nombre)) {
				System.out.println("No está, vamos a añadirlo");
				instrumentos.add(nombre);
			}
			else {
				System.out.println("Ya existe");
			}
			System.out.println(instrumentos);
		}while(!nombre.equalsIgnoreCase("fin"));
	}

}
