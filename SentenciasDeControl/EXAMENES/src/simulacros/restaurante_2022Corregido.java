package simulacros;

import java.util.Scanner;

public class restaurante_2022Corregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPlazas = 80, nper, barraLibre,dosCopas,totalReservas=0,totalBarraLibre=0;
		char tipoM, acepta;
		double precioPersona,precioGrupo,totalGanancias=0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Anota número de plazas a reservar:");
			nper = sc.nextInt();
			if (nper == -1)
				break;
			if (nper <= 0)
				System.out.println("Número incorrecto, tiene que ser positivo");
			else {
				if (totalPlazas < nper)
					System.out.println("No hay plazas para tantos comensales");
				else {
					System.out.println("Numero de personas correcto,seguimos con la reserva");
					sc.nextLine(); //Limpio buffer
					do {
						System.out.println("Anota tipo de menu:");
						tipoM = sc.nextLine().charAt(0);
						tipoM = Character.toUpperCase(tipoM);
						precioPersona = precioMenu(tipoM);
					} while (precioPersona == 0);
					
					do {
						System.out.println("Cuántas personas quieren barra libre?");
						barraLibre=sc.nextInt();
						System.out.println("Cuántas personas quieren dos copas?");
						dosCopas=sc.nextInt();
						if (barraLibre+dosCopas > nper) {
							System.out.println("No hay tantas personas en tu grupo");
						}
					}while(barraLibre+dosCopas > nper);
					
					precioGrupo=calcPrecioGrupo(nper,dosCopas,barraLibre,precioPersona);
					// Aquí vendría lo del carnet
					System.out.println("El precio del grupo es de:"+precioGrupo+" euros");
					sc.nextLine(); // Limpio buffer
					do {
						System.out.println("Acepta la reserva?(s/n)");
						acepta=sc.nextLine().charAt(0);
						acepta=Character.toUpperCase(acepta);
					}while(acepta!='S' && acepta!='N');
					
					if (acepta=='N')
						System.out.println("No importa, otra vez será");
					else {
						System.out.println("Gracias por reservar con nosotros");
						totalPlazas-=nper;
						totalGanancias+=precioGrupo;
						totalReservas++;
						totalBarraLibre+=barraLibre;
					}
					
				}
			}

		} while (totalPlazas > 0);
		
		System.out.println("El total de ganancias ha sido:"+totalGanancias);
		System.out.println("El total de reservas ha sido:"+totalReservas);
		System.out.println("Porcentaje de barra libre:"+ (totalBarraLibre)*100/(80-totalPlazas));
	}

	/**
	 * Devuelve el precio del menú y 0 si no existe ese tipo de menú
	 * 
	 * @param tipo
	 * @return
	 */
	public static double precioMenu(char tipo) {
		double precio;
		switch (tipo) {
		case 'E':
			return 25;
		case 'D':
			return 35;
		case 'S':
			return 50;
		}
		System.out.println("Tipo de menú incorrecto");
		return 0;
	}
	
	public static double calcPrecioGrupo(int np, int dc, int bl,double pp) {
		final double BARRAL=30, DOSCOPAS=9;
		double pg=np*pp+bl*BARRAL+dc*DOSCOPAS;
		return pg;
	}
}


