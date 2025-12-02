package ejemploteoria;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe una nota: ");
		nota=sc.nextInt();
		
		if (nota < 5)
			System.out.println("La nota está suspensa");
		else
			System.out.println("La nota está aprobada");
	}

}
