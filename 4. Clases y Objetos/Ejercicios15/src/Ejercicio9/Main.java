package Ejercicio9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

import Ejercicio3.Usuario;

public class Main {

	public static void main(String[] args) {
		/*En una oficina de correos se quieren organizar las cartas que llegan. De cada
		carta se guarda el apellido y nombre del destinatario, ciudad y país. Cada vez
		que llega una carta a la oficina se coloca por orden alfabético en una colección
		(elige la más adecuada).
		Antes de guardar la carta en la LL anterior se comprueba que el país d de
		destino es correcto, el país de destino sólo puede ser uno de 10 destinos
		predeterminados al inicio del programa (usa la colección adecuada). Si el
		destino no es correcto, la carta se coloca en el montón de excluidas (usa la
		colección adecuada).
		Las cartas se van extrayendo una a una de la colección inicial y se van
		clasificando juntas las que tienen el mismo destino.
		Mostrar en todo momento el contenido de todos los collection.
		Hacer un menú que hasta que lo desee el usuario tenga las siguientes opciones:
		1. Guardar carta ordenada. 2. Clasificar cartas. 3. Mostrar colecciones.*/
		
		int opc;
		String apellido, nombre, pais, ciudad;
		/**
		 * Para guardar el objeto de la carta con todos sus atributos
		 * */
		LinkedList <Carta> cartas=new LinkedList<Carta>();
		/**
		 * Para guardar los 10 paises destino y poder comparar con el pais del objeto
		 * */
		HashSet <String> paises=new HashSet<String>();
		
		ArrayList<Carta> e=new ArrayList<Carta>();
		/**
		 * Para comparar el pais 
		 * */
		HashMap<String,ArrayList<Carta>> sacos=new HashMap<String,ArrayList<Carta>>();
		
		
		
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
					System.out.println("Introduce el apellido del destinatario: ");
					apellido=sc.nextLine();
					System.out.println("Introduce el nombre del destinatario: ");
					nombre=sc.nextLine();
					System.out.println("Introduce la ciudad del destinatario: ");
					ciudad=sc.nextLine();
					System.out.println("Introduce el país del destinatario: ");
					pais=sc.nextLine();
					//CREO UN NUEVO OBJETO CARTA
					Carta carta=new Carta(apellido,nombre,ciudad,pais);
					//AQUI COMPARO SI EL DATO PAIS DEL OBJETO, ESTA EN EL HASHSET
					if (!paises.contains(pais)) {
						e.add(carta); //SI NO ESTÁ LO AÑADO EN EL ARRAY DE EXCLUIDOS
						System.out.println("El país destino no está dentro de los 10 países seleccionados");
						System.out.println("La carta se pone en el montón de los excluidos.");
					}
					else {
						int p=buscarPos(cartas, carta);
						cartas.add(p,carta);
						System.out.println("La carta se ha guardado correctamente");
					}
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
	public static int buscarPos(LinkedList<Carta> cartas,Carta c) {
		for(int i=0;i<cartas.size();i++)
			if (cartas.get(i).getApellido().compareTo(c.getApellido())>0)
				return i;
		return cartas.size();
	}

}
