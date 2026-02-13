package Ejercicio4;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
		String nombre;
		double nota;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		HashMap <String, Double> alumnos = new HashMap<>();
	
	do {
		System.out.println("                ");
		System.out.println("------MENÚ------");
		System.out.println("1.Alta");
		System.out.println("2.Modificar nota");
		System.out.println("3.Sustituir alumno");
		System.out.println("4.Borrar");
		System.out.println("5.Buscar");
		System.out.println("6.Salir");
		opc=sc.nextInt();
		sc.nextLine();
		switch(opc) {
		case 1:
			System.out.println("Introduce el nombre del alumno: ");
			nombre=sc.nextLine();
			if (alumnos.containsKey(nombre))
				System.out.println("No se puede añadir, este alumno ya existe");
			else {
				System.out.println("Introduce nota");
				nota=sc.nextDouble();
				alumnos.put(nombre,nota);
			}
			break;
		case 2:
			System.out.println("Introduce el nombre del alumno: ");
			nombre=sc.next();
			if (!alumnos.containsKey(nombre))
				System.out.println("No se puede modificar, este alumno no existe");
			else {
				System.out.println("Introduce nota nueva");
				nota=sc.nextDouble();
				alumnos.put(nombre,nota);
			}
			break;
		case 3:
			System.out.println("Introduce el nombre del alumno: ");
			nombre=sc.next();
			if (!alumnos.containsKey(nombre))
				System.out.println("No se puede modificar, este alumno no existe");
			else {
				System.out.println("Introduce el nombre del nuevo alumno");
				nombre=sc.nextLine();
				System.out.println("Introduce la nota del nuevo alumno");
				nota=sc.nextDouble();
				alumnos.put(nombre,nota);
			}
			break;
		case 4:
			System.out.println("Introduce el nombre del alumno: ");
			nombre=sc.next();
			if (alumnos.containsKey(nombre)) {
				alumnos.remove(nombre);
				System.out.println("Alumno borrado exitosamente");
			}
			else 
				System.out.println("No se puede borrar un alumno que no existe");
			break;
			
		case 5:
			System.out.println("Introduce el nombre del alumno: ");
			nombre=sc.next();
			if (alumnos.containsKey(nombre))
				System.out.println("Este alumno ya existe");
			else 
				System.out.println("No existe este alumno.");
			break;
		case 6:
			System.out.println("Fin del programa.");
			break;
		default:
			System.out.println("No existe esta opción.");
		
		}
		
		System.out.println("Los alumnos actualmente son: ");
		for (String nombre1 : alumnos.keySet()) {
            System.out.println(nombre1 + " con nota " + alumnos.get(nombre1));
        }
		
		}while(opc!=6);
	}
}
