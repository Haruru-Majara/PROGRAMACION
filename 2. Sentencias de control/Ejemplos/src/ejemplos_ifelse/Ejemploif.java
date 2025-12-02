package ejemplos_ifelse;

import java.util.Scanner;

public class Ejemploif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* OPERADORES RELACIONALES
		 * <   - MENOR
		 * <=  - MENOR O IGUAL
		 * >   - MAYOR
		 * >=  - MAYOR O IGUAL
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
		}
		else {
			System.out.println("El número es negativo");
			System.out.println("El número es menor o igual a 0");
		}
		
		if (numero==0)
			System.out.println("El número es 0");
		
		System.out.println("Fin del programa");
	}

}
