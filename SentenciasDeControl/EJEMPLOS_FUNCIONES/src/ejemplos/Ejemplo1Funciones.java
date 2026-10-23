package ejemplos;

import java.util.Scanner;

/**
 *Programa que lee un número entero menor que 100 (N) y mediante una
 *función que lo recibe como parámetro escribe "N veces: módulo
 *ejecutándose". 
 * */

public class Ejemplo1Funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Introduce número: ");
			num=sc.nextInt();
			if(num >= 100)
				System.out.println("El número tiene que ser menor de 100");
		}while(num >=100);
		
		escribir(num);
	}
	public static void escribir(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println("Módulo ejecutándose.");
		}
	}
}
