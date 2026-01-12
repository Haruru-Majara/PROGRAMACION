package ejemplosarrays;

import java.util.Scanner;

public class EjemploArrays1 {

	public static void main(String[] args) {
		/*Leed 10 números en un array. Una vez leídos todos recorred el array y mostrad los
		que son pares, recorredlo de nuevo para mostrar los impares.*/
		
		int numeros[]= {2,3,6,1,7};
			
		System.out.println("Números en el array:");

		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}

	}

}
