package Ejercicio1;

import java.util.Scanner;

public class MainVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String matricula,modelo,marca;
		int año,categoria;
		boolean correcto;
		
		Vehiculo vehiculos [] = new Vehiculo[5];
		
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<vehiculos.length;i++) {
			do {
			System.out.println("Introduce matrícula: ");
			matricula=sc.nextLine();
			matricula.matches("[0-9]{4}[A-Z]{3}")
			}while(!correcto);
			
			System.out.println("Introduce marca: ");
			marca=sc.nextLine();
			System.out.println("Introduce modelo: ");
			modelo=sc.nextLine();
			System.out.println("Introduce año de compra: ");
			año=sc.nextInt();
			
			do {
				int temp;
			System.out.println("Introduce categoria 1 o 2: ");
			categoria=sc.nextInt();
			
				if (categoria != 1 || categoria != 2)
					System.out.println("Categoria erronea, vuelvela a introducir");
				
			}while(categoria!=1 || categoria!=2);
			
			vehiculos[i]=new Vehiculo(matricula,marca,modelo,año,categoria);
		}
		
		double importeAPagar=.alquilarVehiculo(7);
		if (importeAPagar==0)
			System.out.println("Ese vehículo ya está alquilado");
		else
			System.out.println("Total a pagar: "+importeAPagar);
		
		importeAPagar=v1.alquilarVehiculo(8);
		if (importeAPagar==0)
			System.out.println("Ese vehículo ya está alquilado");
		else
			System.out.println("Total a pagar: "+importeAPagar);
		
	}

}
