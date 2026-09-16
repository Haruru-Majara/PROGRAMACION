package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double num1,num2,num3;
		
		System.out.println("Dame el primer número: ");
		num1=sc.nextDouble();
		System.out.println("Dame el segundo número: ");
		num2=sc.nextDouble();
		System.out.println("Dame el tercer número: ");
		num3=sc.nextDouble();
		
		while(num1==num2 || num1==num3 || num2==num3 ) {
			
			System.out.println("----Tienen que ser diferentes los 3 números----");
			System.out.println(" ");
			System.out.println("Primer número: ");
			num1=sc.nextDouble();
			System.out.println("Segundo número: ");
			num2=sc.nextDouble();
			System.out.println("Tercer número: ");
			num3=sc.nextDouble();
			
		}
			
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" "+num2+" "+num3);
			System.out.println("El mayor es: "+num1);
		}else {
			if(num2>num1 && num2>num3) {
				System.out.println(num1+" "+num2+" "+num3);
				System.out.println("El mayor es: "+num2);
			}else {
				System.out.println(num1+" "+num2+" "+num3);
				System.out.println("El mayor es: "+num3);
			}
		}
	}

}
