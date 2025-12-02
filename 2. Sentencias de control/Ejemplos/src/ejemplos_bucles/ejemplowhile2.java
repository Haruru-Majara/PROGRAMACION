package ejemplos_bucles;

import java.util.Scanner;

public class ejemplowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, par=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número:");
		num=sc.nextInt();
		
		while (num<=2) {
			System.out.println("Número incorrecto, vuelve a anotarlo");
			num=sc.nextInt();
		}
		System.out.println("Número leído correcto: "+num);
		
		while (par<=num) {
			System.out.println(par);
			par+=2;
			//par=par+2;
			
					
		}
	}

}
