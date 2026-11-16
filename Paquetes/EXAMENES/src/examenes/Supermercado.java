package examenes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * Queremos simular la compra en un supermercado de una persona, haz un programa en java,
utilizando las variables y constantes adecuadas y usando comentarios.

Por cada persona que llega al supermercado se anota el presupuesto máximo del que dispone
y después se simula la compra de varias unidades de varios productos de la siguiente manera:

-Leer la fecha de compra al principio del programa, comprobando que es correcta y que es anterior a la de hoy.

- Se anota el código de producto, que tiene esta forma PX999, dónde el carácter X es una
letra que indica la sección, y luego tiene entre dos y tres dígitos . Leedlo hasta que sea
correcto, validadlo con una función. (1,5 pto)

- Se calculan las unidades de forma aleatoria (entre 1 y 4). (1 pto)

- Se pide el precio unidad, validando que sea positivo. (0,25 ptos)

- Calculamos el precio de las unidades mediante una función, sabiendo que los productos
que pertenecen a la sección de pescadería (P) tienen un descuento del 20% y los lácteos
(L), tienen un descuento del 3 por 2 unidades. (1,5 pto)

- Comprobar que el usuario no se ha pasado del presupuesto inicial, si es así, la compra de
este último producto se anula y se pide otro código de producto. (1 pto)

El usuario termina su compra cuando se anote “FIN” como código de producto, (0,5 ptos)

Cuando una persona finaliza su compra, si la compra la realizó en martes o miércoles, se le hace un 5% de descuento.

Si se trata de un envío a domicilio se pide la zona de envío, que puede ser de la 1 a la 3, si no
es así no se puede realizar el envío. En otro caso se cobra 5,7 ó 10 euros respectivamente, más
por el envío, a no ser que se trate de un jubilado, en cuyo caso el envío es gratis. (1,25 pto)

Mostrad el precio de toda la compra de la persona en cuestión.

Repetid el proceso para varias personas hasta que se anote un presupuesto máximo de 0
euros. (1,5 pto)

Al Terminar el programa:

- Mostrad de todos los envíos realizados, el porcentaje realizado a jubilados. (0,5 pto)

- Mostrad el importe medio de todas las compras realizadas, y el importe de las dos
compras más caras. (1 pto)
 * 

 * */
