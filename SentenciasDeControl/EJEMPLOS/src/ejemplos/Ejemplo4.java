package ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double dolares, euros, comision;
		final double cambio=0.87;
		
		System.out.println("Introduce el número de dolares: ");
		dolares=sc.nextDouble();
		euros=dolares*cambio;
		
		if(dolares<100) {
			comision=euros*0.2/100; //euros*0.002
			System.out.println("Tienes una comisión de "+comision+" euros");
			euros=euros-comision;
		}
		System.out.println("Te corresponen: "+euros+" euros");
		
	}

}
