package ejercicios;

import java.util.Scanner;

/**
 * Se desea conocer el luckynumber de cualquier persona. El número de la suerte se consigue
 * reduciendo la fecha de nacimiento a un número de un solo dígito.
 * 
 * 16/08/1973->16+8+1973=1997->1+9+9+7=26->2+6=8
 * */

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numFinal,dia,mes,año,acumulador=0,resto,lucky=0;
		char otra;
		
		do {
			System.out.println("Dime tu fecha de cumpleaños: ");
			System.out.println("Mes: ");
			mes=sc.nextInt();
		
			while(mes<1 || mes>12) {
				System.out.println("Mes incorrecto, introduzca de nuevo el dato: ");
				mes=sc.nextInt();
			}
			
			System.out.println("Día: ");
			dia=sc.nextInt();
			System.out.println("Año: ");
			año=sc.nextInt();
			
			switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				while(dia<1 || dia>31) {
					System.out.println("Día incorrecto,introduzca de nuevo el dato: ");
					dia=sc.nextInt();
				}
				break;
			case 2:
				if((año%4==0 && año%100==0 && año%400!=0) || año%4!=0) {
					while(dia<1 && dia>28) {
						System.out.println("Día incorrecto,introduzca de nuevo el dato: ");
						dia=sc.nextInt();
					}
				}else {
					while(dia<1 || dia>29) {
						System.out.println("Día incorrecto,introduzca de nuevo el dato: ");
						dia=sc.nextInt();
					}
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				while(dia<1 || dia>30) {
					System.out.println("Día incorrecto,introduzca de nuevo el dato: ");
					dia=sc.nextInt();
				}
				break;
			}
			
			System.out.println("Tu fecha es "+dia+"/"+mes+"/"+año);
			
			lucky=dia+mes+año;
			
			do {
				for(int i=lucky;i>0;i=i/10) {
					//System.out.println(i);
					resto=i%10;
					acumulador=acumulador+resto;
					//System.out.println(acumulador);
				}
				lucky=acumulador;
				acumulador=0;
			}while(lucky>=10);
			
			
			System.out.println("Tu luckynumber es: "+lucky);
		
				
			sc.nextLine();
			System.out.println(" ");
			System.out.println("¿Quieres probar con otra fecha?");
			otra=sc.nextLine().charAt(0);
			
			while(otra!='s' && otra!='n') {
				System.out.println("Error, introduzca de nuevo el dato.");
				otra=sc.nextLine().charAt(0);
			}
		}while(otra=='s');
		System.out.println(" ");
		System.out.println("Fin del programa.");
	}

}
