package examenes;

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

	}

}
