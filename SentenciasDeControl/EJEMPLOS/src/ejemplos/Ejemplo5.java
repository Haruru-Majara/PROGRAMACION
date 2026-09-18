package ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		int a,b;
		
		System.out.println("Introduce primer número: ");
		a=sc.nextInt();
		System.out.println("Introduce segundo número: ");
		b=sc.nextInt();
		
		if(a==b) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos.");
		}
	}

}
