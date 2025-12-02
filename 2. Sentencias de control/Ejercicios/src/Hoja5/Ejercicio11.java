package Hoja5;

import java.util.Random;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio, contador=0, par=0, impar=0, nulo=0;
		

		
		do {
			Random r=new Random();
			aleatorio=r.nextInt(100);
			
			contador=contador+1;
			
			if (aleatorio == 0)
				nulo=nulo+1;
			
			else 
				if (aleatorio % 2 == 0)
				    par=par+1;
				
				else
					impar=impar+1;
			
		}while(contador <100); 
			
		System.out.println("Números pares: "+par);
		System.out.println("Números impares: "+impar);
		System.out.println("Números nulos: "+nulo);
		System.out.println(contador);
	}

}
