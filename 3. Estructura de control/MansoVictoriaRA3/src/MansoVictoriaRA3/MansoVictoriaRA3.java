package MansoVictoriaRA3;

import java.util.Locale;
import java.util.Scanner;

public class MansoVictoriaRA3 {

	public static void main(String[] args) {
		// EXAMEN REALIZADO POR VICTORIA MANSO
		
		double presupuestoI, precioUnidad, precioTotal;
		String codigo;
		int unidades, zona, contadorEnvios=0,contadorJubilados=0;
		char letraSeccion;
		boolean aDomicilio,jubilado;
		final double zona1=5,zona2=7,zona3=10;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
			System.out.println("Anota el presupuesto del que dispones:");
			presupuestoI=sc.nextDouble();
			sc.nextLine(); //Limpiamos buffer antes de anotar un string
			
			while(presupuestoI != 0 ) {
				if (presupuestoI <0) {
					System.out.println("Presupuesto erroneo");
					System.out.println("Anota el presupuesto del que dispones:");
					presupuestoI=sc.nextDouble();
					sc.nextLine(); //Limpiamos buffer antes de anotar un string
				}
				if (presupuestoI == 0)
					break;
			do {
				System.out.println("Anota el código del producto:");
				codigo=sc.nextLine();
				
				if (validarCodigo(codigo)==false)
					System.out.println("Codigo erroneo.");
				
			}while(validarCodigo(codigo)==false);	
			
		
			
			letraSeccion=codigo.charAt(1);
			
			do {
				System.out.println("Introduce las unidades del producto entre 1 y 4:");
				unidades=sc.nextInt();
				
				if (unidades != 1 && unidades != 2 && unidades != 3 && unidades !=4)
					System.out.println("Unidades incorrectas");
				
			}while(unidades != 1 && unidades != 2 && unidades != 3 && unidades !=4);
		
			
			do {
				System.out.println("Introduce el precio por la unidad:");
				precioUnidad=sc.nextDouble();
			
				if (precioUnidad <=0)
					System.out.println("Precio erróneo");
			
			}while(precioUnidad <=0);
			
			
			precioTotal=precioTotal(unidades, precioUnidad, letraSeccion);
			
			if (presupuestoI < precioTotal) {
				System.out.println("Supera el importe.");
			}
			
			System.out.println("¿Es un envio a domicilio? (True/False)");
			aDomicilio=sc.nextBoolean();
			
			System.out.println("¿Estás jubilado? (True/False)");
			jubilado=sc.nextBoolean();
			
			
			if (aDomicilio)
				System.out.println("Introduce la zona: 1, 2 o 3 ");
				zona=sc.nextInt();
				if (zona != 1 && zona !=2 && zona!=3)
					System.out.println("No se puede realizar el pedido.");
				else
					if (zona == 1 && jubilado == false) {
						precioTotal=precioTotal+zona1;
						contadorEnvios++;
					}
					else
						if (zona == 2 && jubilado == false) {
							precioTotal=precioTotal+zona2;
							contadorEnvios++;
						}
						else
							if (zona == 3 && jubilado == false) {
							precioTotal=precioTotal+zona3;
							contadorEnvios++;
							}
							else {
								precioTotal=precioTotal;
								contadorEnvios++;
								contadorJubilados++;
							}
				
			System.out.println("Precio total: "+precioTotal);
			

			
			System.out.println("Anota el presupuesto del que dispones:");
			presupuestoI=sc.nextDouble();
			sc.nextLine(); //Limpiamos buffer antes de anotar un string
			
		}
		System.out.println("Porcentaje de envios realizados a jubilados: "+((double)contadorEnvios/contadorJubilados)* 100 +" %");
		
		
	}

	public static boolean validarCodigo(String codigo) {
		char primeraLetra, segundaLetra;

		if (codigo.length() != 4 && codigo.length() != 5)
			return false;

		primeraLetra = codigo.charAt(0);

		if (primeraLetra != 'P')
			return false;

		segundaLetra = codigo.charAt(1);

		if (segundaLetra < 'A' || segundaLetra > 'Z')
			return false;

		for (int i = 2; i < codigo.length(); i++) { // Validamos que en la posicion 2,3 y 4 sean numeros
			char digito = codigo.charAt(i);
			if (digito < '0' || digito > '9')
				return false;
		}

		return true;
		
		/**La expresión regular sería:
		 * 
		 * public stati...{
		 * String patron = "^P[A-Z][0-9]{2,3}$";
		 * if (codigo.matches(patron))
		 * 		return true;
		 * return false;
		 * }
		*/
	}

	public static double precioTotal(int unidades, double precioUnidad, char seccion) {
		double precio;

		precio = unidades * precioUnidad;

		if (seccion == 'P')
			precio = precio * 0.80;
		else if (seccion == 'L')
			precio = precio - precioUnidad;

		return precio;
	}
}
