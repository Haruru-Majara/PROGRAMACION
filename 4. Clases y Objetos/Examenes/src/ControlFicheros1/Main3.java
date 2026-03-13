package ControlFicheros1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaro las variables para las rutas
		String ruta, ruta2;
		//Hago un HashMap para poder meter los ficheros y el numero asignado 1 no esta reptido 2 si lo esta
		HashMap<String, Integer> repetidos = new HashMap<String, Integer>();
		//Leo
		Scanner sc = new Scanner(System.in);
		//Leemos de teclado la ruta1 o carpeta1
		System.out.println("Escribe la carpeta1");
		ruta = sc.nextLine();
		//Paso el string a ruta
		Path directorio1 = Paths.get(ruta);
		//Esto nos permitira leer lo que hay dentro de las carpetas
		DirectoryStream<Path>Carpeta1=null;
		DirectoryStream<Path>Carpeta2=null;
		//Preguntamos si directorio1 existe y si no, salimos del programa
		if (!Files.exists(directorio1)) {
			System.out.println("No existe esta carpeta.");
			System.exit(0);
		}
		//Leemos la carpta 2 y le asignamos un ruta
		System.out.println("Escribe la carpeta2");
		ruta2 = sc.nextLine();
		Path directorio2 = Paths.get(ruta2);
		//Preguntamos si directorio2 existe y si no, salimos del programa
		if (!Files.exists(directorio2)) {
			System.out.println("No existe esta carpeta.");
			System.exit(0);
		}
		//Para leer los directorios o ficheros y si nos da error capturas las excepciones
		try {
			//Le indicamos que Carpeta1 lea directorio1 es como un ls
			Carpeta1=Files.newDirectoryStream(directorio1);
			//Esto es un bucle que lee el nombre de los ficheros de la carpeta 1 y nos dice si son ficheos, si son, entonces los guarda en el HashMap con valor 1
			for (Path path : Carpeta1) {
				if (Files.isRegularFile(path))
					repetidos.put(path.getFileName().toString(),1);
			}
			//Le indicamos que Carpeta2 lea directorio2 como si fuera un ls
			Carpeta2=Files.newDirectoryStream(directorio2);
			//Bucle que lee los nombres de los ficheros del directorio2
			for (Path path : Carpeta2) {
				//Si son ficheros entramos
				String resultado = path.getFileName().toString();
				if (Files.isRegularFile(path))
					//si la coleccion repetidos contiene el mismo nombre(path) entonces le añade 1 al 1 que tenia
					if(repetidos.containsKey(path.getFileName().toString()))
						repetidos.put(resultado,repetidos.get(resultado)+1 );
					else
						repetidos.put(path.getFileName().toString(),1);
				
			}
			
			for (String i:repetidos.keySet()) {
				if (repetidos.get(i)==1)
					System.out.println(i);
			}
			
		}catch( Exception E) {
			System.out.println("error");
		}
		
	}

}
