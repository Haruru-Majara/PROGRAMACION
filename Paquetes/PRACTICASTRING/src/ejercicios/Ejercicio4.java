package ejercicios;

import java.util.Scanner;

/**
 * Programa que valida un DNI introducido por teclado. Utilizar una función para
 * validarlo
 * */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String dni;
		char otro;
		
		do {
		System.out.println("Introduce dni: ");
		dni=sc.nextLine();
		
		if(validarDNI(dni))
			System.out.println("DNI correcto");
		else
			System.out.println("DNI incorrecto");
		
		System.out.println("");
		System.out.println("¿Quieres probar con otro DNI?(S/N)");
		otro=Character.toUpperCase(sc.nextLine().charAt(0));
		
		}while(otro=='S');
		
	}
		public static boolean validarDNI(String dni) {
			String letras="TRWAGMYFPDXBNJZSQVHLCKE";
			String patron ="^[0-9]{8}[A-Za-z]";
			
			if(!dni.matches(patron))
				return false;
			else {
				int num=Integer.parseInt(dni.substring(0, 8)); //pasada una cadena la transforma en numero
				//System.out.println(num);
				int resto=num%23;
				//System.out.println(resto);
				char letra=letras.charAt(resto);
				if(letra==dni.charAt(8))
					return true;
				else
					return false;
			}
		}
		
	

}
