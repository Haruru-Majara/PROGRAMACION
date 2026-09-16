package ejercicios;


/**
 * Programa que dadas dos variables a y b, intercambie sus valores
 * */

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=6,aux;
		
		System.out.println("Ahora mismo el valor de a es: "+a);
		System.out.println("Ahora mismo el valor de b es: "+b);
		
		System.out.println(" ");
		System.out.println("----Vamos a invertirlos----");
		System.out.println(" ");
		
		aux=a;
		a=b;
		b=aux;
		
		System.out.println("Ahora mismo el valor de a es: "+a);
		System.out.println("Ahora mismo el valor de b es: "+b);
	}

}
