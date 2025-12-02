package Correcciones;

import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		/*
		 * Un restaurante quiere gestionar las reservas para una cena con espectáculo
		 * mediante un programa. El restaurante puede dar de cenar a 80 comensales. Por
		 * cada cliente que llama para reservar se toma nota de lo siguiente: • Número
		 * de personas para cenar. Controlar que sea un número positivo y que no supere
		 * las plazas que queden disponibles. Si no hay plazas suficientes no se
		 * continúa con la reserva. (0,5 puntos) • Se ofrece una lista de 3 menús para
		 * que elija entre ellos: o Menú económico (25€) o Menú degustación (35€) o Menú
		 * estrella (50€). Validar mediante una función, que el tipo seleccionado sea
		 * correcto. No continuar el proceso hasta introducir correctamente el dato (0,5
		 * puntos) • Tras la cena, durante el espectáculo, habrá la posibilidad de
		 * contratar 2 copas por el precio de 9€ o barra libre por 30€. Pedir cuantas
		 * personas se apuntan a cada una de las dos opciones, teniendo en cuenta que la
		 * suma de ambas no supere el número de personas de la reserva. (0,5 ptos) •
		 * Calcular el precio total mediante una función calcular_precio que reciba
		 * número de comensales, tipo de menú, número de personas que contratan 2 copas
		 * y personas que contratan barra libre. (1 pto). Si el cliente además tiene un
		 * carnet de socio correcto, (validad que tiene longitud 4 ó 5, y que empieza
		 * por letra en mayúsculas y el resto son dígitos) se le hace un 20% de
		 * descuento. (0,75 puntos) • Una vez recibido el precio, mostrarlo y pedir
		 * confirmación de la reserva. (0, 5 puntos) • El proceso acaba si se acaban las
		 * plazas o se teclea -1 al pedir el número de personas para cenar. (0,5 ptos) •
		 * Al acabar el proceso mostrad el total de ganancias y reservas y el porcentaje
		 * de personas que se han apuntado a la barra libre(0,75 ptos). • Haced que el
		 * programa pueda repetir el proceso anterior para varias noches mientras lo
		 * desee el usuario, mostrando al finalizar el programa lo que se ha recaudado
		 * la noche de menor recaudación y el total de personas que no han contratado
		 * bebida en todas las noches.(1,25 pto)
		 */

		int aforo = 80, grupo, barraLibre, dosCopas, totalReservas = 0, totalPersonas = 0, totalBarra = 0;
		// char tipo;
		String tipo, carnet;
		boolean correcto, tieneCarnet, confirmar, otra;
		double precioGrupo, totalGanancias = 0;

		Scanner sc = new Scanner(System.in);

		do {
			// Inicializo variables para una noche
			aforo = 80;
			totalReservas = totalPersonas = totalBarra = 0;
			totalGanancias = 0;
			System.out.println("Total aforo: " + aforo);
			System.out.println("Anota número de comensales: ");
			grupo = sc.nextInt();
			while (grupo != -1 && aforo > 0) {
				if (grupo <= 0 || aforo - grupo < 0) {
					System.out.println("Número incorrecto de comensales.");
				} else {
					sc.nextLine(); // Limpiar Buffer
					do {
						System.out.println("Introduce tipo de menú: (Eco/Deg/Star)");
						// tipo=sc.nextLine().charAt(0);
						// tipo=Character.toUpperCase(tipo);
						tipo = sc.nextLine();
						tipo = tipo.toUpperCase();
						correcto = validarTipoMenu(tipo);
					} while (!correcto); // correcto==false

					do {
						System.out.println("¿Cuántas personas quieren oferta de 2 copas?");
						dosCopas = sc.nextInt();
						System.out.println("¿Cuántas personas quieren barra libre?");
						barraLibre = sc.nextInt();
						if (grupo < dosCopas + barraLibre)
							System.out.println("No hay tantos comensales");
						if (dosCopas < 0 || barraLibre < 0)
							System.out.println("Las cantidades deben ser positivas");
					} while (grupo < dosCopas + barraLibre || dosCopas < 0 || barraLibre < 0); // Salida
																								// grupo<=dosCopas+barraLibre
																								// && dosCopas>=0 &&
																								// barraLibre>=0

					precioGrupo = calcularPrecio(grupo, tipo, dosCopas, barraLibre);

					System.out.println("¿Tienes carnet de socio?");
					tieneCarnet = sc.nextBoolean();

					if (tieneCarnet) {
						System.out.println("Anota el carnet: ");
						carnet = sc.nextLine();
						if (validarCarnet(carnet)) {
							System.out.println("Tiene descuento del 20%");
							precioGrupo = precioGrupo * 0.80;
						}
					}
					System.out.println("El precio de su reserva es de: " + precioGrupo + " euros");

					System.out.println("¿Confirma la reserva? (true/false)");
					confirmar = sc.nextBoolean();

					if (confirmar) {
						aforo = aforo - grupo;
						totalReservas++;
						totalGanancias = totalGanancias + precioGrupo;
						totalPersonas = totalPersonas + grupo;
						totalBarra = totalBarra + barraLibre;
					}
				}
				System.out.println("Quedan " + aforo + " plazas libres");
				if (aforo > 0) {
					System.out.println("Anota número de comensales: ");
					grupo = sc.nextInt();
				}
			}
			// Salgo porque: grupo==-1 || aforo<=0
			System.out.println("Total ganancias: " + totalGanancias);
			System.out.println("Total reservas: " + totalReservas);
			System.out.println("Porcentaje barra libre: " + ((double) totalBarra / totalPersonas) * 100 + "%");

			System.out.println("¿Quiere gestionar la reserva de otra noche? (true/false)");
			otra = sc.nextBoolean();

		} while (otra);

	}

	public static boolean validarTipoMenu(String tipo) {
		if (tipo.equals("ECO") || tipo.equals("DEG") || tipo.equals("STAR"))
			return true;
		return false;
	}

	public static double calcularPrecio(int grupo, String tipo, int dosCopas, int barraLibre) {
		final double MECO = 25, MDEG = 35, MSTAR = 50, PDOS = 9, PLIBRE = 30;
		double precio;

		if (tipo.equalsIgnoreCase("ECO")) // da igual mayusculas o minusculas
			precio = MECO;
		else if (tipo.equalsIgnoreCase("DEG"))
			precio = MDEG;
		else
			precio = MSTAR;

		precio = precio * grupo + PDOS * dosCopas + PLIBRE * barraLibre;
		return precio;
	}

	public static boolean validarCarnet(String carnet) {
		if (carnet.length() != 4 && carnet.length() != 5)
			return false;
		char letra = carnet.charAt(0);
		if (letra >= 'A' && letra <= 'Z') { // (Character.isAlphabetic(letra) && Character.isUpperCase(letra))
			for (int i = 1; i < carnet.length(); i++) {
				if (carnet.charAt(i) < '0' || carnet.charAt(i) < '9') // ver que es un digito
					return false;
			}
			return true;
		}

		return false;
	}
}
