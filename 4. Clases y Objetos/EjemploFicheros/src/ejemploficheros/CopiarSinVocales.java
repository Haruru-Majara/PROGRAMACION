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
public class CopiarSinVocales {
	
	public static void main(String[] args) {
		Path entrada = Paths.get("origen.txt");
		Path salida = Paths.get("destino.txt");
		Path salida2 = Paths.get("destino.txt");
		// Array de bytes para leer todos los bytes del archivo
		InputStream istream=null;
		OutputStream ostream=null;
		int c;
		try {
			//InputStream y OutputStream de java.io nos permiten trabajar byte a byte
			//Los generamos de forma eficiente utilizando java.nio
			istream = Files.newInputStream(entrada);
			ostream = Files.newOutputStream(salida);
			while ((c = istream.read()) != -1) {
				// Escribimos todos los bytes en el archivo salida
				// Despu�s de ejecutar comprobar que es igual a entrada
					
					if (c != 'a' && c != 'A' && c != 'e' && c != 'E' && c != 'i' && c != 'I' && c != 'o' && c != 'O' && c != 'u' && c != 'U')
						ostream.write(c);
					
			}
			istream.close();
			ostream.close();
		} catch (IOException io) {
			System.err.println(io);
		}
	}

}
