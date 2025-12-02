package Hoja6;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sala, entradas, contEntradas = 0, entradasS1 = 0, entradasS2 = 0, entradasTotales = 0, salaGanadora = 0;
		boolean correcto;

		Scanner sc = new Scanner(System.in);

		System.out.println("¿A qué sala vas? \nSala 1 \nSala 2");
		sala = sc.nextInt();

		while (sala != 0) {
			correcto = true;
			System.out.println("Número de entradas que vas a comprar: ");
			entradas = sc.nextInt();
			if (sala == 1)
				entradasS1 = entradasS1 + entradas;

			else if (sala == 2)
				entradasS2 = entradasS2 + entradas;
			else {
				System.out.println("ERROR. Sala incorrecta.");
				correcto = false;
			}

			if (correcto) {
				if (entradas > 10)
					contEntradas++;

				if (entradasS1 > entradasS2)
					salaGanadora = 1;
				else
					salaGanadora = 2;

				entradasTotales = entradasS1 + entradasS2;
			}

			System.out.println("¿A qué sala vas? \nSala 1 \nSala 2");
			sala = sc.nextInt();

		}

		System.out.println("Número total de entradas vendidas: " + entradasTotales);
		System.out.println("La sala que ha vendido más entradas ha sido la: " + salaGanadora);
		System.out.println("Ha habido " + contEntradas + " personas que han comprado más de 10 entradas.");
	}

}
