package ExcepcionesyPaquetes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		/*1. Lee dos fechas de teclado en formato dd/mm/aa, de manera que la primera sea
		menor que la segunda. Controla con excepciones que la fecha sea correcta.
		Haz una función que reciba las dos fechas y si son del mismo mes retorna los días que
		hay entre ambas, si no retorna los meses que hay entre ambas.*/
				LocalDate f1, f2;
				String fecha;

				Scanner sc = new Scanner(System.in);
				do {
					do {
						System.out.println("Introduce fecha en formato dd/mm/aa:");
						fecha = sc.nextLine();
						f1 = transformarFecha(fecha, "dd/LL/yy");
					} while (f1 == null);
					
					do {
						System.out.println("Introduce fecha en formato dd/mm/aa:");
						fecha = sc.nextLine();
						f2 = transformarFecha(fecha, "dd/LL/yy");
					} while (f2 == null);
					
					if (!(f1.isBefore(f2)))
						System.out.println("La primera fecha tiene que ser anterior a la segunda");
				
				}while(!(f1.isBefore(f2)));

				System.out.println("La difencia es:"+diferencia(f1,f2));
			}
			/**
			 * Función que calcula la diferencia entre dos fechas. Si son del mismo mes en días y si no en meses
			 * @param f1
			 * @param f2
			 * @return la difencia en un entero
			 */
			public static int diferencia(LocalDate f1,LocalDate f2) {
				if (f1.getYear()==f2.getYear() && f1.getMonth()==f2.getMonth())
					return (int)ChronoUnit.DAYS.between(f1, f2);
				else
					return (int)ChronoUnit.MONTHS.between(f1, f2);
			}

			/**
			 * Función que recibe dos String con la fecha y el patrón y devuelve una fecha en LocalDate
			 * @param fechaS
			 * @param patronS
			 * @return la fecha en LocalDate y null si no puede hacer la conversión
			 */
			public static LocalDate transformarFecha(String fechaS, String patronS) {
				LocalDate fecha = null;
				try {
					DateTimeFormatter patron = DateTimeFormatter.ofPattern(patronS);

					fecha = LocalDate.parse(fechaS, patron);
				} catch (DateTimeParseException e) {
					System.out.println("No se puede transformar la fecha");
				}
				return fecha;

	}

}
