package ejemploteoria;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio2y3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dolares, euros, comision=0;
		final double cambio=0.85;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Escribe una cantidad de dólares: ");
		dolares=sc.nextDouble();
		
		if (dolares<100) {
			comision=dolares*0.002;
		}
		euros=(dolares-comision)*cambio;
			System.out.println("Vas a recibir "+euros+" euros");
	}

}
