package simulacros;

import java.util.Scanner;

public class Examen_inicial_22_corregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int destino, edad, descuento = 0;
		boolean numerosa;
		double precio, equipaje;

		System.out.println("Elige destino");
		destino = sc.nextInt();

		if (destino == 1 || destino == 2) {
			if (destino == 1)
				precio = 75;
			else
				precio = 40;

			System.out.println("Introduce edad");
			edad = sc.nextInt();
			System.out.println("Eres familia numerosa: true/false");
			numerosa = sc.nextBoolean();

			if (edad < 14)
				descuento = 50;
			else if (edad > 65)
				descuento = 30;
			else if ((edad >= 14 && edad <= 18) || numerosa == true)
				descuento = 20;

			System.out.println("Equipaje que llevas");
			equipaje = sc.nextDouble();

			if (equipaje > 20)
				precio = precio - precio * descuento / 100 + (equipaje - 20) * 2.5;
			else
				precio = precio - precio * descuento / 100;
			System.out.println("El precio final es: " + precio);
		} else
			System.out.println("Error. No existe este destino.");

	}

}
