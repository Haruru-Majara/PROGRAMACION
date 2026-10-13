package ejercicios;

import java.util.Random;

/**
 * Programa que lee una secuencia de 50 letras y escribe el número de veces que se repite la
primera de ellas.
 * */

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;
		char letra;
		Random r=new Random();
		
		for(int i=1;i<=50;i++) {
			letra=(char) ('a' + r.nextInt(26));
			System.out.println(letra);
			
		}
	}

}
