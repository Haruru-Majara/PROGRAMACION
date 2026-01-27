package Ejercicio3;

import java.util.Scanner;

public class MainCargamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,kilos,contador=0;
		String nombre,procedencia;
		double pKilo, pVenta,rebaja;
		final int NCAR=10;
		
		Scanner sc= new Scanner(System.in);
		
		Cargamento cargamentos [] = new Cargamento[10];
		
		do {
			
			System.out.println("---------------------------");
			System.out.println("------MENÚ DE OPCIONES-----\n ");
			System.out.println("1.Dar de alta un cargamento\n2.Mostrar info cargamentos\n"
					+ "3.Rebajar un cargamento\n4.Vender cargamento\n5.Mostrar beneficio total\n"
					+ "6.Borrar cargamentos vacios\n7.Salir");
			opcion=sc.nextInt();
			System.out.println("---------------------------");
			
			switch(opcion) {
			case 1:
				if (contador>=10) 
					System.out.println("No se puede dar de alta un nuevo cargamento.");
				else {
					System.out.println("Nombre de la fruta: ");
					nombre=sc.nextLine();
					System.out.println("Procedencia: ");
					procedencia=sc.nextLine();
					System.out.println("Cantidad de kilos: ");
					kilos=sc.nextInt();
					System.out.println("Precio kilo: ");
					pKilo=sc.nextDouble();
					System.out.println("Precio venta: ");
					pVenta=sc.nextDouble();
				
					cargamentos[contador]=new Cargamento (nombre ,procedencia, kilos, pKilo, pVenta);
					contador++;
				}
				break;
			case 2:
				for (int i =0;i< ultimoCargamento;i++)
					System.out.println("Información de cargamentos: "+cargamentos[i]);
				break;
			case 3:
				System.out.println("Nombre de la fruta: ");
				nombre=sc.nextLine();
				System.out.println("Procedencia: ");
				procedencia=sc.nextLine();
				System.out.println("Rebaja para aplicar: ");
				rebaja=sc.nextDouble();
				
				break;
			case 4: 
				
				break;
			case 5:
				System.out.println("El benefio de la empresa ha sido: "+Cargamento.getBeneficioTotal());
				break;
			case 6: //Borrar el primer cargamentos vacios
				int i;
				for (i=0;i<ultimoCargamento;i++) {
					if (cargamentos[i].getKilos()==0) {
						
						break;
					}
				}
				if (i==ultimoCargamento)
					System.out.println("No hay ningun cargamento vacío");
				break;
			case 7:
				System.out.println("Fin del programa.");
				break;
			default:
				System.out.println("No existe esta opción, elige otra.");
			}
		}while(opcion!=7);
		
	}
	public borrar() {
		
	}
}
