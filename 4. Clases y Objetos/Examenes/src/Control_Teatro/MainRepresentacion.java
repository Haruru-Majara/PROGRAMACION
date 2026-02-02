package Control_Teatro;

import java.time.LocalDate;
import java.util.Scanner;


public class MainRepresentacion {
	
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		/*Se quieren gestionar las entradas de una pequeña sala de teatro durante un año.

La aplicación mantiene un array en el que se pueden almacenar un
máximo de 10 representaciones de obras de teatro, inicialmente ninguna.
Por cada representación se guarda al menos: código, título de la obra,
fecha de la representación.
Hay 2 tipos de entradas para cada función: 15 VIP y 25 normales. Las
entradas VIP cuestan 20 euros y 14 las normales.
Se pide hacer un menú que permita hacer las siguientes operaciones,
hasta que lo desee el usuario:

1. Dar de alta una representación en el array pidiendo sólo los datos
necesarios, y teniendo en cuenta que no se pueden representar dos
obras el mismo día (1,5 ptos)
Validad que la fecha es correcta.(0,75 ptos)
El código se forma con las 3 primeras letras del título en
mayúsculas, un guión, y cuatro dígitos con el mes y el día. Por
ejemplo el código de la obra “Hamlet” que se representa el 4 de
mayo del 2026 sería: HAM-0504.(0,75 pto).

2. Ordenar las representaciones colocando primero las que se
representarán antes.(1,5 ptos)

3. Mostrar la información de todas las representaciones que tengan
entradas libres.(1 pto)

4. Comprar entradas. El usuario anota el código de la obra a la que
quiere asistir (se valida que el formato es correcto y que existe) (1
ptos)
El número de entradas de cada tipo que quiere comprar se obtiene
aleatoriamente (0.25 ptos) (no se permite comprar más de tres
entradas de cada categoría, y en total no se pueden comprar más
de 5).
Si hay suficientes entradas el método devuelve el importe de la
compra, sino se devuelve 0 y no se produce la compra .(1,25 pto)
Las butacas se disponen en 8 filas de 5 asientos cada una. Las 3
primeras filas son VIP, el resto son normales. Usando una matriz,
implementad que el usuario pueda elegir sus asientos después de la
compra. (1,5 pto)

5. Mostrar el importe total recaudado sin recorrer el array de
funciones (0,5 ptos)*/
		
		
		String titulo, codigo;
		LocalDate fecha;
		int opcion, dia, mes , año, numRep=0;
		final int PRECIOEV=20,PRECIOEN=14;
		
		Scanner sc=new Scanner(System.in);
		
		Representacion representaciones[] = new Representacion[10];
		
		do {
			System.out.println("--------MENÚ DE OPCIONES--------");
			System.out.println("1.Dar de alta una representación.");
			System.out.println("2.Ordenar las representaciones.");
			System.out.println("3.Mostrar información de las representaciones.");
			System.out.println("4.Comprar entradas.");
			System.out.println("5.Mostrar importe total recaudado.");
			System.out.println("6.Salir.");
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1:
				sc.nextLine(); // limpiar buffer
			    System.out.println("Escriba el título de la representación: ");
			    titulo = sc.nextLine();

			    System.out.println("Día:");
			    dia = sc.nextInt();
			    System.out.println("Mes:");
			    mes = sc.nextInt();
			    System.out.println("Año:");
			    año = sc.nextInt();

			    fecha = LocalDate.of(año, mes, dia);

			    boolean exito = darDeAlta(representaciones, numRep, titulo, fecha);
			    if (exito) {
			        numRep++;
			        System.out.println("Representación añadida correctamente.");
			    }
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				System.out.println("No existe esta opción, elige otra.");
			}
		}while(opcion!=6);
	}
	public static boolean darDeAlta(Representacion[] reps, int numRep, String titulo, LocalDate fecha) {
	    // 1. comprobar que no hay otra obra ese día
	    for (int i = 0; i < numRep; i++) {
	        if (reps[i].getFecha().equals(fecha)) {
	            System.out.println("Ya hay una obra ese día.");
	            return false;
	        }
	    }

	    // 2. generar código
	    String codigo = titulo.substring(0, 3).toUpperCase() + "-" +
	                    String.format("%02d%02d", fecha.getMonthValue(), fecha.getDayOfMonth());

	    // 3. crear la representación
	    reps[numRep] = new Representacion(codigo, titulo, fecha);

	    return true;
	}

}
