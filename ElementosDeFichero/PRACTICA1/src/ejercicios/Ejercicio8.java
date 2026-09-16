package ejercicios;

/**
 * Programa que dada una variable t que contiene un tiempo en segundos, nos
 * muestre dicho tiempo expresado en horas, minutos y segundos.
 * */

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int segTotales,seg,min,hor,resto;
		
		System.out.println("¿Cuántos segundos tenemos?");
		segTotales=sc.nextInt();
		
		System.out.println("Vamos a transformarlo en horas, minutos y segundos.");
		
		resto=segTotales/60;
		seg=segTotales%60;
		min=resto%60;
		hor=resto/60;
		
		System.out.println(segTotales+" segundos se convierten en: "+hor+" horas "+min+" minutos y "+seg+" segundos.");
		
	}

}
