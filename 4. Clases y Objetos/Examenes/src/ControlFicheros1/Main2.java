package ControlFicheros1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta, ruta2;
		HashSet<String> ficheros =new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe la carpeta1");
		ruta=sc.nextLine();
		Path directorio1 = Paths.get(ruta);
		
		if(!Files.exists(directorio1)) {
			System.out.println("No existe esta carpeta.");
			System.exit(0);
		}
		try {
			for (Path path : Files.newDirectoryStream(directorio1)) {
				ficheros.add(path.getFileName().toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		System.out.println("Escribe la carpeta2");
		ruta2=sc.nextLine();
		
		Path directorio2 = Paths.get(ruta2);
		
		if(!Files.exists(directorio2)) {
			System.out.println("No existe esta carpeta.");
			System.exit(0);
		}
		try {
			for (Path path : Files.newDirectoryStream(directorio2)) {
				ficheros.add(path.getFileName().toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String i:ficheros) {
			System.out.println(i);
		}
			
	}

}
