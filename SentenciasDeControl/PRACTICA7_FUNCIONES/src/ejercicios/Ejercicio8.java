package ejercicios;

import java.util.Scanner;

/**
 * Variar el ejercicio del lucky number para que el programa solicite tantas fechas
de nacimiento como quiera el usuario. Utilizar una función para calcularlo
 * */

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int d,m,a,luckyNumber;
		char seguir;
		boolean fechaCorrecta;
		do {
			do {
				System.out.println("Introduce día: ");
				d=sc.nextInt();
				System.out.println("Introduce mes: ");
				m=sc.nextInt();
				System.out.println("Introduce año: ");
				a=sc.nextInt();
				
				fechaCorrecta=validarFecha(d,m,a);
				
				if(fechaCorrecta==false)
					System.out.println("Fecha incorrecta.");
				
				System.out.println(" ");
			}while(fechaCorrecta==false);
			
			System.out.println("Tu fecha es: "+d+"/"+m+"/"+a);
			
			luckyNumber=sacarLucky(d,m,a);
			
			System.out.println("TU LUCKY NUMBER ES: "+luckyNumber);
			
			sc.nextLine();
			System.out.println(" ");
			System.out.println("¿Quieres probar con otra fecha?");
			seguir=Character.toUpperCase(sc.nextLine().charAt(0));
			System.out.println(" ");
		}while(seguir=='S');
	}
	public static boolean validarFecha(int d, int m, int a) {
		boolean bisiesto;
		if (a >= 1000) {
			if (m <= 12) {
				switch (m) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (d <= 31)
						return true;
					else
						return false;
				case 4:
				case 6:
				case 9:
				case 11:
					if (d <= 30)
						return true;
					else
						return false;
				case 2:
					if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
						bisiesto = true;
					else
						bisiesto = false;

					if (bisiesto == false) {
						if (d <= 28)
							return true;
						else
							return false;
					} else {
						if (d <= 29)
							return true;
						else
							return false;
					}
				default:
					return false;
				}
			} else
				return false;
		} else
			return false;
	}
public static int sacarLucky(int d,int m, int a) {
	int lucky=d+m+a,acum=0,resto;
	do {
		while(lucky>0) {
			resto=lucky%10;
			lucky=lucky/10;
			acum=acum+resto;
		}
	lucky=acum;
	acum=0;
	}while(lucky>=10);
	return lucky;
}
}
