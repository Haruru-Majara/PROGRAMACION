package examenes;

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
		
		double presupuesto,precioProd;
		int cont=1,cantProd;
		String codigoProd;
		String patron="^[A-Z]{2}[0-9}[2,3]$";
		char otro;
		boolean codigoBueno=false;
		
		do {
			//Contador clientes
			System.out.println("Cliente: "+cont);
			//Validar presupuesto
			do {
				System.out.print("Tu presupuesto es: ");
				presupuesto=sc.nextDouble();
				
				if(presupuesto<0)
					System.out.println("Error en el presupuesto.Introduzca de nuevo la cantidad.");
			}while(presupuesto<0);
			//Anotar productos
			sc.nextLine();
			do {
				//Validar codigo con funcion hasta que sea correcto
				do {
					System.out.println("Anota código de producto: ");
					codigoProd=sc.nextLine();
					
					codigoBueno=codigoCorrecto(codigoProd);
					if(!codigoBueno)
						System.out.println("Codigo introducido incorrecto, pruebe otra vez.");
				}while(!codigoBueno);
				
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
				
				System.out.println("¿Quieres comprar algo más?");
				otro=Character.toUpperCase(sc.nextLine().charAt(0));
			}while(otro=='S');
		}while(presupuesto!=0);
	}
	
	public static double calcularPrecio(String codigo,int cantidad,double precio) {
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

}
