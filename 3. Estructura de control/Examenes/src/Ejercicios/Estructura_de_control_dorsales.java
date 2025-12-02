package Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Estructura_de_control_dorsales {

	public static void main(String[] args) {
		/*
		 * Se quieren procesar las marcas de varios saltadores de longitud en una
		 * prueba. Por cada atleta se anotan los siguientes datos: - Su dorsal: validar
		 * que sea una cadena de longitud 6, con 3 letras en mayúsculas, que es el país,
		 * y 3 dígitos. Leedlo hasta que sea correcto. Usad una función para validar el
		 * código (1 pto) - Su categoría: M (masculino) o F (femenino), leedla hasta que
		 * sea correcta (0,5 pto). - A continuación el atleta realiza 3 saltos de
		 * longitud (usad bucle) (1 ptos). Codificar una función que me diga si un salto
		 * es nulo (1 pto) Tenemos en cuenta que se considera un salto nulo: Por debajo
		 * de 6.82 metros en categoría femenina. Por debajo de 8.22 metros en categoría
		 * masculina. Si los tres saltos son nulos, o se anota un -1 en la longitud de
		 * uno de los saltos, el atleta queda descalificado en ese momento y se pasa al
		 * siguiente. (1 pto) En otro caso nos quedamos con la longitud del salto mayor
		 * de este atleta y lo mostramos por pantalla.(1 pto) El proceso termina cuando
		 * se hayan anotado al menos 2 atletas de cada categoria.(1 pto) Mostrad al
		 * terminar: - El mejor salto femenino y el país de procedencia de la atleta. (1
		 * pto) - La longitud media de los saltos los atletas masculinos (1 pto) - El
		 * total de saltos nulos realizados.(0,5 pto) Modificad el programa para que el
		 * usuario pueda introducir tantas pruebas de salto como quiera, mostrando al
		 * finalizar el número total de saltos realizados . (1 pto)
		 */

		String dorsal, pais, paisMejorSaltoFem = " ";
		char categoria;
		double salto, saltoMaximo = 0, mejorSaltoFem = 0, acumuladorSaltosMasc = 0, mediaSaltosMasc;
		boolean descalificado = false;
		int saltosNulos = 0, masculino = 0, femenino = 0, contadorSaltosMasc = 0, totalSaltosNulos = 0, totalSaltos = 0;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		do {
			//Resetear variables por atleta
			saltoMaximo=0;
			saltosNulos=0;
			descalificado= false;
			do {
				System.out.println("Introduce el dorsal: ");
				dorsal = sc.nextLine();

				if (validarDorsal(dorsal) == false)
					System.out.println("Dorsal incorrecto.");

			} while (validarDorsal(dorsal) == false);

			// Después de validar, extraemos el pais
			pais = dorsal.substring(0, 3); // Las 3 primeras letras

			do {
				System.out.println("Introduce la categoría: (M o F)");
				categoria = sc.nextLine().charAt(0);

				if (categoria != 'M' && categoria != 'F')
					System.out.println("Categoría incorrecta.");

			} while (categoria != 'M' && categoria != 'F');

			System.out.println("A continuación se mostrarán 3 saltos: ");

			for (int i = 1; i <=3; i++) {
				System.out.println("Introduce salto número " + i);
				salto = sc.nextDouble();
				sc.nextLine(); //Limpiar el buffer
				totalSaltos++; // Contar cada salto que se hace

				if (salto == -1) { // Comprobar si introduce -1
					descalificado = true;
					System.out.println("Atleta descalificado");
					break; // Salir del bucle inmediatamente
				}

				// Comprobar si el salto es nulo
				if (saltoNulo(salto, categoria)) {
					saltosNulos++;
					totalSaltosNulos++; // Acumular saltos nulos globales
					System.out.println("Salto nulo");
				} else
				// Si no es nulo, actualizar el salto máximo
				if (salto > saltoMaximo)
					saltoMaximo = salto;
			}

			// Después del bucle, comprobar si los 3 saltos fueron nulos
			if (saltosNulos == 3) {
				descalificado = true;
				System.out.println("Los 3 saltos fueron nulos. Atleta descalificado");
			}

			// Si está descalificado, pasar al siguiente atleta
			if (descalificado) {
				System.out.println("Pasando al siguiente atleta...");
				continue; // Volver al inicio del bucle principal (siguiente atleta), no se cuenta a este
							// atleta para el contador de masculino o femenino
			}

			System.out.println("Mejor salto del atleta: " + saltoMaximo + " metros");

			if (categoria == 'M') { // Acumular el salto máximo de este atleta
				masculino++;
				acumuladorSaltosMasc = acumuladorSaltosMasc + saltoMaximo;
				contadorSaltosMasc++;
			} else {
				femenino++; // Comprobar que es el mejor salto femenino
				if (saltoMaximo > mejorSaltoFem) {
					mejorSaltoFem = saltoMaximo;
					paisMejorSaltoFem = pais;
				}
			}

		} while (masculino < 2 || femenino < 2); // Hasta tener 2 de cada uno

		System.out.println("\n============ RESULTADOS FINALES ============");

		System.out.println("Mejor salto femenino: " + mejorSaltoFem + " metros del país: " + paisMejorSaltoFem);

		mediaSaltosMasc = acumuladorSaltosMasc / contadorSaltosMasc;
		System.out.println("Longitud media saltos masculinos: " + mediaSaltosMasc + " metros");

		System.out.println("Total de saltos nulos realizados: " + totalSaltosNulos);

	}

	public static boolean validarDorsal(String dorsal) {
		// Validar que la cadena sea de 6 caracteres

		if (dorsal.length() != 6)
			return false;

		// Validar primeros 3 caracteres (letras mayúsculas)
		for (int i = 0; i < 3; i++) {
			char letra = dorsal.charAt(i);
			if (letra < 'A' || letra > 'Z')
				return false;
		}

		// Validar últimos 3 caracteres (dígitos)
		for (int i = 3; i < 6; i++) {
			char digito = dorsal.charAt(i);
			if (digito < '0' || digito > '9')
				return false;
		}
		return true;
	}

	public static boolean saltoNulo(double salto, char categoria) {
		if (categoria == 'F' && salto < 6.82)
			return true;

		if (categoria == 'M' && salto < 8.22)
			return true;

		return false;
	}
}
