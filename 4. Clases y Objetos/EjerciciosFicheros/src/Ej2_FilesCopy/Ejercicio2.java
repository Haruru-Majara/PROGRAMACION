package Ej2_FilesCopy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String respuesta;
		String fich1, fich2;
		String ruta1, ruta2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la ruta del primer fichero: ");
		ruta1 = sc.nextLine();
		System.out.println("Escribe el nombre del primer fichero: ");
		fich1 = sc.nextLine();
		Path fichero1 = Paths.get(ruta1 + "/" + fich1);
		if (!Files.exists(fichero1)) {
			System.out.println("La ruta o el archivo no existen");
		} else {
			System.out.println("El fichero existe, procedemos a ver el segundo: ");
			System.out.println("Escribe la ruta del segundo fichero: ");
			ruta2 = sc.nextLine();
			System.out.println("Escribe el nombre del segundo fichero: ");
			fich2 = sc.nextLine();
			Path fichero2 = Paths.get(ruta2 + "/" + fich2);

			try {
				if (Files.exists(fichero2)) {
					System.out.println("El archivo existe, está seguro de hacerlo?");
					respuesta = sc.nextLine();

					if (respuesta.equalsIgnoreCase("si")) {
						Files.copy(fichero1, fichero2);
						System.out.println("Archivo copiado");
					} else
						System.out.println("Archivo no copiado");
				} else {
					System.out.println("El archivo no existe, copiando...");
					Files.copy(fichero1, fichero2);
					System.out.println("Archivo copiado");
				}

			} catch (IOException e) {
				System.out.println("Error al copiar el archivo: " + e.getMessage());
			}

		}

	}
}
