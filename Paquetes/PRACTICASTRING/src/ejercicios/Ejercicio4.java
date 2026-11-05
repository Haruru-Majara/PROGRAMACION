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
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		
		String patron ="^[0-9]{8}[A-Za-z]";
		
		System.out.println("Introduce dni: ");
		dni=sc.nextLine();
		
		if(!dni.matches(patron))
			System.out.println("DNI formato incorrecto");
		else {
			int num=Integer.parseInt(dni.substring(0, 8)); //pasada una cadena la transforma en numero
			//System.out.println(num);
			int resto=num%23;
			//System.out.println(resto);
			char letra=letras.charAt(resto);
			if(letra==dni.charAt(8))
				System.out.println("Correcto");
			else
				System.out.println("Letra incorrecta");
		}
			
	}

}
