package EjerciciosHoja2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1, nota2, nota3,media;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce la primera nota (si es un número decimal, usa . para separar:");
		nota1=sc.nextDouble();
		System.out.println("Introduce la segunda nota (si es un número decimal, usa . para separar:");
		nota2=sc.nextDouble();
		System.out.println("Introduce la tercera nota (si es un número decimal, usa . para separar:");
		nota3=sc.nextDouble();
		
		media=(nota1+nota2+nota3)/3;
		
		System.out.println("La media de las notas dadas es de: "+media);
	}

}
