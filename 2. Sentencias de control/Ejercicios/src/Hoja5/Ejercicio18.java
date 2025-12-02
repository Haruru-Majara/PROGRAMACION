package Hoja5;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,numMayor=0;
		
		Scanner sc=new Scanner(System.in);
		
	for (int i=0; i < 5; i++) {
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		if (num > numMayor)
			numMayor=num;
	}
	System.out.println("El número más grande es: "+numMayor);
	}

}
