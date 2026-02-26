package Ejercicio1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta, archivo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una ruta: ");
		ruta=sc.nextLine();
		System.out.println("Introduzca el nombre del archivo: ");
		archivo=sc.nextLine();
		
		Path fichero= Paths.get(ruta+"/"+archivo);
		int n= fichero.getNameCount();
		if (!Files.exists(fichero)) {
			System.out.println("No existe este archivo");
		}
		else
			for (int i = 0; i < n; i++) {
				System.out.println(fichero.getName(i));
			}
	}

}
