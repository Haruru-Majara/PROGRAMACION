package Hoja6;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma=0, contador=0;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			
			suma=suma+num;
			 if (num == 0)
				 contador++;
		}while(suma<=100);
		
		System.out.println("La suma de los números es: "+suma);
		System.out.println("El número de ceros anotados ha sido: "+contador);
	}

}
