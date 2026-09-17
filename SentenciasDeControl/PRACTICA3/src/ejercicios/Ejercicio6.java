package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * En un determinado comercio se realiza un descuento dependiendo del precio de
 * cada producto. Si el precio es inferior a 6 euros, no se hace descuento; si
 * es mayor o igual que 6 euros y menor que 60 euros, se hace un 5% de
 * descuento, y si es mayor o igual que 60euros, se hace un 10 % de descuento.
 * Programa que lee el precio de un producto y nos calcula y escribe su precio
 * final.
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		double pIni, pFin;
		int descuento;

		System.out.println("----Bienvenido a nuestra tienda----");
		System.out.println(" ");
		System.out.println("¿Cuánto cuesta el producto elegido?");
		pIni = sc.nextDouble();

		System.out.println("");

		if (pIni <= 0) {
			System.out.println("El precio introducido no es válido");
		} else {
			if (pIni < 6) {
				pFin = pIni;
				System.out.println("El precio final de tu producto es de: " + pFin + "€");
			} else {
				if (pIni >= 6 && pIni < 60) {
					pFin = pIni - (pIni * 5 / 100);
					System.out.println("El precio final de tu producto es de: " + pFin + "€");
				} else {
					pFin = pIni - (pIni * 10 / 100);
					System.out.println("El precio final de tu producto es de: " + pFin + "€");
				}
			}
		}
		
	}

}
