package Hoja5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, aleatorio, contador=1;
		
		Scanner sc=new Scanner(System.in);
		
		//Declaro la clase Random
		
		Random r=new Random();
		aleatorio=r.nextInt(10); // Me devuelve un número al azar entre 0 (incluido) y 10 (excluido)
		
		System.out.println(aleatorio); // si lo comentamos no saldria y seria "secreto"
		
		System.out.println("Introduce otro número: ");
		N=sc.nextInt();
		
		while (N != aleatorio) {
			contador=contador+1;
			if ( aleatorio > N)
				System.out.println(aleatorio+" es mayor que "+N);
			else
				System.out.println(aleatorio+" es menor que "+N);
			System.out.println("Introdume otro número: ");
			N=sc.nextInt();
		}
		System.out.println("ACIERTO.EL número es igual que N.");
	}

}
