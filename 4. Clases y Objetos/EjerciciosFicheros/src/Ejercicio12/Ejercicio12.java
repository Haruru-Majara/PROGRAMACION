package Ejercicio12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

/**
 * @descrition Clase que abre un archivo en forma secuencial, con stream y
 *             buffer para leer las l�neas del archivo
 * 
 */
public class Ejercicio12 {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get("entrada.txt");
		Path file2 = Paths.get("salida.txt");
		Charset charset = Charset.forName("UTF-8");
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String palabra;
		Scanner sc = new Scanner(System.in);

		try {
			// Creamos un BuffereReader de java.io
			reader = Files.newBufferedReader(file, charset);
			writer = Files.newBufferedWriter(file2, charset,CREATE, WRITE, TRUNCATE_EXISTING);
			String line = null;
			System.out.println("Introduce la palabra clave: ");
			palabra = sc.nextLine();

			while ((line = reader.readLine()) != null) {
				// System.out.println(line);
				if (line.indexOf(palabra) != -1) {
					writer.write(line);
					writer.newLine();
				}
			}
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		} finally {

			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
		
		
	}

}