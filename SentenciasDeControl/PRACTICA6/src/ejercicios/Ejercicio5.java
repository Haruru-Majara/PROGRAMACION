package ejercicios;

import java.util.Scanner;

/**
 * En unos multicinesse están proyectando dos películas en dos salas distintas. Cada persona
 * que llega compra varias entradas para la misma película. Realizar un programa en el que se
 * anota por cada persona que llega a la taquilla el número de sala y el número de entradas
 * que compra para esa sala, el programa finaliza al anotar la sala 0. Mostrar el número total
 * de entradas vendidas y decir para que sala se han vendido más entradas. Decir además si
 * ha habido alguien que haya comprado más de 10 entradas.
 * */

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int sala,persona=1,entradas,entradasTotalesS1=0,entradasTotalesS2=0,entradas10=0,entradasTotales=0;
		
		do {
			System.out.println(" ");
			System.out.println("Cliente "+persona+": ");
			System.out.println("¿Qué película quiere ver?");
			System.out.println("1.La bella y la bestia");
			System.out.println("2.Crepúsculo");
			sala=sc.nextInt();
			
			while(sala>2 && sala<1) {
				System.out.println("Error en el dato de la película. Introducir otra vez: ");
				System.out.println("¿Qué película quiere ver?");
				System.out.println("1.La bella y la bestia");
				System.out.println("2.Crepúsculo");
				sala=sc.nextInt();
			}
			
			if(sala==0)
				break;
			
			System.out.println("¿Cuántas entradas quiere comprar?");
			entradas=sc.nextInt();
			
			while(entradas==0) {
				System.out.println("Error en el dato. Vuelva a introducirlo.");
				System.out.println("¿Cuántas entradas quiere comprar?");
				entradas=sc.nextInt();
			}
			
			if(sala==1)
				entradasTotalesS1=entradasTotalesS1+entradas;
			else
				entradasTotalesS2=entradasTotalesS2+entradas;
			
			if(entradas>10)
				entradas10++;
				
			entradasTotales=entradasTotalesS1+entradasTotalesS2;
			
			persona++;
			
		}while(sala!=0);
		
		System.out.println(" ");
		System.out.println("El número total de entradas vendidas para ambas salas es: "+entradasTotales);
		System.out.println(entradas10+" personas compraron más de 10 entradas.");
	}

}
