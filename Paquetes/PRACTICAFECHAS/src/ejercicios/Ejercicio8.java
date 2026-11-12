package ejercicios;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

/**
 * Simular durante 5 segundos el lanzamiento de un dado, pasado ese tiempo mostrar la cantidad de seises que han salido
 * */

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LocalTime ahora,despues;
		Duration duracion;
		int cont=0,dado;
		long segundosPasados=0;
		Random r=new Random();
		
		ahora=LocalTime.now();
		//System.out.println(ahora);
		
		while(segundosPasados<5) {
			despues=LocalTime.now();
			segundosPasados = Duration.between(ahora,despues).getSeconds();
			//System.out.println("segundos"+segundosPasados);
			dado=r.nextInt(6)+1;
			System.out.println(dado);
			if(dado==6)
				cont++;
		}
		
		System.out.println("Han salido "+cont+" seises en 5s");
	}

}
