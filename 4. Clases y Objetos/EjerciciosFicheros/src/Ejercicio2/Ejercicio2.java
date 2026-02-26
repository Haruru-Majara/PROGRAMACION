package Ejercicio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fich1, fich2;
		String ruta1, ruta2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe la ruta del primer fichero: ");
		ruta1=sc.nextLine();
		System.out.println("Escribe el nombre del primer fichero: ");
		fich1=sc.nextLine();
		Path fichero1=Paths.get(ruta1+"/"+fich1);
		if (!Files.exist(fichero1)) {
			System.out.println("La ruta o el archivo no existen");
		}
		else {
			System.out.println("El fichero existe, procedemos a ver el segundo: ");
			System.out.println("Escribe la ruta del segundo fichero: ");
			ruta2=sc.nextLine();
			System.out.println("Escribe la ruta del segundo fichero: ");
			fich2=sc.nextLine();
			Path fichero2 = Paths.get(ruta2+"/"+fich2);
			if (!Files.exist(fichero2))
				System.out.println("La ruta o el archivo no existen");
			else {
				System.out.println("");
			}
				
		}
		
		
	}

}
