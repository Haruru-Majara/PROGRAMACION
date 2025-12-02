package Correcciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Lee un número y muestra todos los número que no lo dividen*/
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num=sc.nextInt();
		
		System.out.println("No divisores");
		
		for(int i=1;i<num;i++) {
			if (num%i!=0)
				System.out.println(i);
		}
	}

}
