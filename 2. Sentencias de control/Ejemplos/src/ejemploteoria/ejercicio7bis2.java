package ejemploteoria;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio7bis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduce una temperatura:");
		temp = sc.nextDouble();

		if (temp > 30)
			System.out.println("La actividad a realizar para la temperatura de " + temp + "º"+" será NATACIÓN.");
		else

			if (temp > 20)
				System.out.println("La actividad a realizar para la temperatura de " + temp + "º"+" será TENIS.");
			else
	
				if (temp > 10)
					System.out.println("La actividad a realizar para la temperatura de " + temp + "º"+" será GOLF.");
				else
		
					if (temp > 5)
						System.out.println("La actividad a realizar para la temperatura de " + temp + "º"+" será ESQUÍ.");
					else
						System.out.println("La actividad a realizar para la temperatura de " + temp + "º"+" será PARCHÍS.");

	}

}
