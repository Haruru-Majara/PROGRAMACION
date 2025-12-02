package EjerciciosHoja2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double base, altura;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce la base del triángulo (si es un número decimal, usa . para separar:");
		base=sc.nextDouble();
		System.out.println("Introduce la altura del triángulo (si es un número decimal, usa . para separar:");
		altura=sc.nextDouble();
		
		double areaTriangulo=base*altura/2;
		
		System.out.println("El área del triángulo es: "+areaTriangulo);
	}

}
