package Correcciones;

import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		/* Lee un número y muestra todos los número que no lo dividen*/
		int num, i = 1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		System.out.println("No divisores");
		
		while (i < num) {
			if (num % 1 !=0)
				System.out.println(i);
			i++;
		}
	}

}
