package examenBucles21102026;

import java.util.Scanner;

/**
 * 
 * */

public class ejer3DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		char continuar;
		
		do {
			System.out.println("Di un número");
			num=sc.nextInt();
			
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					System.out.println(i);
			}
			sc.nextLine();
			System.out.println("Quieres otro?");
			continuar=sc.nextLine().charAt(0);

		
		}while(continuar=='s');
	}

}
