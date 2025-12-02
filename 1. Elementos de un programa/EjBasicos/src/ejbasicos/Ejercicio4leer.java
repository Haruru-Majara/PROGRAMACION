package ejbasicos;
import java.util.Locale;
//import java.io.*; esto importa utilidades sobre input y output (io)
import java.util.Scanner;
public class Ejercicio4leer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio=7, longitud;
		final double PI=3.1416;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH); //Solo si voy a leer decimales, para que acepte el . como separador
		System.out.println("Introduce el radio (usa . para los decimales):");
		radio=sc.nextDouble();
		
		longitud = 2 * PI * radio;
		
		System.out.println("La longitud de la circunferencia es: "+longitud+" cm");
	}

}
