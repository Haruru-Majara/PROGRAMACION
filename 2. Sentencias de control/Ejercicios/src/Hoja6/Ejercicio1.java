package Hoja6;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  contador=1;
		char letra=' ',letraPrimera=' ';
		Random r=new Random();
		/*
		for (int i=1;i<=50;i++) {
		
			letra=(char)(r.nextInt(26)+97);
			System.out.println(letra);
		
			if (i==1)
				letraPrimera=letra;
			else
			
				if (letra==letraPrimera)
					contador++;
				
		}
		*/
		
		letra=(char)(r.nextInt(26)+97); // esto es que has convertido un int a un char, y luego al numero 97 que es la letra a minuscula en el sistema ascii, le vamos a decir que queremos un rango de 26 letras que son las que van hasta la z
		System.out.println(letra);
		letraPrimera=letra;
		
		for (int i=2;i<=50;i++) {
			
			letra=(char)(r.nextInt(26)+97);
			System.out.println(letra);
		
				
			if (letra==letraPrimera)
					contador++;
				
		}
		
		
		System.out.println("El número de veces que se repite la primera letra es: "+contador);
	}

}
