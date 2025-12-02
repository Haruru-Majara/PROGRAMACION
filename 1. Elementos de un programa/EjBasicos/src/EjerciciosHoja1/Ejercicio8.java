package EjerciciosHoja1;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t=4000;
		
		long segundos=t%60;
		long minutos=t/60;
		long horas=minutos/60;
		minutos=minutos%60;
		
		System.out.println("Tenemos estos segundos: "+t+" que se tranforman en estos segundos:"+segundos+" minutos: "+minutos+" y horas: "+horas);
	}

}
