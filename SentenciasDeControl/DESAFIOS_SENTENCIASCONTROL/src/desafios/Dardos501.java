package desafios;

import java.util.Random;

/**
 * Implementar un programa que simule una partida de dardos al juego 501 entre 2 jugadores.
 * 
 * El objetivo del juego es simple ... cada jugador empieza con la misma puntuación (501) y el primero en
 * llegar a cero gana. Los jugadores se turnan y lanzan tres dardos. Se restan todos los puntos anotados 
 * en cada turno.
 * 
 * Para ganar, un jugador debe llegar a cero antes que su oponente, pero también
 * debe llegar de forma exacta. Si se "pasa" la puntuación obtenida en ese turno se ignora.
 * 
 * Ejemplo: si a un jugador le quedan 18 puntos:
 * 
 * Primera tirada 8, segunda tirada 10 -> Gana!
 * Primera tirada 20 -> Se pasa, pierde turno y sigue con 18 puntos.
 * Primera tirada 9 doble ->Gana!
 * 
 * Para no hacer el juego eterno el máximo número de turnos será 20.
 * Ganará el que cierre a 0 puntos o el que menor puntuación tenga al final de los 20 turnos.
 * 
 * La salida debe mostrar las tiradas en cada turno de cada jugador, las
 * puntuaciones restantes y quien es el ganador.
 * */

public class Dardos501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		Random t=new Random();
		
		int jugador1=501,jugador2=501,turno=1;
		int tirada=0,multiplicar,contTirada1=0,contTirada2=0;
		
		for(int i=turno;i<=20;i++) {
			System.out.println(" ");
			System.out.println("---TURNO "+i+"---");
			System.out.println(" ");
			System.out.println("*Jugador 1*");
			for(int j1=0;j1<=2;j1++) {
				if(jugador1>0) {
					multiplicar=t.nextInt(3);
					if(multiplicar==0)
						tirada=r.nextInt(21);
					if(multiplicar==1)
						tirada=r.nextInt(41);
					if(multiplicar==2)
						tirada=r.nextInt(61);
					
					if(jugador1>tirada)
						jugador1=jugador1-tirada;
					else {
						if(jugador1==0)
							System.out.println("JUGADOR 1 HA GANADO!");
					}
						
				}
				
				contTirada1++;
				System.out.println("Tirada "+contTirada1+": "+tirada);
			}
			

			System.out.println(" ");
			System.out.println("*Jugador 2*");
			for(int j2=0;j2<=2;j2++) {
				if(jugador2>0) {
					multiplicar=t.nextInt(3);
					if(multiplicar==0)
						tirada=r.nextInt(21);
					if(multiplicar==1)
						tirada=r.nextInt(41);
					if(multiplicar==2)
						tirada=r.nextInt(61);
						
					if(jugador2>tirada)
						jugador2=jugador2-tirada;
					else {
						if(jugador2==0)
							System.out.println("JUGADOR 2 HA GANADO!");
					}
							
				}
				
			contTirada2++;
			System.out.println("Tirada "+contTirada2+": "+tirada);
				
		}
			System.out.println(" ");
			System.out.println("Puntuación Jugador 1: "+jugador1);
			System.out.println("Puntuación Jugador 2: "+jugador2);
		}
		System.out.println(" ");
		if(jugador1==jugador2)
			System.out.println("AMBOS JUGADORES HAN EMPATADO!!!");
		else
			if(jugador1<jugador2)
				System.out.println("GANA JUGADOR 1!!!");
			else
				System.out.println("GANA JUGADOR 2!!!");
	}

}
