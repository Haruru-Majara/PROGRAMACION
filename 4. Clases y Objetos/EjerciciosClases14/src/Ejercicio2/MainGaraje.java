package Ejercicio2;

import java.util.Scanner;

import Ejercicio1.Vehiculo;

public class MainGaraje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, planta, pos,opcion,porcentaje;
		double metros, pAlquiler;
		boolean correcto;
		
		Garaje garajes [] = new Garaje[5];
		
		garajes[0]=new Garaje(1,5,0);
		garajes[1]=new Garaje(2,2,1);
		garajes[2]=new Garaje(3,4,2);
		garajes[3]=new Garaje(4,6,1);
		garajes[4]=new Garaje(5,3,0);
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.Alquilar garaje\n.2.Mostrar alquiler garaje\n.3.Mostrar info garajes libres\n.4.Subir precio garaje\n.5.Mostrar beneficios totales\n.6.Salir");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduce número del garaje que quieres alquilar: ");
				numero=sc.nextInt();
				pos=buscarGaraje(garajes,numero);
				if (pos==-1)
					System.out.println("Garaje no encontrado, lo siento");
				else
					if (garajes[pos].isAlquilado())
						System.out.println("Genial! Has alquilado el garaje");
					else
						System.out.println("No se ha podido, este garaje ya estaba alquilado.");		
				break;
			case 2:
				System.out.println("Introduce número del garaje del que quieres visualizar: ");
				numero=sc.nextInt();
				pos=buscarGaraje(garajes,numero);
				if (pos==-1)
					System.out.println("Garaje no encontrado, lo siento");
				else
					System.out.println("El alquiler de este garaje es: "+garajes[pos].getPrecioAlquiler());
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("Introduce número del garaje del que quieres visualizar: ");
				numero=sc.nextInt();
				System.out.println("Introduce el porcentaje que quieres aumentar: ");
				porcentaje=sc.nextInt();
				pos=buscarGaraje(garajes,numero);
				if (pos==-1)
					System.out.println("No existe el garaje");
				else {
					if (garajes[pos].isAlquilado())
						System.out.println("Esta alquilado no puedo subir precio");
					else
						garajes[pos].aumentarPorcentaje(porcentaje);
				}
				break;
			case 5:
				System.out.println("Los beneficios totales de la empresa son de: "+Garaje.getBeneficioTotal());
				break;
			case 6:
				System.out.println("Fin del programa");
				break;
				default:
					System.out.println("Esta opción no existe, elige otra: ");
			}
		}while(opcion!=6);
	}
	public static int buscarGaraje(Garaje g[], int num) {
		for(int i=0;i<g.length;i++) {
			if(g[i].getNumero() == num)
				return i;
		}
		return -1;
	}

}
