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
		char otro=' ',extranjero=' ';
		String cadena="";
		
		
		do {
			do {
				System.out.println("-----OPCIONES PARA VALIDAR-----");
				System.out.println("1.Una matrícula");
				System.out.println("2.Un NIE o NIF");
				System.out.println("3.Un codigo postal, empezando por 28.");
				System.out.println("4.Un número de telefono");
				System.out.println("5.Un codigo de usuario, de 5 a 10 caracteres, empezando por una letra.");
				System.out.println(" ");
				System.out.println("Elige opción: ");
				opc=sc.nextInt();
				
				if(opc<1 || opc>5)
					System.out.println("Opción incorrecta, elija otra.");
				
				System.out.println(" ");
			}while(opc<1 || opc>5);
			
			sc.nextLine();
			
			switch(opc) {
			case 1:
				System.out.println("Introduce matrícula: ");
				cadena=sc.nextLine();
				break;
			case 2:
				do {
					System.out.println("¿Eres Extranjero?(S/N)");
					extranjero=Character.toUpperCase(sc.nextLine().charAt(0));
				
					if(extranjero!='S' && extranjero!='N')
						System.out.println("Error en el valor introducido, inténtelo de nuevo.");
							
				}while(extranjero!='S' && extranjero!='N');
				
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
			
			if(validarAlgo(opc,cadena,extranjero)==true)
				System.out.println("Cadena introducida correcta.");
			else
				System.out.println("Cadena introducida incorrecta.");
			
			System.out.println("");
			System.out.println("¿Quieres comprobar otra cosa?");
			otro=Character.toUpperCase(sc.nextLine().charAt(0));
			
		}while(otro=='S');
	}
	public static boolean validarAlgo(int opc, String cad,char ex) {
		String patron;
		String letras;
		
		switch(opc) {
		case 1:
			patron="^[0-9]{4}[^0-9a-zñAEIOUÑ]{3}$";
			if(cad.matches(patron))
				return true;
			return false;
		case 2:
			if(ex=='S') {
				patron="^[XYZxyz][0-9]{7}[A-Za-z]$";
				if(cad.matches(patron))
					return true;
				return false;
			}else {
				letras="TRWAGMYFPDXBNJZSQVHLCKE";
				patron ="^[0-9]{8}[A-Za-z]$";
				
				if(!cad.matches(patron))
					return false;
				else {
					int num=Integer.parseInt(cad.substring(0, 8)); //pasada una cadena la transforma en numero
					//System.out.println(num);
					int resto=num%23;
					//System.out.println(resto);
					char letra=letras.charAt(resto);
					if(letra==Character.toUpperCase(cad.charAt(8)))
						return true;
					else
						return false;
				}
			}
		case 3:
			patron="^28[0-9]{3}$";
			if(cad.matches(patron))
				return true;
			return false;
		case 4:
			patron="^[679][0-9]{8}$";
			if(cad.matches(patron))
				return true;
			return false;
		case 5:
			patron="^[A-Za-z][0-9A-Za-z]{4,9}$";
			if(cad.matches(patron))
				return true;
			return false;
		}
		return false;
		
	}
}
