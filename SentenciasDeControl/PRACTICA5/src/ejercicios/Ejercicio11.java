package ejercicios;

import java.util.Random;

/**
 * Programa que lee 100 números y cuenta cuantos han sido pares, cuantos impares
 * y cuantos nulos
 * */

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		
		int pares=0,impares=0,nulos=0;
		for(int i=0;i<100;i++) {
			int num=r.nextInt(51);
			System.out.println(num);
			if(num==0)
				nulos++;
			else
				if(num%2==0)
					pares++;
				else
					impares++;
		}
		
		System.out.println("Recuento de números nulos: "+nulos);
		System.out.println("Recuento de números pares: "+pares);
		System.out.println("Recuento de números impares: "+impares);
	}

}
