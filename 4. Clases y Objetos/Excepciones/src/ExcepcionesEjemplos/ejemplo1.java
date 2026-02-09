package ExcepcionesEjemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int x=6,y=7,z;
		int suma,division;
		System.out.println("Introduce número: ");
		suma=x+y;
		try {
			z=entrada.nextInt();
			division=suma/z;
			System.out.println(division);
		}
		catch (InputMismatchException e) {
			System.out.println("ERROR, NO NÚMERO ENTERO");
		}
		/*catch(ArithmeticException e) {
			System.out.println("ERROR, DIVISIÓN POR CERO");
		}*/
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(suma);
		}
	}

}
