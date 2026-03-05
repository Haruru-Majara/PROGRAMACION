package Ejercicio13;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;


public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fich1;
		BufferedReader reader = null;
		Charset charset = Charset.forName("UTF-8");
		LinkedList <Alumno> alumnos=new LinkedList<Alumno>();
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Escribe el nombre del fichero que quieras ordenar: ");
		fich1=sc.nextLine();
		Path fichero=Paths.get(fich1);
		
		if (!Files.exists(fichero))
			System.out.println("Este fichero no existe");
		else {
			try {
				reader = Files.newBufferedReader(fichero,charset);
				String line=null;
				while ((line = reader.readLine()) != null) {
					String resultado[]=line.split(",");
				}
				
			}catch (IOException x) {
				System.err.format("IOException: %s%n", x);
			}
		} 
	}
	
	public static int buscarPos(LinkedList<Alumno> alumnos,Alumno resultado) {
		for(int i=0;i<alumnos.size();i++)
			if (alumnos.get
				return i;
		return alumnos.size();
	}

}
