package Hoja5;

import java.util.Random;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio, aprobados=0, contador=0;
		Random r=new Random();
		
		do {
			aleatorio=r.nextInt(11);
			System.out.println(aleatorio);
			
			contador++;
			
			if (aleatorio >=5)
				aprobados++;
				
		}while(contador<30);
		System.out.println("Número de aprobados: "+aprobados);
	}

}
