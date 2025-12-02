package Hoja5;

import java.util.Random;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pares=0, impares=0, nulos=0,aleatorio, contador=0;
		
		Random r=new Random();
		
		do {
			aleatorio=r.nextInt(100);
			System.out.println(aleatorio);
			
			contador++;
			if (aleatorio == 0)
				nulos++;
				if (aleatorio % 2 == 0)
					pares++;
				else
					if (aleatorio % 2 == 1)
						impares++;

					
			
		}while(contador<100);
		System.out.println("Total pares: "+pares);
		System.out.println("Total impares: "+impares);
		System.out.println("Total nulos: "+nulos);
	}

}
