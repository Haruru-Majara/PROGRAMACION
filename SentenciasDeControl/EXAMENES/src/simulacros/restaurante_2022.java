package simulacros;

import java.util.Scanner;

/**
 * PRIMER EJERCICIO (SIN CLASES) (6,25 puntos)
Un restaurante quiere gestionar las reservas para una cena con espectáculo mediante un programa. El
restaurante puede dar de cenar a 80 comensales. Por cada cliente que llama para reservar se toma nota
de lo siguiente:

• Número de personas para cenar. Controlar que sea un número positivo y que no supere las
plazas que queden disponibles. Si no hay plazas suficientes no se continúa con la reserva. (0,5
puntos)

• Se ofrece una lista de 3 menús para que elija entre ellos:
	o Menú económico (25€)
	o Menú degustación (35€)
	o Menú estrella (50€).
	
Validar mediante una función, que el tipo seleccionado sea correcto. No continuar el proceso
hasta introducir correctamente el dato (0,5 puntos)

• Tras la cena, durante el espectáculo, habrá la posibilidad de contratar 2 copas por el precio de
9€ o barra libre por 30€. Pedir cuantas personas se apuntan a cada una de las dos opciones,
teniendo en cuenta que la suma de ambas no supere el número de personas de la reserva. (0,5
ptos)

• Calcular el precio total mediante una función calcular_precio que reciba número de comensales,
tipo de menú, número de personas que contratan 2 copas y personas que contratan barra libre.
(1 pto). Si el cliente además tiene un carnet de socio correcto, (validad que tiene longitud 4 ó 5,
y que empieza por letra en mayúsculas y el resto son dígitos) se le hace un 20% de descuento.
(0,75 puntos)

• Una vez recibido el precio, mostrarlo y pedir confirmación de la reserva. (0, 5 puntos)

• El proceso acaba si se acaban las plazas o se teclea -1 al pedir el número de personas para cenar.
(0,5 ptos)

• Al acabar el proceso mostrad el total de ganancias y reservas y el porcentaje de personas que se
han apuntado a la barra libre(0,75 ptos).

• Haced que el programa pueda repetir el proceso anterior para varias noches mientras lo desee
el usuario, mostrando al finalizar el programa lo que se ha recaudado la noche de menor
recaudación y el total de personas que no han contratado bebida en todas las noches.(1,25 pto)
 * */

public class restaurante_2022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int personas,numeroComensales=80;
		
		do {
			
			System.out.println("Anote cuantas personas son para cenar: ");
			personas=sc.nextInt();
			
			if(personas<=numeroComensales)
				numeroComensales=numeroComensales-personas;
			else {
				System.out.println("Lo sentimos, el número de comensales supera el aforo.");
			}
				
				
			
			
		}while(numeroComensales<=80);
	}

}
