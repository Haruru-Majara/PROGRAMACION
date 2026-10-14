package ejercicios;

import java.util.Scanner;

/**
 * Leer números de teclado hasta que la suma de todos ellos sea mayor a 100, y decir si se ha
 * anotado algún cero.
 * */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num,total=0,cont0=0;
		
		while(total<=100) {
			System.out.println("Introduce un número: ");
			num=sc.nextInt();
			total=total+num;
			if(num==0)
				cont0++;
			System.out.println("Total: "+total);
		}
		System.out.println("Se han anotado "+cont0+" cero/s.");
		System.out.println("Fin del programa");
	}

}
