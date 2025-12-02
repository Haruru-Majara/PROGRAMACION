package ejemploteoria;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario;
		int horas;
		final double NORMAL=15, EXTRA=22;
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce horas trabajadas: ");
		horas=sc.nextInt();
		
		if (horas <= 35) 
			salario=horas*NORMAL;
		else
			salario=35*NORMAL+(horas-35)*EXTRA;
			System.out.println("Vas a recibir "+salario+" euros");
	}

}
