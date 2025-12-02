package Hoja3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char categoria;
		double salarioBase, salarioTotal;
		int  subcategoriaC, diasTrabajo, diasBajain;
		final double sumplementoAB=240;
		final double sumplementoC1=0.50;
		final double sumplementoC2=120;
		final int descuento=30;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime de qué categoría eres: ");
		categoria=sc.nextLine().charAt(0);
		System.out.println("Dime tu salario base: ");
		salarioBase=sc.nextDouble();
		
		if (categoria == 'A' || categoria == 'B'  || categoria == 'a' || categoria == 'b') {
			salarioTotal=salarioBase+sumplementoAB;
			sc.nextLine();
			System.out.println("Perteneces a la categoría "+categoria+". Y tu salario es: "+salarioTotal+" euros");
		}
		else
			if (categoria == 'C' || categoria == 'c')
				System.out.println("Dime a que subcategoría de C perteneces 1 o 2.");
				subcategoriaC=sc.nextInt();
				
				switch (subcategoriaC) {
				case 1:
					System.out.println("¿Cuántos días has trabajado?");
					diasTrabajo=sc.nextInt();
					System.out.println("¿Cuántos días has estado de baja?");
					diasBajain=sc.nextInt();
					salarioTotal=(salarioBase+sumplementoC1*diasTrabajo)-(diasBajain*descuento);
					System.out.println("Perteneces a la categoría C"+subcategoriaC+". Y tu salario es: "+salarioTotal+"euros");
					break;
				case 2:
					salarioTotal=salarioBase+sumplementoC2;
					System.out.println("Perteneces a la categoría C"+subcategoriaC+". Y tu salario es: "+salarioTotal+"euros");
					break;
				}
		
	}

}
