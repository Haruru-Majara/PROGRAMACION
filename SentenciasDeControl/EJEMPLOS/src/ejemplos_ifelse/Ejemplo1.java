package ejemplos_ifelse;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		double nota;

		System.out.println("Introduce la nota: ");
		nota = sc.nextDouble();

		if (nota >= 5) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Suspenso");
			System.out.println("Recuperamos la próxima semana");
		}
	}

}
