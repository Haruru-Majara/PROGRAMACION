package ejemplos_switch;

import java.util.Scanner;

public class ejemploswitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un número del 0 al 4:");
		num=sc.nextInt();
		
		switch (num) {
		case 0:
			System.out.println("No hay establecido un valor definido para el tipo de bomba.");
			break;
		case 1:
			System.out.println("La bomba es una bomba de agua.");
			break;
		case 2:
			System.out.println("La bomba es una bomba de gasolina.");
			break;
		case 3:
			System.out.println("La bomba es una bomba de hormigón.");
			break;
		case 4:
			System.out.println("La bomba es una bomba de pasta alimenticia.");
			break;
		default:
			System.out.println("No existe un valor válido para tipo de bomba.");
		}
	}

}
