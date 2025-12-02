package Hoja4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int año;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un año: ");
		año=sc.nextInt();
		
		if (año < 1 || año > 9999)
			System.out.println("Año incorrecto, prueba otra vez.");
		else
			if (año % 4 ==0 && (año % 100 !=0 || año % 400 == 0)) 
				System.out.println("El año es bisiesto.");
			else
				System.out.println("El año no es bisiesto.");
				
	}

}
