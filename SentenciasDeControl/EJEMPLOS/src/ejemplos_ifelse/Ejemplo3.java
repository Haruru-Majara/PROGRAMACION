package ejemplos_ifelse;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double dolares, euros;
		final double cambio=0.87;
		
		System.out.println("Introduce el número de dolares: ");
		dolares=sc.nextDouble();
		euros=dolares*cambio;
		
		System.out.println("Te corresponen: "+euros+" euros");
		
		
	}

}
