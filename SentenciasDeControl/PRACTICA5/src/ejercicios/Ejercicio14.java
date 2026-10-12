package ejercicios;

/**
 * Programa que lee un número y escribe todos los pares anteriores a él
 * */
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Escribe un número: ");
		num=sc.nextInt();
		
		if(num%2!=0) {
			for(int i=num-1;i>=0;i=i-2) {
				System.out.println(i);
			}
		}else
			for(int i=num-2;i>=0;i=i-2) {
				System.out.println(i);
			}
	}

}
