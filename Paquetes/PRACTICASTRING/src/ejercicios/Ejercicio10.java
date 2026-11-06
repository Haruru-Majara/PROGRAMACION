package ejercicios;

import java.util.Scanner;

/**
 * Utiliza el método matches para validar las siguientes cadenas:
 * 
 * a. Una matrícula
 * b. Un nif
 * c. Un código postal que empiece por 28.
 * d. Un número de teléfono que puede empezar por 6, 7 ó 9.
 * e. Un código de usuario que puede tener de 5 a 10 caracteres, tiene que empezar
 * por letra y tener después letras y números.
 * */

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int opc;
		char otro,extranjero;
		String cadena="";
		
		
		do {
			do {
				System.out.println("-----OPCIONES PARA VALIDAR-----");
				System.out.println("1.Una matrícula");
				System.out.println("2.Un NIE o NIF");
				System.out.println("3.Un codigo postal");
				System.out.println("4.Un número de telefono");
				System.out.println("5.Un codigo de usuario");
				opc=sc.nextInt();
			}while(opc<1 || opc>5);
			
			switch(opc) {
			case 1:
				System.out.println("Introduce matrícula: ");
				cadena=sc.nextLine();
				break;
			case 2:
				System.out.println("¿Eres Extranjero?(S/N)");
				extranjero=Character.toUpperCase(sc.nextLine().charAt(0));
				if(extranjero=='S') {
					System.out.println("Introduce NIE: ");
					cadena=sc.nextLine();
				}else {
					System.out.println("Introduce NIF:");
					cadena=sc.nextLine();
				}		
				break;
			case 3:
				System.out.println("Introduce código postal: ");
				cadena=sc.nextLine();
				break;
			case 4:
				System.out.println("Introduce número de telefono: ");
				cadena=sc.nextLine();
				break;
			case 5:
				System.out.println("Introduce código de usuario: ");
				cadena=sc.nextLine();
				break;
			}
			
			if(validarAlgo(opc,cadena)==true)
				System.out.println("Cadena introducida correcta.");
			else
				System.out.println("Cadena introducida incorrecta.");
			
		}while(otro=='S');
	}
	public static boolean validarAlgo(int opc, String cad,char ex) {
		String patron;
		
		switch(opc) {
		case 1:
			patron="[0-9]{4}[A-Z]{3}";
			if(cad==patron)
				return true;
			return false;
		case 2:
			if(ex=='S') {
				patron="[XYZ][0-9]{7}[A-Z]";
				if(cad==patron)
					return true;
				return false;
			}else {
				
			}
			break;
		case 3:
			
			
		}
	}
}
