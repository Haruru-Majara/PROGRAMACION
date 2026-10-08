package desafios;

import java.util.Random;

/**
 * 1. Tres personas lanzan cada uno una moneda. Gana la tirada
 * el jugador que tenga la moneda diferente.

2. Jugar una partida de 5 tiradas.
 * */
public class JuegoDisparejo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		
		int mon1,mon2,mon3,cont1=0,cont2=0,cont3=0;
		
		System.out.println("**********VAMOS A JUGAR AL JUEGO DE LA MONEDA**********");
		System.out.println(" ");
		System.out.println("CONSTA DE 5 RONDAS Y QUIEN SAQUE MÁS VECES LA MONEDA DIFERENTE GANA!");
		for(int i=1;i<=5;i++) {
			System.out.println(" ");
			System.out.println("-----Tirada "+i+"-----");
			//Se hacen las tiradas
			mon1=r.nextInt(2);
			mon2=r.nextInt(2);
			mon3=r.nextInt(2);
			System.out.println("Jugador 1: "+mon1);
			System.out.println("Jugador 2: "+mon2);
			System.out.println("Jugador 3: "+mon3);
			System.out.println(" ");
			
			if(mon1==mon2 && mon1==mon3)
				System.out.println("Empate");
			else {
				if(mon1!=mon2 && mon1!=mon3) {
					cont1++;
					System.out.println("Ronda ganada por Jugador 1");
				}
				else
					if(mon2!=mon1 && mon2!=mon3) {
						cont2++;
						System.out.println("Ronda ganada por Jugador 2");
					}
					else {
						cont3++;
						System.out.println("Ronda ganada por Jugador 3");
					}
			}
		}
		System.out.println(" ");
		System.out.println("Contador Jugador 1: "+cont1);
		System.out.println("Contador Jugador 2: "+cont2);
		System.out.println("Contador Jugador 3: "+cont3);
		System.out.println(" ");
		if(cont1>cont2 && cont1>cont3)
			System.out.println("Jugador 1 es el ganador con "+cont1+" puntos.");
		else
			if(cont2>cont1 && cont2>cont3)
				System.out.println("Jugador 2 es el ganador con "+cont2+" puntos.");
			else
				System.out.println("Jugador 3 es el ganador con "+cont3+" puntos.");
	}

}
