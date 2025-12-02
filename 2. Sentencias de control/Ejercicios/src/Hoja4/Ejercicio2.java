package Hoja4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, pCifra, sCifra, tCifra;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un número de 3 cifras: ");
		num=sc.nextInt();
		
		if ( num > 999 || num < 100 )
			System.out.println("El número "+num+" es mayor o menor de 3 cifras, no se puede ejecutar.");
		else
			System.out.println("El número "+num+" es de 3 cifras, se puede ejecutar");
			pCifra=num/100;
			sCifra=(num%100)/10;
			tCifra=num%10;
			
			System.out.println("Las cifras de "+num+" en orden inverso son: "+tCifra+sCifra+pCifra);
	}

}
