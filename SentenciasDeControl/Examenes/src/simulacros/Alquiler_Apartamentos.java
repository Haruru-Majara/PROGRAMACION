package simulacros;

import java.util.Scanner;

public class Alquiler_Apartamentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int planta, dias;
		char puerta, garaje;
		double precio;

		System.out.println("¿Quiéres garaje? (S/N");
		garaje = sc.nextLine().charAt(0);

		if (garaje == 'S' || garaje == 'N') {//pregunto garaje
			if (garaje == 'S')
				precio = 100;
			else
				precio = 75;

			System.out.println("¿Qué planta quieres?"); //pregunto planta
			planta = sc.nextInt();

			if (planta >= 3 && planta <= 5)
				precio = precio + 5;
			else {
				if (planta == 6) {
					precio = precio + 7;
					sc.nextLine();
					System.out.println("¿Que puerta tienes?(a,b,c,d)"); //pregunto puerta
					puerta = sc.nextLine().charAt(0);
					if (puerta == 'A' || puerta == 'B')
						precio = precio + 5;
				} else {
					if (planta >= 7 && planta <= 9) {
						precio = precio + 7;
					} else {
						if (planta == 10) {
							precio = precio + 10;
						}
					}

				} 

			}// fin de plantas
			
			System.out.println("¿Duántos días?");
			dias=sc.nextInt();
			if(dias>=15) {
				precio=precio-precio*0.25;
			}else {
				if(dias>=7 && garaje=='S') {
					precio=precio-precio*0.20;
				}else {
					
				}
			}
		} else
			System.out.println("Dato erróneo.");
	}

}
