package ejemplos_bucles;

import java.util.Scanner;

public class ejemplowhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número:");
		num=sc.nextInt();
		
		while (num<=2) {
			System.out.println("Número incorrecto, vuelve a anotarlo");
			num=sc.nextInt();
		}
		System.out.println("Número leído correcto: "+num);
	}

}
