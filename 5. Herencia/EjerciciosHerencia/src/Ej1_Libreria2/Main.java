package Ej1_Libreria2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * En una librería se guarda por cada libro: titulo, autor, editorial y precio.
		 * Hay libros normales y de texto. Estos tienen como información adicional el
		 * curso al que corresponden y además se les aplica un descuento entre el 0 y el
		 * 20%. Programa con un menú con las siguientes opciones: 1. Dar de alta libros
		 * en un ArrayList . 2. Listar todos los libros mostrando la información de cada
		 * uno. 3. Listar los libros que tienen un precio de salida menor que un precio
		 * introducido por teclado.
		 */

		String nombre, autor, editorial, curso;
		double precio=0, descuento;
		int opc, opc2;
		Scanner sc = new Scanner(System.in);

		ArrayList<Libro> libreria = new ArrayList<>();
		do {
			System.out.println("                      ");
			System.out.println("---------MENÚ---------");
			System.out.println("1. Dar de alta un libro.");
			System.out.println("2. Mostrar los libros.");
			System.out.println("3. Mostrar libros con precio de salida menor al introducido.");
			System.out.println("4. Salir.");
			opc = sc.nextInt();

			switch (opc) {
			case 1:
				do {
					System.out.println("¿Qué tipo de libro quieres guardar?");
					System.out.println("1. Libro normal");
					System.out.println("2. Libro de texto");
					opc2 = sc.nextInt();
					sc.nextLine();
					if (opc2 == 1) {
						System.out.println("Nombre del libro");
						nombre = sc.nextLine();
						System.out.println("Autor del libro");
						autor = sc.nextLine();
						System.out.println("Editorial");
						editorial = sc.nextLine();
						System.out.println("Precio");
						precio = sc.nextInt();

						Libro normal = new Libro(nombre, autor, editorial, precio);
						libreria.add(normal);
						System.out.println("Libro guardado con éxito");
						break;
					} else {
						if (opc2 == 2) {
							System.out.println("Nombre del libro");
							nombre = sc.nextLine();
							System.out.println("Autor del libro");
							autor = sc.nextLine();
							System.out.println("Editorial");
							editorial = sc.nextLine();
							System.out.println("Precio");
							precio = sc.nextInt();
							sc.nextLine();
							System.out.println("Curso");
							curso = sc.nextLine();
							System.out.println("Descuento");
							descuento = sc.nextDouble();

							Libro texto = new Texto(nombre, autor, editorial, precio, curso, descuento);
							libreria.add(texto);
							System.out.println("Libro guardado con éxito");
							break;
						} else {
							System.out.println("Opción incorrecta.");
							System.out.println("¿Qué tipo de libro quieres guardar?");
							System.out.println("1. Libro normal");
							System.out.println("2. Libro de texto");
							opc2 = sc.nextInt();
						}
					}
				} while (opc2 != 1 || opc2 != 2);
				break;
			case 2:
				Collections.sort(libreria);
				System.out.println("Colección de libros: ");

				Iterator<Libro> it = libreria.iterator();
				while (it.hasNext()) {
					Libro l = it.next();
					System.out.println(l);
				}
				break;
			case 3:
				System.out.println("Introduce un precio: ");
				precio=sc.nextInt();
				for (Libro l : libreria) { // Por cada libro que este en la libreria
					if (l.getPrecio()<=precio)
					System.out.println(l);
				}
				break;
			case 4:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("La opción elegida no corresponde con ninguna.");
			}
		} while (opc != 4);

		/**
		 * De esta manera se podrían meter manualmete los libros:
		 * 
		 * //libreria.add(new Libro("El hobbit","J.R. Tolkien","Alfaguara",30));
		 * //libreria.add(new Texto("Programación","Felix
		 * Gómez","MacGrawn",38,"DAW1",10));
		 * 
		 * 
		 */
		
		System.out.println("A continuación muestro todos los cursos de los libros de texto de mi librería: ");
		for(Libro l:libreria) {
			//if (l instanceof Texto)
			if (l.getClass().getSimpleName().equals("Texto")) //dame el nombre de la clase a la que pertenece este objeto
				System.out.println(((Texto) l).getCurso());
		}
			
	}

}
