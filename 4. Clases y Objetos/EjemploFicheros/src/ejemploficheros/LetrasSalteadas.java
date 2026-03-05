package ejemploficheros;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *  @descrition Clase que nos permite leer un archivo byte a byte de forma secuencial sin buffer
 */
public class LetrasSalteadas {
	
	public static void main(String[] args) {
		Path entrada = Paths.get("origenPares.txt");
		Path entrada2 = Paths.get("origenImpares.txt");
		Path salida = Paths.get("destino.txt");
		// Array de bytes para leer todos los bytes del archivo
		InputStream istream=null, istream2=null;
		OutputStream ostream=null;
		int c,cont=0;
		try {
			//InputStream y OutputStream de java.io nos permiten trabajar byte a byte
			//Los generamos de forma eficiente utilizando java.nio
			istream = Files.newInputStream(entrada);
			istream2 = Files.newInputStream(entrada2);
			ostream = Files.newOutputStream(salida);

			while ((c = istream.read()) != -1) {
				// Escribimos todos los bytes en el archivo salida
				// Despu�s de ejecutar comprobar que es igual a entrada
					
					if (cont % 2 == 0)
						ostream.write(c);
						
					else
						ostream2.write(c);
					cont++;
					
			}
			istream.close();
			ostream.close();
		} catch (IOException io) {
			System.err.println(io);
		}
	}

}