public class Supermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		sc.useLocale(Locale.ENGLISH);
		
		double presupuesto=0,precioProd,precioFin,valorCompra=0,valorFinalCompra=0,plusEnvio=0,enviosPorcentajeJubilados,mediaCompras,comprasTotales=0;
		int cantProd=0,zona=0,envios=0,enviosJubilados=0,enviosTotales=0,numCompras=0,cliente=1;
		String codigoProd,fechaCompra;
		boolean codigoBueno=false,fechaBuena=false;
		char aDomicilio,jubilado;
		
		do {
			System.out.println("---BIENVENIDO A NUESTRO SUPERMERCADO---");
			
			//SacarFecha de compra
			do{
				System.out.println(" ");
				System.out.println("Cliente "+cliente+":");
				System.out.println("Anota fecha de compra (dd/mm/aaaa):");
				fechaCompra=sc.nextLine();
				
				fechaBuena=validarFecha(fechaCompra);
				
				if(fechaBuena==true)
					System.out.println("Fecha de compra correcta: "+fechaCompra);
				else
					System.out.println("Fecha incorrecta. Anota de nuevo la fecha.");
				
				System.out.println(" ");
			}while(fechaBuena==false);
			
			//Validar presupuesto
			do {
				System.out.println("Tu presupuesto es: ");
				presupuesto=sc.nextDouble();
				
				if(presupuesto<0)
					System.out.println("Error en el presupuesto.Introduzca de nuevo la cantidad.");
				
				sc.nextLine(); //LIMPIAMOS PARA QUE NO DE ERROR EN LA CADENA DE CODIGO
			}while(presupuesto<0);
			
			if(presupuesto==0)
				break;
			//Anotar productos
			do {
				//Validar codigo con funcion hasta que sea correcto
				do {
					System.out.println("Anota código de producto: (2 letras mayúsculas y 2 o 3 números. Anotar FIN si ya no se quiere continuar).");
					codigoProd=sc.nextLine();
					
					//Mirar si el codigo es Fin, cambiar la variable a true porque queremos salir.
					if(codigoProd.equalsIgnoreCase("FIN")) {
						codigoBueno=true;
						break;
					}
					//Codigo pasa a funcion
					codigoBueno=codigoCorrecto(codigoProd);
					
					if(!codigoBueno)
						System.out.println("Codigo introducido incorrecto, pruebe otra vez.");
				}while(!codigoBueno);
				
				//Si el codigo NO es FIN
				if(!codigoProd.equalsIgnoreCase("FIN")) {
					//Calcular unidades aleatoriamente entre 1 y 4
					cantProd=r.nextInt(4)+1;
					System.out.println("Cantidad de productos de "+codigoProd+": "+cantProd);
				
					//Pedir precio por unidad y validarlo
					do {
						System.out.println("El precio por unidad de "+codigoProd+" es:");
						precioProd=sc.nextDouble();
					
						if(precioProd<=0)
							System.out.println("El precio tiene que ser positivo.");
					
					}while(precioProd<=0);
					
					//Calcula con funcion precio final del producto
					precioFin=calcularPrecioProducto(codigoProd,cantProd,precioProd);
					
					//Ver si tiene presupuesto aun para comprar el producto y descontarlo del mismo
					if(precioFin>presupuesto)
						System.out.println("No se puede comprar esto, no hay suficiente dinero.");
					else {
						presupuesto=presupuesto-precioFin;
						valorCompra=valorCompra+precioFin;
						System.out.println("El producto "+codigoProd+" le ha costado: "+precioFin);
					}
					
					//Enseño presupuesto restante
					System.out.println("Le quedan: "+presupuesto+" euros.");
					sc.nextLine();//Volvemos a limpiar para que no de error arriba cuando se pida codigo.
				}else //Si el codigo ES FIN
					break;
			}while(!codigoProd.equalsIgnoreCase("FIN"));
			
			//Calculamos mediante funcion el valor total SOLO de los productos
			valorFinalCompra=descuentoDiaSemana(fechaCompra,valorCompra);
			
			//Pedir y verificar el a domicilio
			do {
				System.out.println("¿Tu pedido es a domicilio? (S,N)");
				aDomicilio=Character.toUpperCase(sc.nextLine().charAt(0));
				
				if(aDomicilio!='S' && aDomicilio!='N')
					System.out.println("Error en pedido.");
				
			}while(aDomicilio!='S' && aDomicilio!='N');
			
			//Ramificación envío
			if(aDomicilio=='N') 
				System.out.println("Tu compra al final es de: "+valorFinalCompra+" euros.");
			else {
				do {
					try {
						System.out.println("Zona de envio: ");
						zona=sc.nextInt();
						
						if(zona<1 || zona>3)
							System.out.println("La zona no corresponde, intentar de nuevo.");
					}catch(InputMismatchException e) {
						sc.nextLine();
						System.out.println("Se esperaba un número.");
					}
					
				}while(zona<1 || zona>3);
				
				sc.nextLine();
				
				do {
					System.out.println("¿Eres jubilado? (S/N)");
					jubilado=Character.toUpperCase(sc.nextLine().charAt(0));
					
					if(jubilado!='S' && jubilado!='N')
						System.out.println("Error en pedido.");
					
				}while(jubilado!='S' && jubilado!='N');
				
				if(jubilado=='S') {
					System.out.println("El envío le sale gratis, el precio final de la compra es: "+valorFinalCompra+" euros");
					enviosJubilados++;
				}else {
					
					switch(zona) {
					case 1:
						plusEnvio=5;
						break;
					case 2:
						plusEnvio=7;
						break;
					case 3:
						plusEnvio=10;
						break;
					}
					
					valorFinalCompra=valorFinalCompra+plusEnvio;
					System.out.println("El envío le costará "+plusEnvio+", el precio final de la compra es: "+valorFinalCompra+" euros.");
				}	
				
			}
			
			envios++;
			numCompras++;
			comprasTotales=comprasTotales+valorFinalCompra;
			cliente++;
			valorFinalCompra=0;
			plusEnvio=0;
			System.out.println("");
			
		}while(presupuesto!=0);
		
		enviosTotales=envios+enviosJubilados;
		enviosPorcentajeJubilados=(enviosJubilados*100)/enviosTotales;
		
		System.out.println(" ");
		System.out.println("----INFORME DE COMPRAS----");
		System.out.println(" ");
		System.out.println("El porcentaje de envios a Jubilados es: "+enviosPorcentajeJubilados+"%");
		
		mediaCompras=comprasTotales/numCompras;
		
		System.out.println("La media de las compras es de: "+mediaCompras+" euros.");
	}
	
	public static double descuentoDiaSemana (String fecha, double totalCompra) {
		int diaSemana;
		LocalDate fechaCompra;
		double precioFinal;
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		fechaCompra=LocalDate.parse(fecha,patron);
		diaSemana=fechaCompra.getDayOfWeek().getValue();
		
		switch(diaSemana) {
		case 2,3:
			precioFinal=totalCompra-totalCompra*0.05;
		default:
			precioFinal=totalCompra;
		}
		return precioFinal;
	}
	
	public static double calcularPrecioProducto(String codigo,int cantidad,double precio) {
		double precioInicial,precioFinal=0;
		char seccion;
		int gratis;
		
		seccion=codigo.charAt(1);
		
		precioInicial=cantidad*precio;
		
		switch(seccion) {
		case 'P':
			precioFinal=precioInicial-(precioInicial*0.2);
			break;
		case 'L':
			gratis=cantidad/3;
			cantidad=cantidad-gratis;
				
			precioFinal=cantidad*precioInicial;
			break;
		default:
			precioFinal=precioInicial;
			break;
		}
		return precioFinal;
	}
	
	public static boolean codigoCorrecto(String codigo) {
		String patron;
			
		patron="^[A-Z]{2}[0-9]{2,3}$";
			
		if(codigo.matches(patron))
			return true;
		return false;
		
	}
	
	public static boolean validarFecha(String fecha) {
		
		LocalDate fechaHoy=LocalDate.now();
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			LocalDate fechaCompra=LocalDate.parse(fecha,patron);
			
			if(fechaCompra.isBefore(fechaHoy))
				return true;
			return false;
		}catch(DateTimeParseException e) {
			return false;
		}
		
	}
}
