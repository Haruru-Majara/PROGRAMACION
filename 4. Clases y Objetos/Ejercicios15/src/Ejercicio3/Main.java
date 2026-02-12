package Ejercicio3;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc,entradas,entradasTotales;
		String nombre;
		
		LinkedList <Usuario> usuarios=new LinkedList<Usuario>();
		
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Cuántas entradas hay en total?");
		entradasTotales=sc.nextInt();
		Usuario.setEntradasDisp(entradasTotales);
		
		do {
			System.out.println("                ");
			System.out.println("------MENÚ------");
			System.out.println("1.Guardar usuario en la cola");
			System.out.println("2.Comprar entradas");
			System.out.println("3.Eliminar usuario de la cola");
			System.out.println("4.Salir");
			opc=sc.nextInt();
			sc.nextLine();
			switch (opc) {
			case 1:
				System.out.println("Introduce tu nombre: ");
				nombre=sc.nextLine();
				System.out.println("Introduce número de entradas: ");
				entradas=sc.nextInt();
				usuarios.add(new Usuario(nombre,entradas));
				System.out.println("Usuario guardado exitosamente");
				break;
			case 2:
				/*
				Usuario us=usuarios.removeFirst();
				if (us.comprar()) {
					System.out.println("Se ha podido realizar la compra de las entradas.");
					usuarios.removeFirst();
				}
				*/
				if (usuarios.get(0).comprar()) {
					System.out.println("Siguiente en la cola: "+usuarios.get(0).toString());
					System.out.println("Se ha podido realizar la compra de las entradas.");
					usuarios.removeFirst();
					
					if (Usuario.getEntradasDisp()==0) {
						usuarios.clear();
					    opc=4;
					}
				}
				else {
					System.out.println("Siguiente en la cola: "+usuarios.get(0).toString());
					System.out.println("No se ha podido realizar la compra de las entradas");
					
				}
				
				break;
			case 3:
				int usuRandom= r.nextInt(usuarios.size());
				Usuario eliminado=usuarios.remove(usuRandom);
				System.out.println("El usuario: "+eliminado+" ha abandonado la cola");
				break;
			case 4:
				System.out.println("Fin del programa.");
				break;
			default:
				System.out.println("No existe esta opcion, selecciona otra.");
			}
			System.out.println("Número de entradas restantes: "+Usuario.getEntradasDisp());
		}while(opc!=4);
	}

}
