package ejemplosarrays;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[]=new int[10]; // new int crea las celdas/ el arrays y como es un 
		//arrays de enteros mete 0 en cada celda, empiezan a contar en la posicion 0
		//podemos saber el tamaño del arrays con length
		int num, cont=0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 números:");

		for (int i = 0; i < numeros.length; i++) { //aqui por ejemplo se mira la longitud
			//lo mas sencillo para recorrer un arrays es un for
			System.out.println("numeros " + i + ":");
			numeros[i] = sc.nextInt();
		}

		System.out.println("Ahora anota otro número:");
		num=sc.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i]==num)
				cont++;
		}
		//esto cuenta cuantas veces el numero que me ha metido el usuario a aparecido
		
		System.out.println("El número "+num+" aparece "+cont+" veces");
		
	}

}
