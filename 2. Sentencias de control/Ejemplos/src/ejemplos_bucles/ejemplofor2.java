package ejemplos_bucles;

import java.util.Scanner;

public class ejemplofor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		//System.out.println("Introduce número para ver su tabla de multiplicar: ");
		//num=sc.nextInt();
		
		for (num = 0; num <= 10; num++) {
			System.out.println("Tabla del "+num);
			for (int m=0 ; m<=10 ; m++)
			System.out.println(num+" * "+m+" = "+num*m);
		}
	}

}
