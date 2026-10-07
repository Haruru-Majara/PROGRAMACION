package ejemplos_bucles;

import java.util.Scanner;

public class ejemplo3_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num;
		
		System.out.println("Anota un número: ");
		num=sc.nextInt();
		
		while(num<=2) {
			System.out.println("No es mayor que 2");
			System.out.println("Anota un número: ");
			num=sc.nextInt();
		}
		
		System.out.println("Fin del programa.");
	}

}
