package examenes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

/**
 * Se quiere calcular el precio de un abono teatro de un usuario.
 * 
Se piden los siguientes datos del usuario mientras sean incorrectos.

- Fecha de nacimiento, leedla en un String con 4 dígitos para el año. Validad
que es correcta utilizado excepciones. Mostrad la edad. (3 pto)

- Tipo de abono, un String que puede tomar los siguientes valores:
“Normal”, “Familiar”, “VIP” ignorando mayúsculas y minúsculas. (1 pto).
- Nombre de usuario que tiene que empezar por letra (en mayúscula o
minúscula) y contener dígitos y letras en mayúsculas o minúsculas. En
total con una longitud de 5 a 8. Usad patrón (1 pto).

Si los datos son correctos llamad a una función que calcule el importe. Los abonos
normales son 10 euros, los VIP 50, los familiares 30. Si el usuario es jubilado (65 años
o más) tiene un descuento del 20% y si es menor de 18 del 10%.

Si el cálculo del importe es correcto, generar una contraseña de longitud 7 que tenga
los dos primeros caracteres del tipo de abono en mayúsculas y a continuación 5
dígitos aleatorios. Mostrad la contraseña por pantalla (2 ptos)
 * */

public class AbonoTeatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		String fechaNac,abono,usuario,contraseña;
		LocalDate fechaCorrecta,fechaHoy;
		int edad=0,alea;
		boolean abonoCorrecto,usuarioCorrecto;
		double importe;
		
		//Anoto y valido fecha introducida por un String, al meterla en la funcion la saco como LocalDate
		do {
				System.out.println("Anota tu fecha de nacimiento (dd/MM/yyyy): ");
				fechaNac=sc.nextLine();
				
				fechaCorrecta=validarFechaNac(fechaNac);
				
				if(fechaCorrecta==null)
					System.out.println("Fecha incorrecta.");
				else {
					fechaHoy=LocalDate.now();
					Period period=Period.between(fechaCorrecta,fechaHoy);
					edad=period.getYears();
					System.out.println("Edad: "+edad+" años");
				}
					
		}while(fechaCorrecta==null);
		
		//Anoto y valido tipo de abono
		do {
			System.out.println("Anota tipo de abono (Normal,Familiar o VIP):");
			abono=sc.nextLine().toUpperCase();
			
			abonoCorrecto=validarAbono(abono);
			
			if(!abonoCorrecto)
				System.out.println("Tipo de abono incorrecto.");
		}while(!abonoCorrecto);
		
		//Anoto y valido nombre de usuario con matches
		do {
			System.out.println("Introduce tu nombre de usuario entre 5 y 8 caracteres: ");
			usuario=sc.nextLine();
			
			usuarioCorrecto=validarUsuario(usuario);
			
			if(!usuarioCorrecto)
				System.out.println("Usuario introducido incorrecto.");
			
		}while(!usuarioCorrecto);
		
		importe=calcularImporte(edad,abono);
		
		System.out.println("");
		System.out.println("El importe del abono es: "+importe);
		System.out.println("Vamos a generarte una contraseña...");
		
		contraseña=abono.substring(0, 2);
		
		for(int i=0;i<5;i++) {
			alea=r.nextInt(0,10); //numero aleatorio entre 0 y 9
			contraseña=contraseña+alea;
		}
		
		System.out.println("Tu contraseña es: "+contraseña);
	}
	public static LocalDate validarFechaNac(String fecha) {
		LocalDate fechaHoy=LocalDate.now();
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			LocalDate fechaNac=LocalDate.parse(fecha,patron);
			
			if(fechaNac.isBefore(fechaHoy))
				return fechaNac;
			return null;
		}catch(DateTimeParseException e) {
			return null;
		}
	}
	
	public static boolean validarAbono(String abono) {
		return (!abono.equalsIgnoreCase("NORMAL") || !abono.equalsIgnoreCase("FAMILIAR") || !abono.equalsIgnoreCase("VIP"));
				
	}
	
	public static boolean validarUsuario(String usu) {
		return usu.matches("^[A-Za-z][A-Za-z0-9]{5,7}");
	}
	
	public static double calcularImporte(int e,String a) {
		double importeFinal,precioAbono=0;
		
		switch(a) {
		case "NORMAL":
			precioAbono=10;
		case "FAMILIAR":
			precioAbono=30;
		case "VIP":
			precioAbono=50;
		}
		
		if(e>=65)
			importeFinal=precioAbono*0.8;
		else
			if(e<18)
				importeFinal=precioAbono*0.9;
			else
				importeFinal=precioAbono;
		
		return importeFinal;
	}
}
