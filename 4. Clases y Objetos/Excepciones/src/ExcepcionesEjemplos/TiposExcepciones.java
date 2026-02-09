package ExcepcionesEjemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TiposExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner (System.in);
		int numeros[]=new int [5];
		for (int i=0;i<5;i++) {
			numeros[i]=i+1;
		}
		try {
		int posicion=entrada.nextInt();
		/*if (posicion>=0 && posicion <=5)*/
			numeros[posicion]++;
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR. INTRODUCE NÚMERO ENTERO");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR. FUERA DEL ARRAY");
	}

}
