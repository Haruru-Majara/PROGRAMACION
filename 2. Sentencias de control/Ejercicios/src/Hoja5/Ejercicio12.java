package Hoja5;

import java.util.Random;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota, alumno=0, aprobado=0;
		
		do {
			Random r=new Random();
			nota=r.nextInt(11);
			System.out.println(nota);
			
			alumno=alumno+1;
				if (nota >=5)
					aprobado=aprobado+1;
			
		}while (alumno <30);
		
		System.out.println("El número de alumnos con aprobado es: "+aprobado);
	}

}
