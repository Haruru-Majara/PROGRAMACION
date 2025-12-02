package Hoja4;

import java.util.Scanner;
/*
 * AYUDA DE MUCHA UTILIDAD PARA LOS AÑOS BISIESTOS
 * SI el año se divide entre 4
    Y NO se divide entre 100 → Bisiesto
    O SI se divide entre 400 → Bisiesto
	SINO → NO es bisiesto
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia, mes, año;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un día: ");
		dia=sc.nextInt();
		System.out.println("Escribe un mes: ");
		mes=sc.nextInt();
		System.out.println("Escribe un año: ");
		año=sc.nextInt();
		if (año<0)
			System.out.println("No se permiten años negativos.");
		else
		
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia < 1 || dia > 31)
				System.out.println("Día incorrecto");
			else 
				if ( mes < 12 && dia == 31) {
					mes=mes+1;
					dia=1;
					System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
				}
				else
					if (mes == 12 && dia ==31) {
						año=año+1;
						mes=1;
						dia=1;
						System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
					}
				else
					if (mes < 12 && dia < 31) {
						dia=dia+1;
						System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
					}
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia < 1 || dia > 30 )
				System.out.println("Día incorrecto");
			else 
				if (dia!=30)
					dia=dia+1;
				else {
					dia=1;
					mes=mes+1;
				}
		break;
		// SI SE DIVIDE ENTRE 4 Y DA 0 PERO NO ENTRE 100 Y NO ENTRE 400 ES BISIESTO - SI SE DIVIDE ENTRE 4 Y DA 0 Y ENTRE 100 Y DA 0 PERO NO ENTRE 400 NO ES BISIESTO
		// SI SE DIVIDE ENTRE 4 Y DA 0 Y ENTRE 100 Y DA 0 Y ENTRE 400 Y DA 0 ENTONCES SI ES BISIESTO - SI NO SE DIVIDE ENTRE 4 NO ES BISIESTO
		case 2:
			if (año % 4 !=0 || (año % 100 !=0 || año % 400 != 0)) { 
				System.out.println("El año no bisiesto, febrero tiene 28 días.");
				if (dia < 1 || dia > 28)
					System.out.println("Día incorrecto");
				else
					if ( dia == 28) {
						mes=mes+1;
						dia=1;
						System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
					}
					else
							dia=dia+1;
							System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
						}
			else 
				if (dia<1 || dia>29)
					System.out.println("Día incorrecto");
				else
					if( dia == 29) {
						dia=1;
						mes=mes+1;
						System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
					}
					else {
						dia=dia+1;
						System.out.println("La fecha es: "+dia+"/"+mes+"/"+año);
					}
				
			}
			break;
		default:
			System.out.println("Mes incorrecto.");
	}
		}
	}


