package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Repetir el ejemplo del "simulador de calculadora" para poder realizar todas las operaciones que el usuario quiera.
 * */

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		int opc;
		double num1,num2,suma,resta,multi,division,resto;
		
		do {
			System.out.println("");
			System.out.println("----CALCULADORA----");
			System.out.println("");
			System.out.println("¿Qué operación quieres realizar?");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Resto");
			System.out.println("6.Salir");
			opc=sc.nextInt();
			
			if(opc<=0 || opc >6)
				System.out.println("No existe esta opción, inténtalo de nuevo.");
			if(opc==6)
				break;
			
			System.out.println("Ahora necesitamos dos números: ");
			System.out.println("Primer número: ");
			num1=sc.nextDouble();
			System.out.println("Segundo número: ");
			num2=sc.nextDouble();
			
			switch(opc) {
			case 1:
				suma=num1+num2;
				System.out.println(num1+" + "+num2+" = "+suma);
				break;
			case 2:
				resta=num1-num2;
				System.out.println(num1+" - "+num2+" = "+resta);
				break;
			case 3:
				multi=num1*num2;
				System.out.println(num1+" * "+num2+" = "+multi);
				break;
			case 4:
				division=num1/num2;
				System.out.println(num1+" / "+num2+" = "+division);
				break;
			case 5:
				resto=num1%num2;
				System.out.println(num1+" % "+num2+" = "+resto);
				break;
			}
		}while(opc!=6);
		
		System.out.println("Fin del programa.");
	}

}
