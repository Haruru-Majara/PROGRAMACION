package ejemplos_ifelse;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Introduce un número: ");
		num = sc.nextInt();

		if (num == 0) {
			System.out.println("Es cero");
		} else {
			if (num > 0) {
				System.out.println("Es positivo");
			} else {
				System.out.println("Es negativo");
			}
		}
	}

}
