package Ejercicios_Fechas;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ejercicio8 {

	public static void main(String[] args) {
		//Simular durante 1 segundo el lanzamiento de un dado, pasado ese tiempo mostrar la cantidad de seises que han salido
		
		Random random = new Random();
		
		int resultado=0;
		int seis=0;
		
		final long DURACION_MS = TimeUnit.SECONDS.toMillis(1);
		long tiempoFin= System.currentTimeMillis() + DURACION_MS;
		while(System.currentTimeMillis()< tiempoFin) {
			resultado = random.nextInt(6)+1;
			if(resultado==6) {
				seis++;
			}
		}
		
		System.out.println("El número de seises totales obtenidos es de: "+seis);
	}

}
