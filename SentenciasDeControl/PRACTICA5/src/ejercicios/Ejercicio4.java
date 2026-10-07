package ejercicios;

import java.util.Scanner;

/**
 * Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
 * han introducido.
 * */
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num,cont=0;
		
		System.out.println("Anota un número: ");
		num=sc.nextInt();
		
		cont++;
		
		while(num>=0) {
			System.out.println("Anota un número: ");
			num=sc.nextInt();
			cont++;
		}
		
		System.out.println("Se anotó un número negativo");
		System.out.println("Contador de número anotados: "+cont);
	}

}
