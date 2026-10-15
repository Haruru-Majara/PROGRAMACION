package ejercicios;

import java.util.Scanner;

/**
 * Calcular el precio de la entrada a un parque de atracciones teniendo en cuenta lo siguiente:
 * Hay dos tarifas, reducida 16 euros (para menores de 7 años y mayores de 65) y normal 25
 * euros (para el resto). Todos los mayores de 18 años pueden sacar además ticket para ver la
 * actuación de un grupo de teatro con un coste adicional de 3 euros.
 * Para realizar el programa mostrar un menú con las opciones:
 * 
 * Comprar entrada: leer la edad de la persona y en el caso de que sea mayor de
 * edad preguntar si desea ver el teatro
 * 
 * Cerrar taquilla:se muestra el importe total recaudado y se acaba el programa
 * */

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int opc,edad;
		double precio=0,total=0;
		char teatro=' ';
		
		do {
			System.out.println(" ");
			System.out.println("----MENÚ PARQUE DE ATRACCIONES----");
			System.out.println("1.Comprar entrada.");
			System.out.println("2.Cerrar taquilla.");
			opc=sc.nextInt();
			
			while(opc!=1 && opc!=2) {
				System.out.println("Error. Introduzca la opción de nuevo.");
				System.out.println(" ");
				System.out.println("----MENÚ PARQUE DE ATRACCIONES----");
				System.out.println("1.Comprar entrada.");
				System.out.println("2.Cerrar taquilla.");
				opc=sc.nextInt();
			}
			
			if(opc==1) {
				System.out.println("Introducir edad: ");
				edad=sc.nextInt();
				while(edad<0) {
					System.out.println("Edad no válida. Introducir de nuevo: ");
					edad=sc.nextInt();
				}
				sc.nextLine();
				if(edad>=18) {
					System.out.println("Ver espectáculo de teatro: (s/n)");
					teatro=sc.nextLine().charAt(0);
				}
				while(teatro!='s' && teatro!='n') {
					System.out.println("Error en el dato, repitalo de nuevo:");
					teatro=sc.nextLine().charAt(0);
				}
					
				if(edad<7 || edad>65)
					precio=16;
				else
					precio=25;
					
				if(teatro=='s' && edad>=18)
					precio=precio+3;
				
				System.out.println("Su entrada le costará: "+precio);
				total=total+precio;
			}
			
		}while(opc!=2);
		
		System.out.println("Total recaudado: "+total);
	}

}
