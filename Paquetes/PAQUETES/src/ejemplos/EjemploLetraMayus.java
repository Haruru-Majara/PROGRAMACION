package ejemplos;

import java.util.Scanner;

/**
 *4. La Reutilización (El "Don't Repeat Yourself")
Este ejercicio ayuda a ver la utilidad real de no copiar y pegar código.
• Ejercicio: El Formateador de Nombres. Imagina que tienes una lista de
nombres en minúsculas. Crea una función nombre_limpio(nombre,
apellido) que devuelva el nombre completo con las iniciales en mayúscula
y un saludo cordial.
o Entrada: "juan", "perez"
o Salida: "Hola, Juan Perez, bienvenido al sistema." 
 * */

public class EjemploLetraMayus{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String nombre, apellido;
		
		System.out.println("Dime tu nombre: ");
		nombre=sc.nextLine().toLowerCase();
		System.out.println("Dime tu apellido: ");
		apellido=sc.nextLine().toLowerCase();
		
		nombre_limpio(nombre,apellido);
	}
	public static void nombre_limpio(String n, String a) {
		String r;
		n=n.substring(0,1).toUpperCase()+n.substring(1,n.length());
		a=a.substring(0,1).toUpperCase()+a.substring(1,a.length());
		r="Hola, "+n+" "+a+", bienvenido al sistema.";
		System.out.println(r);
	}
}
