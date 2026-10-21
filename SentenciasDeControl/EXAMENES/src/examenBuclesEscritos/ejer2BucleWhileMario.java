package examenBuclesEscritos;

/**
 *Realiza un programa que muestre por pantalla los 20 primeros numeros pares positivos, empezando por el 2.
 *El programa deberá ir sumando todos los numeros pares y, al finalizar mostrar por pantalla la suma total. 
 * */

public class ejer2BucleWhileMario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2,acumulador=2;
		
		while(num<20) {
				num=num+2;
				acumulador=acumulador+num;
			
		}
		System.out.println(acumulador);
	}

}
