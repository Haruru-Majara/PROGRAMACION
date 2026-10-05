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
		System.out.println("2.Tijera");
		System.out.println("3.Lagarto");
		System.out.println("4.Spock");
		System.out.println(" ");
		opcH=sc.nextInt();
		
		if(opcH<0 || opcH>4) 
			System.out.println("Error en el número");
		else {
			System.out.println("Tu elección: "+opcH);
			System.out.println("Elección de la máquina: "+opcM);
			
			if(opcH==opcM) 
				System.out.println("EMPATE!!!");
			else {
				
			}
				
		}
		
	}

}
