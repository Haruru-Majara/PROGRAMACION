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
public class Reconstruir {
	
	public static void main(String[] args) {
		Path entrada = Paths.get("origen.txt");
		Path salida = Paths.get("destinoPares.txt");
		Path salida2 = Paths.get("destinoImpares.txt");
		// Array de bytes para leer todos los bytes del archivo
		InputStream istream=null;
		OutputStream ostream=null, ostream2=null;
		int c,cont=0;
		try {
			//InputStream y OutputStream de java.io nos permiten trabajar byte a byte
			//Los generamos de forma eficiente utilizando java.nio
			istream = Files.newInputStream(entrada);
			ostream = Files.newOutputStream(salida);
			ostream2 = Files.newOutputStream(salida2);
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
