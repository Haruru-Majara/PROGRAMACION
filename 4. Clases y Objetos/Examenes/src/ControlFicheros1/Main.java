package ControlFicheros1;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Charset charset = Charset.forName("UTF-8");
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		HashMap<String,Propietarios> dueños = new HashMap<String,Propietarios>();
		LinkedList<Automovil> automoviles = new LinkedList<Automovil>();
	
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		
		Path coches= Paths.get("auto.info");
		Path fichLog = Paths.get("log");
		
		// Recorrer el archivo de Propietarios y crear el hashMap
		System.out.println("Vamos a recorrer el archivo de Propietarios y a crear el HashMap...");
		Path propietarios = Paths.get("Propietario.info");
		try {
			reader = Files.newBufferedReader(propietarios, charset);
			String line = null;
			while ((line = reader.readLine()) != null) {
				String resultado[] = line.split(",");
				Propietarios prop = new Propietarios (resultado[0],resultado[1],resultado[2]);
				dueños.put(resultado[0],prop);
				}
						
			
		}catch(IOException x) {
			System.err.format("IOException: %s%n", x);
		}finally {
			if(reader != null) {
				reader.close();
			}
		}
		
		System.out.println("Vamos a recorrer el documento de los automoviles...");
			
		
		if(!Files.exists(coches))
			System.out.println("No existe este fichero");
		else
			try {
				reader = Files.newBufferedReader(coches, charset);
				writer = Files.newBufferedWriter(fichLog,charset,CREATE, WRITE ,TRUNCATE_EXISTING);
				String line= null;
				try {
					while ((line = reader.readLine()) != null) {
						String resultado[] = line.split(",");
						if (resultado.length!=4)
							System.out.println("Número incorrecto de campos");
						else {
							if (!dueños.containsKey(resultado[3])) {
								writer.write("No existe el propietario "+resultado[3]);
							}
							else {
								try {
									LocalDate fecha= LocalDate.parse(resultado[1], d);
								}catch(DateTimeException e) {
									writer.write("La fecha no cumple el formato ----"+line);
									writer.newLine();
									}
							}
						}
					}
				} catch (IOException x) {
				System.err.format("IOException: %s%n", x);
			}finally {
				if(reader != null) {
					reader.close();
				}
				if (writer != null) {
					writer.close();
				}
			}
	}

}
