package Ejercicio1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*1. Programa que lleve en un ArrayList la información de una serie de alumnos,
		por cada alumno se guarda su nombre y su nota. Se pide hacer un menú que permita:
		1. Dar de alta a un alumno, comprobando que no existe previamente en el
		ArrayList.
		2. Modificar la nota de un alumno dado.
		3. Sustituir un alumno por otro anotado por teclado.
		4. Borrar un alumno dado su nombre.
		5. Nos dice si un alumno está en el ArrayList.*/
		
		int opcion,pos;
		String nombre;
		double nota,nuevaNota;
		ArrayList <Alumno> alumnos= new ArrayList<Alumno>();
	
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		do {
			System.out.println("1.Alta");
			System.out.println("2.Modificar nota");
			System.out.println("3.Sustituir alumno");
			System.out.println("4.Borrar");
			System.out.println("5.Buscar");
			System.out.println("6.Salir");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduce nombre del alumno: ");
				nombre=sc.nextLine();
				//pos=buscar(alumnos,nombre);
				pos=alumnos.indexOf(new Alumno(nombre));
				if (pos!=-1)
					System.out.println("Ya existe ese alumno");
				else {
					System.out.println("Introduce nota: ");
					nota=sc.nextDouble();
					//Alumno al=new Alumno(nombre,nota);
					//alumnos.add(al);
					alumnos.add(new Alumno(nombre,nota));
				}	
				break;
			case 2:
				System.out.println("Introduce nombre del alumno: ");
				nombre=sc.nextLine();
				pos=buscar(alumnos,nombre);
				if (pos==-1)
					System.out.println("No existe este alumno, no se puede modificar su nota.");
				else {
					System.out.println("Introduce la nueva nota: ");
					nuevaNota=sc.nextDouble();
					alumnos.get(pos).setNota(nuevaNota);
				}
				break;
			case 3:
				System.out.println("Introduce nombre del alumno que quieres sustituir: ");
				nombre=sc.nextLine();
				pos=buscar(alumnos,nombre);
				if (pos==-1)
					System.out.println("No existe ese alumno, no se puede sustituir");
				else {
					System.out.println("Introduce nombre del nuevo alumno: ");
					nombre=sc.nextLine();
					System.out.println("Introduce nota del nuevo alumno: ");
					nota=sc.nextDouble();
					Alumno a=new Alumno(nombre,nota);
					alumnos.set(pos, a);
				}	
				break;
			case 4:
				System.out.println("Introduce nombre del alumno: ");
				nombre=sc.nextLine();
				pos=buscar(alumnos,nombre);
				if (pos==-1)
					System.out.println("No existe el alumno");
				else {
					alumnos.remove(pos);
				}
				break;
			case 5:
				System.out.println("Introduce nombre del alumno: ");
				nombre=sc.nextLine();
				pos=buscar(alumnos,nombre);
				if (pos!=-1)
					System.out.println("Ya existe ese alumno en el array: "+alumnos.get(pos).toString());
				else {
					System.out.println("No existe este alumno en el array");
				}
				break;
			case 6:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("No se ha encontrado esta opcion.");
			}
		}while(opcion!=6);
	}
	public static int buscar(ArrayList<Alumno>alumnos, String nombre) {
		for (int i=0;i<alumnos.size();i++) {
			if (alumnos.get(i).getNombre().equalsIgnoreCase(nombre))
				return i;
		}
		return -1;
	}
}
