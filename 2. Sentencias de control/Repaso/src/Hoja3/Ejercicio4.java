package Hoja3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2=sc.nextInt();
		System.out.println("Introduce el tercer número: ");
		num3=sc.nextInt();
		
		if (num1 == num2 || num1 == num3 || num2 == num3)
			System.out.println("ERROR. Alguno de los números se repite.");
		else
			if (num1 > num2 && num1 > num3 && num2 > num3)
				System.out.println("El número "+num1+" es el mayor, luego "+num2+" y luego "+num3);
			else
				if (num1 > num2 && num1 > num3 && num2 < num3)
					System.out.println("El número "+num1+" es el mayor, luego "+num3+" y luego "+num2);
				else
					if (num2 > num1 && num2 > num3 && num1 > num3)
						System.out.println("El número "+num2+" es el mayor, luego "+num1+" y luego "+num3);
					else
						if (num2 > num1 && num2 > num3 && num1 < num3)
							System.out.println("El número "+num2+" es el mayor, luego "+num3+" y luego "+num1);
						else
							if (num3 > num1 && num3 > num2 && num1 > num2)
								System.out.println("El número "+num3+" es el mayor, luego "+num1+" y luego "+num2);
							else
								System.out.println("El número "+num3+" es el mayor, luego "+num2+" y luego "+num1);
						
					
	}

}
