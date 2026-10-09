package ejercicios;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

/**
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la
 * cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más
 * de 1.75.
 * */
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		//sc.useLocale(Locale.ENGLISH);
		
		int cont18=0,contAlt=0;
		
		for(int i=1;i<=5;i++) {
			System.out.println(" ");
			System.out.println("Edad y altura del alumno "+i+": ");
			
			int edad=r.nextInt(26);
			System.out.println("Edad: "+edad);
			
			//double alt=r.nextDouble(2.11);
			double alt=Math.round(Math.random() * 2.10 * 100)/100.0;
			
			/*System.out.println(alt);
			Esto es una clase que sirve para poder redondear a 2 decimales
			DecimalFormatSymbols de= new DecimalFormatSymbols(Locale.ENGLISH);
			DecimalFormat d=new DecimalFormat("#.00",de);
			System.out.println(d.format(alt));
			alt=Double.parseDouble(d.format(alt));
			*/
			System.out.println("Altura: "+alt);
			
			if(edad>18)
				cont18++;
			if(alt>1.75)
				contAlt++;
		}
		System.out.println(" ");
		System.out.println("Alumnos mayores de 18: "+cont18);
		System.out.println("Alumnos más altos de 1.75: "+contAlt);
	}

}
