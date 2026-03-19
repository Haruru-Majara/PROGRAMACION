package ControlFicheros1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ExamenLibros {

	public static void main(String[] args) {
		File carpeta = new File("ruta/a/carpetaApellido");
		File salida = new File("resultado.txt");

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(salida));

			File[] archivos = carpeta.listFiles();

			if (archivos != null) {
				for (File archivo : archivos) {

					if (archivo.getName().startsWith("ventas")) {

						BufferedReader reader = new BufferedReader(new FileReader(archivo));
						String linea;

						while ((linea = reader.readLine()) != null) {

							String[] partes = linea.split(",");

							if (partes.length == 3) {
								String titulo = partes[0];
								String autor = partes[1];
								double precio = Double.parseDouble(partes[2]);

								if (precio > 20) {
									writer.write("Título:'" + titulo + "' autor:" + autor);
									writer.newLine();
								}
							}
						}

						reader.close();
					}
				}
			}

			writer.close();
			System.out.println("Hecho");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
