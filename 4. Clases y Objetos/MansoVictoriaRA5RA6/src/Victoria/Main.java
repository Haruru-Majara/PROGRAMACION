// Examen Ficheros Y Colecciones
package Victoria;

import java.io.BufferedReader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int numPedido;
		double precio;
		String codUsu,destino;
		
		Path carpeta = Paths.get("Victoria");
		Path fichero = Paths.get("Victoria/pedidos.txt");
		LinkedList<Pedido> pedidos = new LinkedList<Pedido>();
		HashMap<String, Integer> destinos = new HashMap<String, Integer>();
		BufferedReader reader = null;
		Charset charset = Charset.forName("UTF-8");

		if (!Files.exists(carpeta))
			System.out.println("No existe la carpeta");
		else {
			if (!Files.isDirectory(carpeta))
				System.out.println("No es una carpeta");
			else {
				DirectoryStream<Path> stream;
				try {
					stream = Files.newDirectoryStream(carpeta);
					for (Path path : stream) {
						if (!path.getFileName().equals(fichero.getFileName()))
							Files.delete(path);
					}

				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

		try {
			reader = Files.newBufferedReader(fichero, charset);
			String line = null;
			Pedido pedido=new Pedido(numPedido,precio,codUsu,destino);
			while ((line = reader.readLine()) != null) {
				int posi=ordenar(pedidos, pedido);
				pedidos.add(posi,pedido);
			}
		}catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		} finally {

			if (reader != null) {
				reader.close();
			}
		}
	}
		
		public static int ordenar(LinkedList<Pedido> pedidos,Pedido p) {
			for(int i=0;i<pedidos.size();i++)
				if (pedidos.get(i).getCodUsu().compareTo(p.getCodUsu())>0)
					return i;
			return pedidos.size();
		}
*/
	}

}
