package ejemplos;

import java.util.Scanner;

public class ejemploexamenrepaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Ejercicio: Alquiler de apartamento con descuento y cálculo del día de salida

Una empresa alquila apartamentos. El precio base por día depende de si el apartamento tiene piscina:

Con piscina: 120 euros/día

Sin piscina: 80 euros/día

Según la planta, se añade un suplemento:

Planta 1 o 2: sin suplemento

Planta 3 a 5: suplemento de 6 euros/día

Planta 6 a 8: suplemento de 8 euros/día

Planta 9 o 10: suplemento de 12 euros/día

Si el apartamento está en la planta 6 y la puerta es A o B, se añade un suplemento extra de 4 euros/día.

Los descuentos son:

Si la estancia es 14 días o más, 30% de descuento.

Si la estancia es entre 7 y 13 días y tiene piscina, 20% de descuento.

En otro caso, 10% de descuento.

Se debe pedir al usuario:

Si el apartamento tiene piscina (true/false)

Planta (1 a 10)

Puerta (A, B, C, D) si la planta es 6

Número de días que se queda (mínimo 1)

Día de entrada (L, M, X, J, V, S, D)

El programa debe calcular y mostrar:

Precio total con descuentos

Día de salida (usando un switch y cálculo con módulo 7)
 * */
		
		int dias, suplemento, planta;
		double precio;
		char puerta, diaEntrada;
		boolean piscina, correcto=true;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Tu apartamento tiene piscina? (true/false)");
		piscina=sc.nextBoolean();
		
		if (piscina)
			precio=120;
		else
			precio=80;
		
		System.out.println("En que planta te alojas: ");
		planta=sc.nextInt();
		if (correcto) {
			switch (planta) {
			case 1:
			case 2:
				break;
			case 3:
			case 4:
			case 5:
				suplemento=6;
				break;
			case 6:
			case 7:
			case 8:
				suplemento=8;
				break;
			case 9:
			case 10:
				suplemento=12;
				break;
			default:
				System.out.println("Apartamente incorrecto.");
				correcto=false;
			}
		}
		if (planta == 6)
			System.out.println("¿Que letra es tu apartamento? (A, B, C o D)");
			planta=sc.nextLine().charAt(0);
			switch 
	}

}
