package Hoja6;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia, mes, año, lucky;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el día de tu nacimiento: ");
		dia=sc.nextInt();
		System.out.println("Introduce el mes de tu nacimiento: ");
		mes=sc.nextInt();
		System.out.println("Introduce el año de tu nacimiento: ");
		año=sc.nextInt();
		
		System.out.println("La fecha de tu nacimiento es: "+dia+"/"+mes+"/"+año);
		
		lucky=averiguarLucky(dia,mes,año);
		
		System.out.println("Tú número de la suerte es: "+lucky);
	}
	public static int averiguarLucky (int dia, int mes, int año) {
		int acumulador=0, numero=0, lucky=0, numerosL=0;
		int suma=dia+mes+año;
		while (suma >0) {
		acumulador=suma%10;
		suma=suma/10;
		numero=numero+acumulador;
		
		}
		suma=numero;
		while(suma > 0) {
			lucky=suma%10;
			suma=suma/10;
			numerosL=numerosL+lucky;
			
		}
		suma=numerosL;
		return suma;
	}
}
