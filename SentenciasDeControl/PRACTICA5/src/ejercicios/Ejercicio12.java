package ejercicios;

import java.util.Random;

/**
 * Programa que lee las notas en programación de esta clase y cuenta el no de
 * aprobados
 * */
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		
		int contAprob=0;
		
		for(int i=1;i<=27;i++) {
			System.out.println(" ");
			int nota=r.nextInt(11);
			System.out.println("Nota del alumno "+i+": "+nota);
			
			if(nota>=5)
				contAprob++;
		}
		System.out.println(" ");
		System.out.println("De los 27 alumnos en clase de Programación, han aprobado: "+contAprob);
	}

}
