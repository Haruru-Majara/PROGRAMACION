package Hoja3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int gastoFijo= 2;
		double lecturaInicial, lecturaFinal, diferencia, importeFinal=0;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce primera lectura del contador: ");
		lecturaInicial=sc.nextDouble();
		System.out.println("Introduce segunda lectura del contador: ");
		lecturaFinal=sc.nextDouble();
		
		diferencia=lecturaFinal-lecturaInicial;
		
		if (diferencia <=0)
			System.out.println("ERROR. Lectura incorrecta.");
		else
			if (diferencia <=100)
				importeFinal=diferencia*0.50;
			else
				if (diferencia <=250)
					importeFinal=(100*0.50)+(diferencia-100)*0.70;
				else
					importeFinal=(100*0.50)+(150*0.70)+(diferencia-250)*1;
		
		System.out.println("Tu importe total es de: "+(importeFinal+gastoFijo)+" euros.");
	}

}
