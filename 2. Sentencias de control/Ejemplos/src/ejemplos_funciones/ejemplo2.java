package ejemplos_funciones;

import java.util.Locale;
import java.util.Scanner;

public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precioInicial, precioFinal, descuento;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduce precio inicial: ");
		precioInicial=sc.nextDouble();
		System.out.println("Introduce precio final: ");
		precioFinal=sc.nextDouble();
		
		descuento=calculaDescuento(precioInicial,precioFinal);
		System.out.println("El descuento aplicado es: "+descuento+"%");
	}
	public static double calculaDescuento (double pi, double pf) {
		double desc;
		desc=(pi-pf)*100/pi;
		return desc;
	}
}
