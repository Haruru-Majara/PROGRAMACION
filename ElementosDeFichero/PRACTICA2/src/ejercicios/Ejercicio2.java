package ejercicios;

/**
 * Programa que lee dos números, calculando y escribiendo el valor de la suma, la
 * resta, el producto, y su módulo.
 * */

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double num1,num2,suma,resta,prodc,mod;
		
		
		System.out.println("Escribe el primer número: ");
		num1=sc.nextInt();
		System.out.println("Escribe el segundo número: ");
		num2=sc.nextInt();
		
		System.out.println(" ");
		System.out.println("---Vamos a mostrar todas sus operaciones---");
		System.out.println(" ");
		
		suma=num1+num2;
		resta=num1-num2;
		prodc=num1*num2;
		mod=num1%num2;
		
		System.out.println("La suma de "+num1+" + "+num2+" es: "+suma);
		System.out.println("La resta de "+num1+" - "+num2+" es: "+resta);
		System.out.println("El producto de "+num1+" * "+num2+" es: "+prodc);
		System.out.println("El módulo de "+num1+" % "+num2+" es: "+mod);
	}

}
