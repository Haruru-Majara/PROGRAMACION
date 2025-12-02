package ejemplos_ifelse;

import java.util.Scanner;

public class Ejemploif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* OPERADORES RELACIONALES
		 * <   - MENOR
		 * <=  - MENOR O IGUAL
		 * >   - MAYOR
		 * >=  - MAYOUR O IGUAL
		 * !   - DIFERENTE
		 * ==  - IGUAL
		 * */
		
		int numero;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número:");
		numero=sc.nextInt();
		
		if (numero > 0) {
			System.out.println("El número es positivo");
			System.out.println("El número es mayor de 0");
			if (numero > 100)
				System.out.println("Es mayor de 100");
			
		}
		else {
			if (numero < 0)
				System.out.println("El número es negativo");
			else
				System.out.println("El número es igual a 0");
		}
		
		System.out.println("Fin del programa");
	}

}
