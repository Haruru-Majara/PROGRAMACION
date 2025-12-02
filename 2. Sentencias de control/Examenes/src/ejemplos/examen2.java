package ejemplos;

import java.util.Scanner;

public class examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias = 0, planta, dianum = 0, diaSalidaNum;
		double alquilerDia = 0, alquilerTotal = 0, suplemento = 0, alquilerDes;
		final int PDIACG=100, PDIASG=75;
		boolean garaje, correcto=true;
		char diaEntrada, diaSalida = ' ', puerta;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Tienes garaje junto con tu alquiler (true/false)?");
		garaje=sc.nextBoolean();
		
		if (garaje)
			alquilerDia=PDIACG;
		else 
			alquilerDia=PDIASG;
			
		System.out.println("¿En qué planta vives elige de la 1 a la 10: ?");
		planta=sc.nextInt();
		
		if (planta <0 || planta >10)
			System.out.println("Planta incorrecta");
		else {
		/* if (planta>3 && planta<=5)
		 * sysout -> planta incorrecta
		 *  else
		 * */	
		switch (planta) {
		case 1:
		case 2:
			break;
		case 3:
		case 4:
		case 5:
			suplemento=5;
			break;
		case 6:
			
		case 7:
		case 8:
		case 9:
			suplemento=7;
			break;
		case 10:
			suplemento=10;
			break;
		default:
			System.out.println("Planta incorrecta.");
			
		 }
		}
		sc.nextLine();
		
		if (planta == 6) {
			System.out.println("¿Cuál es tu puerta A, B, C o D?");
			puerta=sc.nextLine().charAt(0);
			
			switch (puerta) {
			case 'A':
			case 'B':
				suplemento=suplemento+5;
			break;
			case 'C':
			case 'D':
				//NO SE SUMA NADA
			break;
			default:
				System.out.println("Puerta incorrecta.");
				correcto=false;
			}
		}
		
		if (correcto == true) {
			System.out.println("¿Cuántos días te vas a quedar?");
			dias=sc.nextInt();
				
			if (dias < 1 )
				System.out.println("Dato de días incorrecto");
			else {
				alquilerTotal=(alquilerDia+suplemento)*dias;
				if (dias >=14) {
					//alquilerTotal=(alquilerDia+suplemento)*dias;
					alquilerDes=alquilerTotal*0.75;
					//System.out.println("Tu alquiler es de: "+alquilerDes+" euros");
				}
				else
					if (dias >=7 && garaje == true) {
						//alquilerTotal=(alquilerDia+suplemento)*dias;
						alquilerDes=alquilerTotal*0.80;
						//System.out.println("Tu alquiler es de: "+alquilerDes+" euros");
					}
					else {
						//alquilerTotal=(alquilerDia+suplemento)*dias;
						alquilerDes=alquilerTotal*0.85;
						//System.out.println("Tu alquiler es de: "+alquilerDes+" euros");
					}
				System.out.println("Tu alquiler es de: "+alquilerDes+" euros");
			}
		}
		sc.nextLine();
		
		System.out.println("¿Qué día vas a entrar L,M,X,J,V,S o D?");
		diaEntrada=sc.nextLine().charAt(0);
		
		switch (diaEntrada) {
		case 'L':
			dianum=0;
			
			break;
		case 'M':
			dianum=1;
			break;
		case 'X':
			dianum=2;
			break;
		case 'J':
			dianum=3;
			break;
		case 'V':
			dianum=4;
			break;
		case 'S':
			dianum=5;
			break;
		case 'D':
			dianum=6;
			break;
		default:
			System.out.println("Día de la semana incorrecto.");
			correcto=false;	
		}
		
		if (correcto) {
			diaSalidaNum=(dianum + dias) % 7; // sumas el numero de dias que te quedas al dia de entrada
			switch (diaSalidaNum) {
			case 0:
				diaSalida='L';
				
				break;
			case 1:
				diaSalida='M';
				
				break;
			case 2:
				diaSalida='X';
				
				break;
			case 3:
				diaSalida='J';
				break;
			case 4:
				diaSalida='V';
				break;
			case 5:
				diaSalida='S';
				break;
			case 6:
				diaSalida='D';
				break;
				}
			System.out.println("Dia de salida: "+diaSalida);
		}
	}
}
