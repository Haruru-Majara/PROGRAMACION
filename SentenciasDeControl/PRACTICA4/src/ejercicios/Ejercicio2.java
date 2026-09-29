package ejercicios;

import java.util.Scanner;

/**
 * Dado un número entero positivo de tres cifras (leído como tal), escríbase un
 * programa que escriba en pantalla sus cifras en orden inverso.
 * */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int numero,c1,c2,c3,resto;
		
		System.out.println("Escribe un número de 3 cifras: ");
		numero=sc.nextInt();
		
		if(numero<000 || numero>999) {
			System.out.println("Este número tiene más de 3 cifras");
		}else {
			c1=numero/100;
			resto=numero%100;
			c2=resto/10;
			c3=resto%10;
			
			System.out.println("Tú número al revés es: "+c3+c2+c1);
			
		}
			
	}

}
