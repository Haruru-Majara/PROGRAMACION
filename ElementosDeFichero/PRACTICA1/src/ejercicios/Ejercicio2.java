package ejercicios;

/**
 * Programa en el que declaramos una variable entera con valor nuestra edad y
 * escribimos la siguiente salida:
 * MI EDAD: aparecerá el valor
 * MI EDAD EL PRÓXIMO ANYO: aparecerá el correspondiente valor
 * */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int miEdad=29;
		
		System.out.println("MI EDAD: "+miEdad);
		System.out.println("MI EDAD EL PRÓXIMO AÑO: "+(++miEdad));
	}

}
