package ejercicios;

import java.util.Scanner;

/**
 * Modifica la función que valida el DNI para que dé error si los primeros
 * caracteres no son dígitos usando NumberFormatException.
 * */

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String dni;
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		
		System.out.println("Introduce dni: ");
		dni=sc.nextLine();
		try {
			int num=Integer.parseInt(dni.substring(0,8));
			
			int resto=num%23;
			
			char letra=letras.charAt(resto);
			
			if(letra==dni.charAt(8))
				System.out.println("DNI correcto");
			else
				System.out.println("DNI incorrecto");
		
		}catch(NumberFormatException e) {
			System.out.println("Formato incorrecto, espera digito");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Formato incorrecto");
		}

	}

}
