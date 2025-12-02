package Hoja5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aleatorio, N;
		
		Random r=new Random();
		aleatorio=r.nextInt(10);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número del 0 al 9: ");
		N=sc.nextInt();
		
		while(N != aleatorio) {
			if (N > aleatorio)
				System.out.println(N+" es mayor que este número.");
			else
				System.out.println(N+" es menor que este número.");
			System.out.println("Introduce un número: ");
			N=sc.nextInt();
		}
		System.out.println("Felicidades has acertado, el número era: "+aleatorio);
	}

}
