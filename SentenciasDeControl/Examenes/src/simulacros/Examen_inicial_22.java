package simulacros;

import java.util.Scanner;

/**
 * Se quiere calcular el precio de un billete del ave.
 * 
 * El destino del ave puede ser 1 ó 2, si se anota otro destino se muestra un
 * error y finaliza el programa . El precio inicial por ir a 1 es de 75 euros y
 * 40 euros por ir a 2. (3 ptos)
 * 
 * Los descuentos que se aplican son los siguientes: (3 ptos)
 * 
 * Familia numerosa: 20% Infantil (Menor de 14 años): 50% Juvenil (entre 14 y 18
 * años): 20% Jubilado (más de 65 años): 30%
 * 
 * Los descuentos no son acumulables, siempre se aplica el descuento más
 * ventajoso para el cliente.
 * 
 * Se puede llevar hasta 20 kilogramos de equipaje sin abonar nada, cada
 * kilogramo extra se paga a 2,5 euros. (2 ptos)
 * 
 * Realizar un programa en java que lea de teclado los datos necesarios y
 * muestre el precio final del billete.
 * 
 * Nos dan además la hora y minutos de salida y la hora y minutos de llegada,
 * calculad el tiempo transcurrido en horas y minutos. (2 ptos)
 * 
 * Ejemplo: Hora de salida 10:40, hora de llegada 13:25 , el tiempo transcurrido
 * será de 2:45
 */

public class Examen_inicial_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int destino, edad, descuentoE, descuentoFa, descuentoFin, horaSal, horaLleg, minSal, minLleg,horaF,minF,diferencia;
		char familia;
		double precioBase=0, precioFinal, equipaje;

		System.out.println("--------Vamos a calcular el precio de tu billete---------");
		System.out.println(" ");

		System.out.println("¿Qué destino eliges?(1 o 2)");
		destino = sc.nextInt();

		// eleccion destino
		if (destino != 1 && destino != 2) {
			System.out.println("ERROR. Destino no válido");
			System.exit(0);
		} else {
			if (destino == 1) {
				precioBase = 75;
			} else {
				precioBase = 40;
			}
		}

		System.out.println("¿Qué edad tienes?");
		edad = sc.nextInt();

		// eleccion edad
		if (edad < 14) {
			descuentoE = 50;
		} else {
			if (edad <= 18) {
				descuentoE = 20;
			} else {
				if (edad > 65) {
					descuentoE = 30;
				} else {
					descuentoE = 0;
				}
			}
		}
		
		sc.nextLine();
		System.out.println("¿Eres familia numerosa?(s/n)");
		familia = sc.nextLine().charAt(0);

		// eleccion familia numerosa
		if (familia == 's' || familia == 'S') {
			descuentoFa = 20;
		} else {
			descuentoFa = 0;
		}

		// qué descuento elegir según convenga
		if (descuentoE > descuentoFa) {
			descuentoFin = descuentoE;
		} else {
			if (descuentoE < descuentoFa) {
				descuentoFin = descuentoFa;
			} else {
				descuentoFin = descuentoE;
			}
		}

		System.out.println("¿Cuánto equipaje llevas?(Kg)");
		equipaje = sc.nextInt();
		
		if (equipaje > 20) {
			equipaje = (equipaje - 20)* 2.5;
		}else {
			equipaje=0;
		}
		
		precioFinal = precioBase - precioBase * descuentoFin / 100 + equipaje;
		
		System.out.println(" ");
		System.out.println("-------Pagarás por el vuelo: "+precioFinal+"€");
		System.out.println(" ");
		System.out.println("¿A qué hora sale tu vuelo?");
		horaSal = sc.nextInt();
		System.out.println("¿A qué minuto sale tu vuelo?");
		minSal = sc.nextInt();
		System.out.println("¿A qué hora llega tu vuelo?");
		horaLleg = sc.nextInt();
		System.out.println("¿A qué minuto llega tu vuelo?");
		minLleg = sc.nextInt();
		System.out.println(" ");
		System.out.println("Hora de salida de vuelo: " + horaSal + ":" + minSal);
		System.out.println("Hora de llegada de vuelo: " + horaLleg + ":" + minLleg);
		
		horaSal=horaSal*60+minSal;
		horaLleg=horaLleg*60+minLleg;
		
		diferencia=horaLleg-horaSal;
		
		horaF=diferencia/60;
		minF=diferencia%60;
		
		
		System.out.println(" ");
		System.out.println("-------El vuelo dura: " + horaF + ":" + minF+" horas");

	}
}
