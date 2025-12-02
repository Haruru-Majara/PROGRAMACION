package Hoja5;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, media = 0, contador = 0,suma = 0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		num=sc.nextInt();
		
		while (num >0) {
			contador=contador+1;
			suma=suma+num;
			System.out.println("Dame otro número: ");
			num=sc.nextInt();
		}
		media=suma/contador;
		System.out.println("La media de los números dados hasta ahora es: "+media);
		}
	}


