package Hoja5;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el número de la tabla de multiplicar que quieras ver: ");
		num=sc.nextInt();
		while (num <0 || num>10) {
			System.out.println("Número incorrecto. ");
				}
		System.out.println("Tabla del "+num);
		for (int i=0 ; i<=10 ; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
			}
		}
	}


