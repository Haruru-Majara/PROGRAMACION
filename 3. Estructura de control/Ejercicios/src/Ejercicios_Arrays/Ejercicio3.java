package Ejercicios_Arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, ultimo,cont=0;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("¿Cuántos números vamos a leer?:");
		numero=sc.nextInt();
		
		int numeros[] = new int [numero];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce número["+i+"]=");
			numeros[i]=sc.nextInt();
		}
		ultimo=numeros[numero-1];
	}

}
