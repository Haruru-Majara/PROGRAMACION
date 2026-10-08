package ejercicios;

/**
 * Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir
 * pidiendo números indicando “mayor” o “menor” según sea mayor o menor con
 * respecto a N. El proceso termina cuando el usuario acierta.
 * */
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int aleatorio,N,intentos=1;
		
		aleatorio=r.nextInt(10); //número al azar entre 0 y 9
		
		System.out.println("Di un número: ");
		N=sc.nextInt();
		
		while(N!=aleatorio) {
			if(aleatorio>N) 
				System.out.println("El número que buscas es mayor");
			else
				System.out.println("El número que buscas es menor");
			intentos++;
			System.out.println("Di otro número: ");
			N=sc.nextInt();
		}
		
		System.out.println("ENHORABUENA HAS ACERTADO, EL NÚMERO ERA: "+aleatorio);
		System.out.println("SE HAN NECESITADO "+intentos+" INTENTOS.");
	}

}
