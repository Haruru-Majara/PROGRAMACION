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
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Charset charset = Charset.forName("UTF-8");
		BufferedReader readerP = null, readerA=null;
		BufferedWriter writer = null;
		
		HashMap<String,Propietarios> dueños = new HashMap<String,Propietarios>();
		LinkedList<Automovil> automoviles = new LinkedList<Automovil>();
	
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		
		Path flog = Paths.get("log.txt");
		
		
		
		// Recorrer el archivo de Propietarios y crear el hashMap
		System.out.println("Vamos a recorrer el archivo de Propietarios y a crear el HashMap...");
		Path propietarios = Paths.get("Propietario.info");
		if (!Files.exists(propietarios)) {
				System.out.println("No existe el fichero de propietarios");
				System.exit(0);
		}
		try {
			readerP = Files.newBufferedReader(propietarios, charset); //Abrir archivo
			writer = Files.newBufferedWriter(flog, charset, CREATE, TRUNCATE_EXISTING, WRITE);
			String line = null;
			while ((line = readerP.readLine()) != null) {
				String resultado[] = line.split(","); // Trocear
				if(resultado.length!=3) {
					System.out.println("Número incorrecto de campos");
					writer.write("Fichero Propietarios: Número incorrecto de campos");
					writer.newLine();
				}
				else {
					Propietarios prop = new Propietarios (resultado[0],resultado[1],resultado[2]);
					dueños.put(resultado[0],prop);
				}
			}
		}catch(IOException x) {
			System.err.format("IOException: %s%n", x);
			writer.write("IOException en el fichero de propietarios");
		}finally {
			if(readerP != null) 
				readerP.close();
		}
		
		System.out.println("Vamos a recorrer el documento de los automoviles...");
		
		Path coches= Paths.get("auto.info");
		
		if(!Files.exists(coches)) 
			System.out.println("No existe este fichero");
		else {
			try {
				readerA = Files.newBufferedReader(coches, charset);
				String line= null;
			
					while ((line = readerA.readLine()) != null) {
						String resultado[] = line.split(",");
						if (resultado.length!=4) {
							System.out.println("Número incorrecto de campos");
							writer.write("Fichero coches: Número incorrecto de campos");
							writer.newLine();
						}
						else {
							if (!dueños.containsKey(resultado[3])) {
								System.out.println("No existe el propietario "+resultado[3]);
								writer.write("No existe el propietario "+resultado[3]);
							}
							else {
								try {
									double precio=Double.parseDouble(resultado[2]);
									LocalDate fecha= LocalDate.parse(resultado[1], d);
									Automovil auto=new Automovil(resultado[0],fecha,precio,resultado[3]);
									int pos=buscar(automoviles,auto);
									automoviles.add(pos,auto);
								}catch(DateTimeParseException e) {
									System.out.println("Fecha incorrecta");
									writer.write("Fichero autos: Fecha incorrecta");
								}catch(NumberFormatException e) {
									System.out.println("Importe incorrecto");
									writer.write("Fichero autos: Importe incorrecto");
								}
							}
						}
					}
				}catch (IOException x) {
					System.err.format("IOException: %s%n", x);
			    }finally {
					if(readerA != null) {
						readerA.close();
					}
					if (writer != null) {
						writer.close();
					}
			    
			}
		}
		//Volqueis en un archivo txt, baratos.txt. Todos los vehículos con 
		//importe inferior a 2000 euros, añadiendo el nombre y apellido de su propietario
		Path fbaratos = Paths.get("baratos.txt");
		BufferedWriter baratos=Files.newBufferedWriter(fbaratos,charset,CREATE,WRITE,TRUNCATE_EXISTING);
		for (int i=0;i<automoviles.size();i++) {
			Automovil auto=automoviles.get(i);
			if (automoviles.get(i).getPrecio()<2000) {
				Propietarios p=dueños.get(automoviles.get(i).getDniPropietario());
				writer.write(auto.toString()+","+p.getNomAp()+"\n");
			}
		}
			
		if (baratos != null) {
			baratos.close();
		}
		
		
	}

	public static int buscar(LinkedList<Automovil> automoviles, Automovil auto) {
		for (int i = 0; i < automoviles.size(); i++) {
			if (auto.getFechaCompra().isBefore(automoviles.get(i).getFechaCompra()))
				return i;
			else if (auto.getFechaCompra().equals(automoviles.get(i).getFechaCompra())
					&& auto.getPrecio() < automoviles.get(i).getPrecio())
				return i;

		}
		return automoviles.size();
	}

}
