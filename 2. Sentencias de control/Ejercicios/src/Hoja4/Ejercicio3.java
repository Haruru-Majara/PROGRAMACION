package Hoja4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;
		char orden;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe el primer número:");
		n1=sc.nextInt();
		System.out.println("Escribe el segundo número:");
		n2=sc.nextInt();
		System.out.println("Escribe el tercer número:");
		n3=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Elige entre A/a para ver los numeros de forma ascendente o D/d para descendente.");
		orden=sc.nextLine().charAt(0);
		
		switch (orden) {
		
		case 'a':
		case 'A':
			if (n1 <= n2 && n1 <= n3 && n2 <= n3)
				System.out.println("El orden ascendente es: "+n1+"-"+n2+"-"+n3);
			else
				if (n1 <= n2 && n1 <= n3 && n3 <= n2)
					System.out.println("El orden ascendente es: "+n1+"-"+n3+"-"+n2);
				else
					if (n2 <= n1 && n2 <= n3 && n1 <= n3)
						System.out.println("El orden ascendente es: "+n2+"-"+n1+"-"+n3);
					else
						if (n2 <= n1 && n2 <= n3 && n3 <= n1)
							System.out.println("El orden ascendente es: "+n2+"-"+n3+"-"+n1);
						else
							if (n3 <= n1 && n3 <= n2 && n1 <= n2)
								System.out.println("El orden ascendente es: "+n3+"-"+n1+"-"+n2);
							else
									System.out.println("El orden ascendente es: "+n3+"-"+n2+"-"+n1);						
		break;
			
		case 'd':
		case 'D':
			if (n1 >= n2 && n1 > n3 && n2 > n3)
				System.out.println("El orden descendente es: "+n1+"-"+n2+"-"+n3);
			else
				if (n1 > n2 && n1 > n3 && n3 > n2)
					System.out.println("El orden descendente es: "+n1+"-"+n3+"-"+n2);
				else
					if (n2 > n1 && n2 > n3 && n1 > n3)
						System.out.println("El orden descendente es: "+n2+"-"+n1+"-"+n3);
					else
						if (n2 > n1 && n2 > n3 && n3 > n1)
							System.out.println("El orden descendente es: "+n2+"-"+n3+"-"+n1);
						else
							if (n3 > n1 && n3 > n2 && n1 > n2)
								System.out.println("El orden descendente es: "+n3+"-"+n1+"-"+n2);
							else
								if (n3 > n1 && n3 > n2 && n2 > n1)
									System.out.println("El orden descendente es: "+n3+"-"+n2+"-"+n1);
		break;
		}

	}
}