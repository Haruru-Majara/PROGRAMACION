package Control_Teatro;

import java.util.Scanner;

public class MainRepresentacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		final int PRECIOEV=20,PRECIOEN=14;
		
		Scanner sc=new Scanner(System.in);
		
		Representacion representaciones[] = new Representacion[10];
		
		do {
			System.out.println("--------MENÚ DE OPCIONES--------");
			System.out.println("1.Dar de alta una representación.");
			System.out.println("2.Ordenar las representaciones.");
			System.out.println("3.Mostrar información de las representaciones.");
			System.out.println("4.Comprar entradas.");
			System.out.println("5.Mostrar importe total recaudado.");
			System.out.println("6.Salir.");
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("No existe esta opción, elige otra.");
			}
		}while(opcion!=6);
	}

}
