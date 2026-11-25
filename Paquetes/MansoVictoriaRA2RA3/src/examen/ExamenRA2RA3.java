package examen;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Examen realizado por: Victoria Manso
 * */

public class ExamenRA2RA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		LocalTime ahora=LocalTime.now();
		
		String fechaNac,patinete,carnetSocio;
		double precio,impTotal=0;
		int edad,hora,minuto,personasSocias=0,nClientes=1;
		int patSup=r.nextInt(4)+1;
		int patBas=r.nextInt(4)+1;
		char otroModelo=' ';
		boolean carnetCorrecto,horaCorrecta=false;
		LocalTime horaDevolver=null;
		LocalTime horaMaxima=LocalTime.of(23, 00);
		
		
		System.out.println("UNIDADES DISPONIBLES MODELO SUPER: "+patSup);
		System.out.println("UNIDADES DISPONIBLES MODELO BASICO: "+patBas);
		System.out.println("");
		
		do {
			System.out.println("");
			System.out.println("----Cliente "+nClientes+" Bienvenid@----");
			do {
				System.out.println("Anota tu fecha de nacimiento con patron dd/mm/yyy: ");
				fechaNac=sc.nextLine();
				
				edad=validarFechaNac(fechaNac);
				
				System.out.println("Edad: "+edad);
				
				if(edad==-1)
					System.out.println("Fecha de nacimiento incorrecta.");
				if(edad>=0 && edad<16)
					System.out.println("No se permite el alquiler a menores.");
			}while(edad<16);
			
		
			
			do {
				System.out.println("Que patinete quieres alquilar: super o basico");
				patinete=sc.nextLine();
				
				if(!patinete.equalsIgnoreCase("super") && !patinete.equalsIgnoreCase("basico"))
					System.out.println("Error, intentelo de nuevo.");
				
				if(patinete.equalsIgnoreCase("super")) {
					if(patSup==0) {
						System.out.println("No hay modelos disponibles de SUPER, ¿quieres del otro modelo? (S/N)");
						otroModelo=Character.toUpperCase(sc.nextLine().charAt(0));
						if(otroModelo=='S') {
							if(patBas==0) {
								System.out.println("Lo sentimos, no hay modelos disponibles actualmente.");
							}else {
								System.out.println("Se ha alquilado el modelo Basico");
								patBas--;
							}
						}else {
							if(otroModelo=='N')
								break;
						}
							
					}else {
						System.out.println("Se ha alquilado el modelo Super.");
						patSup--;
					}
				}else {
					if(patinete.equalsIgnoreCase("basico")) {
						if(patBas==0) {
							System.out.println("No hay modelos disponibles de BASICO, ¿quieres del otro modelo? (S/N)");
							otroModelo=Character.toUpperCase(sc.nextLine().charAt(0));
							if(otroModelo=='S') {
								if(patSup==0) {
									System.out.println("Lo sentimos, no hay modelos disponibles actualmente.");
								}else {
									System.out.println("Se ha alquilado el modelo Super.");
									patSup--;
								}
							}else {
								if(otroModelo=='N')
									break;
							}
								
						}else {
							System.out.println("Se ha alquilado el modelo Basico");
							patBas--;
						}
					}
				}
			}while(!patinete.equalsIgnoreCase("super") && !patinete.equalsIgnoreCase("basico"));
			
			do {
				if(otroModelo=='N')
					break;
				do {
					
					try {
						System.out.println("Hora a la que devuelves el patinete: ");
						System.out.println("Hora: ");
						hora=sc.nextInt();
						System.out.println("Minuto: ");
						minuto=sc.nextInt();
					
						horaDevolver=LocalTime.of(hora, minuto);
						
						if(horaDevolver.isBefore(horaMaxima)) {
							System.out.println("La hora marcada de la devolución es: "+horaDevolver);
							horaCorrecta=true;
						}
						else
							System.out.println("La hora se excede del tiempo pautado.");
					}catch(InputMismatchException e) {
						sc.nextLine();
						System.out.println("Se esperaba un número...");
					}catch(DateTimeException e) {
						System.out.println("Hora incorrecta.");
					}
				}while(horaCorrecta==false);
		
				sc.nextLine();
			
				System.out.println("Anota el carnet de socio (3 letras, un - y 1 o 2 numeros):");
				carnetSocio=sc.nextLine();
				
				carnetCorrecto=validarCarnet(carnetSocio);
				
				if(!carnetCorrecto)
					System.out.println("El carnet no es correcto.");
				else
					System.out.println("Carnet correcto.");
				
				precio=calcularPrecioAlquiler(horaDevolver,patinete,carnetSocio);
				
				System.out.println("El precio a pagar es: "+precio+" euros.");
				
				if(carnetCorrecto && patinete.equalsIgnoreCase("super"))
					personasSocias++;
				
				impTotal=impTotal+precio;
				precio=0;
				nClientes++;
			}while(otroModelo=='S');
			otroModelo=' ';
			horaCorrecta=false;
	}while(patSup>0 || patBas>0);
		
	System.out.println("Importe total recaudado: "+impTotal);
	System.out.println("Clientes socios que escogieron patinete super: "+personasSocias);
		
}
	public static int validarFechaNac(String fecha) {
		LocalDate fechaHoy=LocalDate.now();
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Period period;
		int edad;
			
		try {
			LocalDate fechaNac=LocalDate.parse(fecha,patron);
			
			if(fechaNac.isBefore(fechaHoy)) {
				period=Period.between(fechaNac,fechaHoy);
				edad=period.getYears();
				return edad;
			}
			return -1;
		}catch(DateTimeParseException e) {
			return -1;
		}
	}
	
	public static boolean validarCarnet(String carnet) {
		 return carnet.matches("^[A-Za-z]{3}-[0-9]{1,2}$");
	}
	
	public static double calcularPrecioAlquiler(LocalTime hDevolver,String modelo,String carnet) {
		LocalTime ahora=LocalTime.now();
		long horas;
		long minutosSobrantes;
		long minutos=ChronoUnit.MINUTES.between(ahora,hDevolver);
		double precio;
		boolean carnetCorrecto;
		
		double descuento=Double.parseDouble(carnet.substring(4));
		carnetCorrecto=validarCarnet(carnet);
		
		horas=minutos/60;
		minutosSobrantes=minutos%60;
		
		if(modelo.equalsIgnoreCase("super")) {
			if(minutosSobrantes>0) {
				horas++;
				precio=8*horas;			
			}else
				precio=8*horas;
		}else {
			if(minutosSobrantes>0) {
				horas++;
				precio=5*horas;			
			}else
				precio=5*horas;
		}
		
		if(carnetCorrecto)
			precio=precio-precio*descuento/100;
		else {
			if(!carnetCorrecto && horas>3)
				precio=precio*0.90;
		}
		
		return precio;
	}
}
