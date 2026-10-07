package ejemplos_bucles;

import java.util.Scanner;

public class ejemplo2_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce número: ");
		numero=sc.nextInt();
		
		while(numero<=10) {
			System.out.println(numero);
			numero++;
		}
		System.out.println("Fin del programa.");
	}

}
