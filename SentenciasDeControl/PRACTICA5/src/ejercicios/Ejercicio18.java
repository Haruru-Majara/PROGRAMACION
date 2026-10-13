package ejercicios;

import java.util.Random;

/**
 * Programa que lee una secuencia 5 números y escribe cual ha sido el mayor.
 * */

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		
		int mayor=0;
		
		for(int i=1;i<=5;i++) {
			int num=r.nextInt(101);
			System.out.println("Número "+i+": "+num);
			if(num>mayor)
				mayor=num;
		}
		System.out.println("");
		System.out.println("El número más alto es: "+mayor);
	}

}
