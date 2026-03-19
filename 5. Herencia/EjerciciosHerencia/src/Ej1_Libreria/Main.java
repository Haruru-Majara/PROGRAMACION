package Ej1_Libreria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * En una librería se guarda por cada libro: titulo, autor, editorial y precio. Hay libros
			normales y de texto. Estos tienen como información adicional el curso al que
			corresponden y además se les aplica un descuento entre el 0 y el 20%.
			Programa con un menú con las siguientes opciones:
			1. Dar de alta libros en un ArrayList .
			2. Listar todos los libros mostrando la información de cada uno.
			3. Listar los libros que tienen un precio de salida menor que un precio introducido
			por teclado.
		 * */
		
		String nombre,autor,editorial,curso;
		double precio,descuento;
		int opc,opc2;
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Libro> libreria=new ArrayList<>();
		
		System.out.println("---------MENÚ---------");
		System.out.println("1. Dar de alta un libro.");
		System.out.println("2. Mostrar los libros.");
		System.out.println("3. Mostrar libros con precio de salida menor al introducido.");
		System.out.println("4. Salir.");
		opc=sc.nextInt();
		
		switch (opc) {
		case 1:
			System.out.println("¿Qué tipo de libro quieres guardar?");
			System.out.println("1. Libro normal");
			System.out.println("2. Libro de texto");
			opc2=sc.nextInt();
			while (opc2 != 1 && opc2 != 2) { 
				if (opc2 == 1) {
					System.out.println("Nombre del libro");
					nombre=sc.nextLine();
					System.out.println("Autor del libro");
					autor=sc.nextLine();
					System.out.println("Editorial");
					editorial=sc.nextLine();
					System.out.println("Precio");
					precio=sc.nextInt();
				}
				else {
					System.out.println("Nombre del libro");
					nombre=sc.nextLine();
					System.out.println("Autor del libro");
					autor=sc.nextLine();
					System.out.println("Editorial");
					editorial=sc.nextLine();
					System.out.println("Precio");
					precio=sc.nextInt();
					System.out.println("Curso");
					curso=sc.nextLine();
					System.out.println("Descuento");
					descuento=sc.nextDouble();
					}

			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			System.out.println("Fin del programa");
			break;
		default:
			System.out.println("La opción elegida no corresponde con ninguna.");
		}
		//libreria.add(new Libro("El hobbit","J.R. Tolkien","Alfaguara",30));
		//libreria.add(new Texto("Programación","Felix Gómez","MacGrawn",38,"DAW1",10));
		
		/*Iterator<Libro> it=libreria.iterator();
		
		while(it.hasNext()) {
			Libro l=it.next();
			System.out.println(l);
		}*/
	}

}
