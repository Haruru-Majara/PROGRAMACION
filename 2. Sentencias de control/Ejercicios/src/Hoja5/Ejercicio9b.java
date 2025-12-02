package Hoja5;

import java.util.Scanner;

public class Ejercicio9b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad, sumaEdad=0, contMay=0;
		double sumaAltura=0, contMasAltos=0, altura=0;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
			System.out.println("Introduce tu edad:");
			edad=sc.nextInt();
			
			sumaEdad=sumaEdad+edad;
			System.out.println("Introduce tu altura:");
			altura=sc.nextDouble();
			
			sumaAltura=sumaAltura+altura;
			if (edad>18)
				contMay++;
			if (altura>1.75)
				contMasAltos++;
		}
		System.out.println("Hay "+contMay+" personas mayores de 18 años");
		System.out.println("Hay "+contMasAltos+" personas de más de 1.75");
		System.out.println("La media de edad es: "+(double)sumaEdad/5);
		System.out.println("La media de altura es: "+sumaAltura/5);
	}

}
