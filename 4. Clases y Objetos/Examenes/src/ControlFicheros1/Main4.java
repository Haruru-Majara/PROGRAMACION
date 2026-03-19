package ControlFicheros1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String carpeta = "ruta/a/la/carpeta";

		int opcion;

		do {
			System.out.println("1. Aprobados de una asignatura");
			System.out.println("2. Notas de un alumno");
			System.out.println("3. Corregir asignatura");
			System.out.println("0. Salir");

			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {

			// 🔹 OPCIÓN 1
			case 1:
				System.out.print("Asignatura: ");
				String nombre = sc.nextLine();

				File fichero = new File(carpeta + "/" + nombre + ".info");

				if (fichero.exists()) {
					try {
						BufferedReader br = new BufferedReader(new FileReader(fichero));
						String linea;

						while ((linea = br.readLine()) != null) {
							String[] p = linea.split(",");

							double nota = Double.parseDouble(p[3]);

							if (nota >= 5) {
								System.out.println(p[1] + " " + p[2] + " -> " + nota);
							}
						}

						br.close();

					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("No existe");
				}
				break;

			// 🔹 OPCIÓN 2
			case 2:
				System.out.print("DNI: ");
				String dniBuscado = sc.nextLine();

				File carpetaF = new File(carpeta);
				File[] archivos = carpetaF.listFiles();

				try {
					for (File archivo : archivos) {

						BufferedReader br = new BufferedReader(new FileReader(archivo));
						String linea;

						while ((linea = br.readLine()) != null) {
							String[] p = linea.split(",");

							if (p[0].equals(dniBuscado)) {
								System.out.println(archivo.getName() + " -> " + p[3]);
							}
						}

						br.close();
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			// 🔹 OPCIÓN 3
			case 3:
				System.out.print("Asignatura: ");
				String asig = sc.nextLine();

				File f = new File(carpeta + "/" + asig + ".info");

				if (f.exists()) {
					ArrayList<String[]> lista = new ArrayList<>();

					try {
						BufferedReader br = new BufferedReader(new FileReader(f));
						String linea;

						while ((linea = br.readLine()) != null) {
							String[] p = linea.split(",");

							double nota = Double.parseDouble(p[3]) + 1;
							p[3] = String.valueOf(nota);

							lista.add(p);
						}

						br.close();

						// ordenar de mayor a menor
						lista.sort((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));

						// escribir nuevo fichero
						File temp = new File(carpeta + "/temp.info");
						BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

						for (String[] p : lista) {
							bw.write(p[0] + "," + p[1] + "," + p[2] + "," + p[3]);
							bw.newLine();
						}

						bw.close();

						f.delete();
						temp.renameTo(f);

						System.out.println("Corregido");

					} catch (Exception e) {
						e.printStackTrace();
					}

				} else {
					System.out.println("No existe");
				}
				break;
			}

		} while (opcion != 0);

		sc.close();

	}

}
