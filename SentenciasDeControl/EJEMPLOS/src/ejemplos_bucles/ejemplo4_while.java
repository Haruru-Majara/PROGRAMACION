package ejemplos_bucles;

import java.util.Scanner;

public class ejemplo4_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num,par;
		
		System.out.println("Anota un número: ");
		num=sc.nextInt();
		
		if(num<=2) {
			System.out.println("Número error, tiene que ser mayor que 2");
		}else {
			System.out.println("Los pares menores o iguales que "+num+" son: ");
			par=2;
			while(par<=num) {
				System.out.println(par);
				par=par+2;
			}
		}
	}

}
