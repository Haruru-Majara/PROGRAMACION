package examenCocheElectrico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coches[];
		int cont,opc,pos;
		String mat;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Introduce número de coches (2-10");
			cont=sc.nextInt();
		}while(cont<2 || cont>10);
		
		coches=new Coche[cont];
		
		for(int i=0;i<cont;i++) {
			System.out.println("Introduce matricula: ");
			mat=sc.nextLine();
			if (mat.matches("[0-9]{4}[A-Z]{3}"))
				coches[i]=new Coche(mat);
			else {
				System.out.println("Matrícula incorrecta");
				i--;
			}
		}
		
		do {
			System.out.println("Elige una opcion: ");
			System.out.println("1.Reservar un vehículo.");
			System.out.println("2.Alquilar un vehículo reservado.");
			System.out.println("3.Acabar el trayecto con el vehículo.");
			System.out.println("4.Poner a libres a todos los vehículos.");
			System.out.println("5.Salir");
			opc=sc.nextInt();
			
			switch (opc) {
			case 1:
				for(int i=0;i<cont;i++) 
					if (coches[i].getEstado()==0)
						System.out.println(coches[i].toString()+" "+ i);
					
					try {
					System.out.println("Anota la posición del coche a reservar: ");
					pos=sc.nextInt();
					if (coches[pos].reservar()==null)
						System.out.println("No se ha podido reservar, estado incorrecto");
					}catch(InputMismatchException e) {
						System.out.println("No has anotado un número");
					}catch(IndexOutOfBoundsException e) {
						System.out.println("Posicion incorrecta");
					}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}while(opc!=5);
	}

}
