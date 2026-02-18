package Ejercicio5;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nacionalidad;
		
		
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> alumnos= new HashMap<>();
		
		do {
			
			System.out.println("Anota tu nacionalidad: ");
			nacionalidad=sc.nextLine().toUpperCase();
			if (nacionalidad.equalsIgnoreCase("fin"))
				break;
			else {
				if (!alumnos.containsKey(nacionalidad))	{
					alumnos.put(nacionalidad, 1);
					System.out.println("Se anotó por primera vez esta nacionalidad");
				}
				else {
					int antes=alumnos.get(nacionalidad);
					alumnos.put(nacionalidad,antes+1);
					System.out.println("Se sumó uno a la nacionalidad");
				}
			}
			
			System.out.println(alumnos);
			
		}while(!nacionalidad.equalsIgnoreCase("fin"));
	}

}
