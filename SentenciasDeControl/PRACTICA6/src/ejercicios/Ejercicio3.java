package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * En una empresa de fruta se seleccionan fresas en 3 categorías dependiendo de su calibre:
 * A (de 1 a 3 cm), B (de 3 a 5 cm), C(más de 5). Ir anotando el grosor de cada fresa hasta
 * anotar 0. Decir cuántas hay de cada categoría y si no ha habido fresas de alguna categoría.
 * */

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		int categoriaA=0,categoriaB=0,categoriaC=0;
		double calibre;
		
		do {
			System.out.println("Introduce calibre de fresa. Para terminar, anotar un 0.");
			calibre=sc.nextDouble();
			
			if(calibre==0)
				break;
			else
				if(calibre>=1 && calibre<3)
					categoriaA++;
				else
					if(calibre>=3 && calibre<=5)
						categoriaB++;
					else
						categoriaC++;
					
		}while(calibre!=0);
		
		System.out.println("");
		System.out.println("TOTAL DE FRESAS POR CATEGORÍA:");
		if(categoriaA==0)
			System.out.println("Categoría A tiene no tiene fresas.");
		else
			System.out.println("Categoría A: "+categoriaA);
		
		if(categoriaB==0)
			System.out.println("Categoría B tiene no tiene fresas.");
		else
			System.out.println("Categoría B: "+categoriaB);
		
		if(categoriaC==0)
			System.out.println("Categoría C tiene no tiene fresas.");
		else
			System.out.println("Categoría C: "+categoriaC);
		
		
	
		
	}

}
