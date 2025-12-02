package Hoja6;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorA=0,contadorB=0,contadorC=0;
		double calibre;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		/*do {
			System.out.println("Introduce el calibre de una fresa: ");
			calibre=sc.nextInt();
			
			if (calibre >=1 && calibre <3)
				contadorA++;
			else
				if (calibre >=3 && calibre <=5)
					contadorB++;
				else
					contadorC++;
			
		}while(calibre!=0);
		Tengo el problema de que si meto 0 me entra y ya me lo cuenta como c asi que es mejor hacerlo con while
		o poner otro if y que si es 0 no le valga*/
		System.out.println("Introduce el calibre de una fresa: ");
		calibre=sc.nextDouble();
		
		while(calibre!=0) {
			if (calibre >=1 && calibre <3)
				contadorA++;
			else
				if (calibre >=3 && calibre <=5)
					contadorB++;
				else
					if (calibre > 5)
						contadorC++;
					else
						System.out.println("Calibre no pertenece a ninguna categoría.");
			
			System.out.println("Introduce el calibre de una fresa: ");
			calibre=sc.nextDouble();
		}
		
		if (contadorA ==0)
			System.out.println("En la CATEGORÍA A no hay fresas.");
		else
			System.out.println("En la categoría A hay: "+contadorA);
		if (contadorB ==0)
			System.out.println("En la CATEGORÍA B no hay fresas.");
		else
			System.out.println("En la categoría B hay: "+contadorB);
		if (contadorC==0)
			System.out.println("En la CATEGORÍA C no hay fresas.");
		else
			System.out.println("En la categoría C hay: "+contadorC);
		
		
		
		
				
	}

}
