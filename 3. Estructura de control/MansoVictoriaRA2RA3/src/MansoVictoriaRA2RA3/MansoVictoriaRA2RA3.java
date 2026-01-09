// VICTORIA MANSO PINEDA
package MansoVictoriaRA2RA3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MansoVictoriaRA2RA3 {

	static Scanner sc; // No se muy bien cuando se usa esto, pero he visto que en algunos ejercicios lo
						// hemos hecho

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codigo;
		LocalTime hEntrada, hSalida;
		long horas;

		sc = new Scanner(System.in);

		do {
			System.out.println("Introduce código de empleado: ");
			codigo = sc.nextLine();
			if (!validarCodigo(codigo))
				System.out.println("Código erróneo.");
		} while (!validarCodigo(codigo));
		
		hEntrada=calculaHoras();
		hSalida=calculaHoras();
		
		long minutos=Math.abs(ChronoUnit.MINUTES.between(hEntrada, hSalida)); //ChronoUnit Unidad de tiempo -- minutos      Math.abs (Calculo siempre da positivo)
		horas=minutos/60;
		minutos=minutos%60;
		System.out.println("Han transcurrido "+horas+" horas y "+minutos+" minutos");
		
	}

	public static boolean validarCodigo(String codigo) {
		String patron = "^[A-Z]{1,3}[0-9]{4,7}$";

		if (!codigo.matches(patron))
			return false;
		return true;
	}

	public static LocalTime calculaHoras() {
		int h, m;
		String horaS;
		LocalTime hora = null;
		boolean correcto = false;

		DateTimeFormatter patron = DateTimeFormatter.ofPattern("hh:mm");

		do {
			System.out.println("Introduce una hora en el formato: hh:mm");
			horaS = sc.nextLine();
			try {
				hora = LocalTime.parse(horaS);
				correcto = true;
			} catch (DateTimeParseException e) {
				System.out.println("Hora introducida incorrecta");
			}
		} while (correcto == false);
		return hora;
	}

}
