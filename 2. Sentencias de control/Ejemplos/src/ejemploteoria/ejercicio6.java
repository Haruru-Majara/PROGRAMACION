package ejemploteoria;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double programacion, marcas;
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce la nota de Programación: ");
		programacion=sc.nextDouble();
		System.out.println("Introduce la nota de Marcas: ");
		marcas=sc.nextDouble();
		
		if (programacion >=5 && marcas >=5 ) // Lo contrario de esto seria (marcas<5 || programacion<5)
			System.out.println("Enhorabuena, has aprobado las dos asignaturas");
		else
			if (marcas <5 && programacion>=5)
				System.out.println("Solo has aprobado una, programación.");
			else
				if (marcas >=5 && programacion<=5)
					System.out.println("Solo has aprobado una,marcas.");
				else
					System.out.println("Desastre, has suspendido las dos asignaturas.");
	}

}
