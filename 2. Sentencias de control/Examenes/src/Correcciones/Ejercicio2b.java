package Correcciones;

import java.util.Scanner;

public class Ejercicio2b {

	public static void main(String[] args) {
		/*Calcula la suma de los pares comprendidos entre dos números leídos por teclado*/
		int num1, num2, menor=0, mayor=0, suma=0, i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce primer número: ");
		num1=sc.nextInt();
		System.out.println("Introduce segundo número: ");
		num2=sc.nextInt();
		
		if (num1==num2)
			System.out.println("Son iguales.");
		else
			if (num1 < num2) {
				menor=num1;
				mayor=num2;
			}
			else {
				menor=num2;
				mayor=num1;
			}
		
		i=menor+1;
		
		while(1<mayor) {
			if (i%2==0)
				suma=suma+1;
			i++;
		}
		
		System.out.println("La suma es: "+suma);
	}

}
