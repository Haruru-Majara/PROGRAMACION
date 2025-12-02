package ejbasicos;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=7.5;
		double b=9.24;
		// o tambien podríamos hacer: int a,b; porque son del mismo tipo
		double sumaTotal;
		char letra='S'; /* los caracteres de letras van entre comillas simples ATENCION!!!!*/
		boolean correcto=false; /* solo puede ser verdadero o falso es decir, true o false. no admite letras mayusculas*/
		// a=10;
		// tambien se puede hacer asi a=7
		// tambien se puede hacer asi b=9
		sumaTotal=a+b;
		System.out.println("La suma es:"+sumaTotal);
		System.out.println("El caracter es:"+letra);
		System.out.println("La variable correcto tiene el siguiente valor:"+correcto);
		// hay palabras que no se pueden usar, hay una lista de ellas ej:long ya que esta es un tipo de numero entero
		char letrita = 'V';
		int codigoAscii = letrita;
		System.out.println("El código Ascii de:"+ letrita +" es:"+codigoAscii);
	}

}
