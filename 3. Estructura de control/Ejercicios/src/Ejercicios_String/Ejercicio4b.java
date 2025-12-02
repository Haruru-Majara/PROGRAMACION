package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dni;

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el DNI:");
		dni=sc.nextLine();
	
		
		while(!validarDni(dni)) {
			System.out.println("DNI incorrecto.");
			
			System.out.println("Introduce de nuevo el DNI:");
			dni=sc.nextLine();
		}
		
		System.out.println("DNI correcto");
	}
	public static boolean validarDni(String dni) {
		String numerosDni = dni.substring(0,dni.length()-1);
		String patron = "^[0-9]{1,8}[A-Z]$";
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int numero,resultado;
		char letra;
		
		if (!dni.matches(patron))
			return false;
		
		numero=Integer.parseInt(numerosDni);
		
		resultado=numero%23;
		
		letra=dni.charAt(dni.length()-1); //coger el ultimo caracter de una cadena
		
		if (letras.charAt(resultado)!=letra)
			return false;
		
		return true;
	}
}
