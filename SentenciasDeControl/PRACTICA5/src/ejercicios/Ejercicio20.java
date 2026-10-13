package ejercicios;

/**
 * Programa que muestra por pantalla los números del 1 al 100 sin mostrar aquellos
números que sean múltiplos de 5.
 * */

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++) {
			if(i%5!=0)
				System.out.println(i);
		}
		
	}

}
