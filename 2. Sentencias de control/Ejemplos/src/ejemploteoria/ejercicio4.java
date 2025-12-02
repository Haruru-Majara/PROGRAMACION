package ejemploteoria;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe una numero: ");
		numero1=sc.nextInt();
		
		System.out.println("Escribe una numero: ");
		numero2=sc.nextInt();
		
		if (numero1 == numero2)
			System.out.println("Los números son iguales");
		else
			System.out.println("Los números son distintos");
	}

}
