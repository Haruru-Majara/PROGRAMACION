package ejemplosarrays;

import java.util.Scanner;

/**
 * Programa que lee cadenas hasta anotar fin y las guarda en un array.
 * Máximo 10 cadenas.
 * Luego las muestra.
 */
public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenas[]=new String[10]; //ahora son cadenas
		//cuando es un arrays de objetos mete un null en lugar de un 0
		String cadena;
		int cont=0;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<cadenas.length;i++) {
			System.out.println("Introduce cadena:");
			cadena=sc.nextLine();
			if (cadena.equalsIgnoreCase("fin"))
				break;
			cadenas[i]=cadena;
			cont++;
		}
		// si la cadena que me anotan es fin me salgo del bucle con lo cual
		//no la mete como cadena, osea no cuenta, solo rellena 0 y 1
		
		System.out.println("Cadenas leidas:");

		for(int i=0;i<cont;i++) { // usamos cont en lugar de length porque asi
			//solo registra hasta que celda esta escrita y no coge los nulls
			System.out.println(cadenas[i]);
		}
	}

}
