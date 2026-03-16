package Ej13_ArrayList;

import java.io.BufferedReader;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;


public class Ejercicio13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fich1;
		int cont=0;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		Charset charset = Charset.forName("UTF-8");
		LinkedList<Alumno> alumnos = new LinkedList<Alumno>();

		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el nombre del fichero que quieras ordenar: ");
		fich1 = sc.nextLine();
		Path fichero = Paths.get(fich1);
		Path fichero_incorrecto = Paths.get("log.txt");
		
		if (!Files.exists(fichero))
			System.out.println("Este fichero no existe");
		else {
			try {
				reader = Files.newBufferedReader(fichero, charset);
				writer = Files.newBufferedWriter(fichero_incorrecto,charset);
				String line = null;
				try {
					while ((line = reader.readLine()) != null) {
						String resultado[] = line.split(",");
						if (resultado.length!=4)
							writer.write(cont+".Número incorrecto de campos");
						else {
							double nota = Double.parseDouble(resultado[2]);
							LocalDate fecha = LocalDate.parse(resultado[3], d);
							Alumno al = new Alumno(resultado[0], resultado[1], nota, fecha);
							int pos = buscarPos(alumnos, nota);
							alumnos.add(pos, al);
						}
					}
				} catch (DateTimeException e) {
					writer.write("La fecha no cumple el formato ----"+line);
					writer.newLine();
				} catch (NumberFormatException e) {
					writer.write("El formato de la nota no es correcto ----"+line);
					writer.newLine();
				}
				
			} catch (IOException x) {
				System.err.format("IOException: %s%n", x);
			}finally {
				if(reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			}

		for (Alumno al : alumnos) {
			System.out.println(al);
		}
	}
	}
	public static int buscarPos(LinkedList<Alumno> alumnos, double nota) {
		for (int i = 0; i < alumnos.size(); i++)
			if (alumnos.get(i).getNota() < nota)
				return i;
		return alumnos.size();
	}
//	public static int buscarPos(LinkedList<Alumno> alumnos, double nota) {
//		int cont=0;
//		Iterator<Alumno> it=alumnos.iterator();
//		while (it.hasNext()) {
//			if (it.next().getNota()<nota)
//				return cont;
//			cont++;
//		}
//		return alumnos.size();
//	}

}
