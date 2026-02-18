package Ejercicio8;

import java.util.HashMap;
import java.util.Scanner;

import Ejercicio1.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String matricula,modelo,marca;
		int año,categoria,opc,dias;
		boolean correcto=false;
		double importeAlquiler;
		final int TAM=5;
		
		HashMap<String, Vehiculo>vehiculos=new HashMap<String,Vehiculo>();
		
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<TAM;i++) {
			do {
			System.out.println("Introduce matrícula: ");
			matricula=sc.nextLine();
			correcto=matricula.matches("[0-9]{4}[A-Z]{3}");
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
			
			vehiculos.put(matricula,new Vehiculo(matricula,marca,modelo,año,categoria));
			
		}
		
		do {
			System.out.println("1.Alquilar.\n2.Devolver.\n3.Mostrar información de un coche.\n4.Mostrar información en general.\n5.Salir");
			opc=sc.nextInt();
			sc.nextLine();
			
			switch(opc) {
			case 1:
				System.out.println("Introduce matrícula: ");
				matricula=sc.nextLine();
				if (!vehiculos.containsKey(matricula))
					System.out.println("No existe ese vehiculo");
				else {
					System.out.println("Por cuántos días quieres alquilarlo?: ");
					dias=sc.nextInt();
					importeAlquiler=vehiculos.get(matricula).alquilarVehiculo(dias);
					if (importeAlquiler==0)
						System.out.println("Error alquilando, avise a sistemas");
					else
						System.out.println("El importe de su alquiler es: "+importeAlquiler);
					}
				break;
			case 2:
				sc.nextLine();
				System.out.println("Introduce matrícula: ");
				matricula=sc.nextLine();
				Vehiculo v=vehiculos.get(matricula);
				if (v==null)
					System.out.println("No existe ese vehículo");
				else {
					if (v.devolver())
						System.out.println("Vehículo devuelto con éxito");
					else
						System.out.println("El vehículo no estaba alquilado, no se puede devolver");
				}
				break;
			case 3:
				System.out.println("Introduce matrícula: ");
				matricula=sc.nextLine();
				v=vehiculos.get(matricula);
				if (v==null)
					System.out.println("No existe ese vehículo");
				else
					System.out.println(v);
				break;
			case 4:
				System.out.println("Fin del programa");
			default:
				System.out.println("Opción incorrecta");
			}
		}while(opc!=4);
		
		System.out.println("Total vehículos alquilados: "+Vehiculo.getTotalAlquilados());
		System.out.println("Total ganancias: "+Vehiculo.getGananciasTotales());
	}
}


