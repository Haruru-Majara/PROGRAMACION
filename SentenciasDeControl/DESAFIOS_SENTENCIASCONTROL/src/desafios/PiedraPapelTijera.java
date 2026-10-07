package desafios;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		
		int opcH;
		int opcM = random.nextInt(4);
		
		System.out.println("----------MENÚ----------");
		System.out.println("Vamos a jugar a Piedra, Papel, Tijera, Lagarto, Spock");
		System.out.println(" ");
		System.out.println("Tendremos en cuenta que: ");
		System.out.println(" ");
		System.out.println(" *Elecciones iguales -> Empate"
				+ "\n *Tijeras gana a Papel y Lagarto"
				+ "\n *Papel gana a Piedra y Spock"
				+ "\n *Piedra gana a Tijeras y Lagarto"
				+ "\n *Lagarto gana a Papel y Spock"
				+ "\n *Spock gana a Piedra y Tijeras");
		System.out.println(" ");
		System.out.println("Teniendo esto en cuenta, ¿qué eliges?: ");
		System.out.println("0.Piedra");
		System.out.println("1.Papel");
		System.out.println("2.Tijeras");
		System.out.println("3.Lagarto");
		System.out.println("4.Spock");
		System.out.println(" ");
		opcH=sc.nextInt();
		
		if(opcH<0 || opcH>4)
			System.out.println("Error en elección");
		else {
			System.out.println("Tú has elegido: "+opcH);
			System.out.println("La máquina ha elegido: "+opcM);
			if(opcH==opcM)
				System.out.println("EMPATEEE!!!");
			else {
				switch(opcH) {
				case 0:
					if(opcM==2 || opcM==3)
						System.out.println("HAS GANADO!");
					else 
						System.out.println("GANA LA MÁQUINA :(");
					break;
				case 1:
					if(opcM==0 || opcM==4)
						System.out.println("HAS GANADO!");
					else 
						System.out.println("GANA LA MÁQUINA :(");
					break;
				case 2:
					if(opcM==1 || opcM==3)
						System.out.println("HAS GANADO!");
					else 
						System.out.println("GANA LA MÁQUINA :(");
					break;
				case 3:
					if(opcM==1 || opcM==4)
						System.out.println("HAS GANADO!");
					else 
						System.out.println("GANA LA MÁQUINA :(");
					break;
				case 4:
					if(opcM==0 || opcM==2)
						System.out.println("HAS GANADO!");
					else 
						System.out.println("GANA LA MÁQUINA :(");
					break;
				}
			}
		
		}
		
	}

}
