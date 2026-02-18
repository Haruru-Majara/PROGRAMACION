package Ejercicio9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

import Ejercicio3.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		boolean correcto=false;
		String apellido, nombre, pais, ciudad;
		
		LinkedList <Carta> cartas=new LinkedList<Carta>();
		HashSet <String> paises=new HashSet<String>();
		ArrayList<Carta> c=new ArrayList<Carta>();
		HashMap<String,ArrayList<>> 
		
		Scanner sc=new Scanner(System.in);
		
		paises.add("España");
		paises.add("Francia");
		paises.add("Venezuela");
		paises.add("Alemania");
		paises.add("Brasil");
		paises.add("China");
		paises.add("Japón");
		paises.add("Rusia");
		paises.add("Islandia");
		paises.add("Tailandia");
		
		
		do {
			System.out.println("                      ");
			System.out.println("---------MENÚ---------");
			System.out.println("1.Guardar una carta");
			System.out.println("2.Clasificar cartas");
			System.out.println("3.Mostrar colecciones");
			System.out.println("4.Salir");
			opc=sc.nextInt();
			
			switch(opc) {
			case 1:
				do {
					System.out.println("Introduce el apellido del destinatario: ");
					apellido=sc.nextLine();
					System.out.println("Introduce el nombre del destinatario: ");
					nombre=sc.nextLine();
					System.out.println("Introduce la ciudad del destinatario: ");
					ciudad=sc.nextLine();
					System.out.println("Introduce el país del destinatario: ");
					pais=sc.nextLine();
				}while(!correcto);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("No existe esta opción.");
			}
		}while(opc!=4);
		
	}

}
