package ExcepcionesyPaquetes;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		/*Haz un juego interactivo donde el ordenador genera una fecha secreta y el usuario
		trata de averiguarla. El usuario va haciendo preguntas en las que indica una fecha y el
		ordenador responde si la fecha secreta es mayor o menor que la introducida. El juego
		termina cuando se averigua la fecha. Los casos en los que el usuario no introduzca una
		fecha con un formato válido deben manejarse con excepciones.*/

		int dia, mes, año;
		boolean correcta = false;
		String fechaf;
		LocalDate fecha = null, fechal = null;
		Random r = new Random();

		do {
			try {
				dia = r.nextInt(31) + 1;
				mes = r.nextInt(12) + 1;
				año = r.nextInt(3) + 2024; //año entre 2024 y 2026
				//System.out.println(dia + "/" + mes + "/" + año);

				fecha = LocalDate.of(año, mes, dia);
				correcta = true;
			} catch (DateTimeException e) {
				System.out.println("Fecha incorrecta, vuelvo a calcular");
			}
		} while (correcta == false);

		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yyyy");

		Scanner sc = new Scanner(System.in);

		correcta = false;
		do {
			do {
				try {
					System.out.println("Introduce fecha en formato dd/mm/aaaa");
					fechaf = sc.nextLine();
					fechal = LocalDate.parse(fechaf, patron);
					correcta = true;
				} catch (DateTimeParseException e) {
					System.out.println("Fecha incorrecta, vuelvo a calcular");
				}
			} while (correcta == false);

			if (fecha.isEqual(fechal))
				System.out.println("Has encontrado la fecha");
			else if (fecha.isBefore(fechal)) {
				System.out.println("La fecha que buscas es anterior a la anotada");
			} else
				System.out.println("La fecha que buscas es posterior a la anotada");
		} while (fecha.isEqual(fechal) == false);
		System.out.println("Fecha generado por el ordenador:"+ fecha.format(patron));

	}

}
