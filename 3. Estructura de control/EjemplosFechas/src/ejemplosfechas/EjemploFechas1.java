package ejemplosfechas;

import java.time.*;

public class EjemploFechas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha de hoy:"+fechaActual);
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora actual:"+horaActual);
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println("Fecha y hora actual:"+ahora);

		// Crear fechas y horas
	
		try{
			
			LocalDate fechaNacimiento=LocalDate.of(2023, 2, 29); 
			System.out.println("Fecha nacimiento:"+fechaNacimiento); 
			
		}catch(DateTimeException e){
			System.out.println("Fecha incorrecta");
			System.out.println("Ha saltado la excepción: "+e.getMessage()); //Información sobre el error que se ha producido
		}
		try{
			LocalTime horaRecreo=LocalTime.of(11, 25, 0); 
			System.out.println("Salimos al recreo a las " + horaRecreo); 
		}catch(DateTimeException e){
			System.out.println("Hora incorrecta");
		}
		try{
			LocalDateTime heNacido=LocalDateTime.of(1999, 3, 28,20, 40); 
			System.out.println("Momento exacto de mi nacimiento: "+ heNacido);
		}catch(DateTimeException e){
			System.out.println("Fecha incorrecta");
		}
	}

}
