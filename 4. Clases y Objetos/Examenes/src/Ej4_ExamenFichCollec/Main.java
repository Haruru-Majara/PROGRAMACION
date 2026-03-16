package Ej4_ExamenFichCollec;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tenemos en una carpeta varios ficheros de texto cuyo nombre es el de una
		 * asignatura , en cada uno de ellos se guarda la siguiente información en cada
		 * línea: dni, nombre, apellido,nota separados por comas. Haced un programa con
		 * un menú que realice las siguientes operaciones: - Leed el nombre de una
		 * asignatura por teclado, si existe, cread un arrayList con los alumnos que
		 * hayan aprobado. - Dado el dni de un alumno mostrad sus notas en todas las
		 * asignaturas. - Ha habido un error en las calificaciones de una asignatura.
		 * Cread un nuevo fichero ordenado por notas de mayor a menor, en el que se ha
		 * sumado un punto a cada nota. Sustituir el antiguo fichero por el nuevo.
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		boolean encontrado = false;
		Path carpeta = Paths.get("carpeta");
		Path log = Paths.get("log.txt");
		int opc = 0;
		Charset charset = Charset.forName("UTF-8");
		BufferedWriter writer = null;
		HashMap<String, Alumno> alumnos = new HashMap<>();
		HashSet<String> asignaturas = new HashSet<String>();

		if (!Files.isDirectory(carpeta)) {
			System.out.println("no es una carpeta");

		} else {
			try {
				DirectoryStream<Path> stream = Files.newDirectoryStream(carpeta);
				writer = Files.newBufferedWriter(log, charset, CREATE, WRITE, APPEND);
				for (Path path : stream) {
					if (Files.isRegularFile(path)) {
						// guardamos el nombre de la asignatura en el HashSet
						asignaturas.add(path.getFileName().toString());
						try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
							String line;
							while ((line = reader.readLine()) != null) {

								String[] datos = line.split(",");

								if (datos.length == 3) {
									try {
										String dni = datos[0].trim();
										String nombre = datos[1].trim();
										String apellido = datos[2].trim();
										double nota = Double.parseDouble(datos[3].trim());

									} catch (NumberFormatException e) {
										System.err.println("Precio no válido en: " + line);
									}
								}
							}
						}
					}

				}
				System.out.println("*****Bienvenido al Menu de opciones****");
				System.out.println("1. Mostrar los alumnos aprobados de una asignatura");
				System.out.println("2. MOstrar las notas de un alumno");
				System.out.println("3. Error en notas, crear y sustituir");
				opc = sc.nextInt();

			} catch (IOException e) {
				System.err.println("Error de E/S: " + e.getMessage());
			}
		}

	}

}
