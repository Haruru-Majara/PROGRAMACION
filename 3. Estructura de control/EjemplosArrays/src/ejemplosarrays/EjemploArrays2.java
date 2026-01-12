package ejemplosarrays;

import java.util.Scanner;

public class EjemploArrays2 {

	public static void main(String[] args) {
		/*Leed 5 números en un array, sólo dejad introducir cada número si es positivo, si no
		lo es volved a pedirlo hasta que lo sea. Después recorred el array y mostrad sus
		cuadrados.*/
		
		int numeros[]= new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduce número en la posición "+i+":");
			numeros[i]=sc.nextInt();
		}
		
		System.out.println("Números leidos:");

		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}

	}

}
