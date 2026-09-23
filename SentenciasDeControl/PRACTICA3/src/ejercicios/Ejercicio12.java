package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que lee una nota numérica y escribe la correspondiente calificación

5 .......... SUFICIENTE
 * */

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		int nota;
		
		System.out.println("¿Qué nota quieres saber? (0-10)");
		nota=sc.nextInt();
		
		if(nota>=0 && nota<5) {
			System.out.println(nota+".........INSUFICIENTE");
		}else {
			if(nota==5) {
				System.out.println(nota+".........SUFICIENTE");
			}else {
				if(nota==6) {
					System.out.println(nota+".........BIEN");
				}else {
					if(nota>=7 && nota<=8) {
						System.out.println(nota+".........NOTABLE");
					}else{
						if(nota>=9 && nota<=10) {
							System.out.println(nota+".........SOBRESALIENTE");
						}else {
							System.out.println("No se puede evaluar esta nota");
						}
					}
				}
			}
		}
	}

}
