package EjerciciosHoja2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		numero1=sc.nextInt();
		
		System.out.println("Introduce otro número:");
		numero2=sc.nextInt();
		
		int suma=numero1+numero2;
		int resta=numero1-numero2;
		int producto=numero1/numero2;
		int resto=numero1%numero2;
		
		System.out.println("Estos son los resultados de los números escogidos:");
		System.out.println(numero1+" + "+numero2+" = "+suma);
		System.out.println(numero1+" - "+numero2+" = "+resta);
		System.out.println(numero1+" / "+numero2+" = "+producto);
		System.out.println(numero1+" % "+numero2+" = "+resto);
	}

}
