package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*3. Programa que lee nombre y primer apellido de personas. Para cada una de ellas
		genera un código con la primera letra del nombre y las tres primeras del apellido. Si
		dicho apellido tiene una longitud inferior a 3, se le pide el segundo apellido y se cogen
		sus tres primeras letras. Si éste, también tiene menos longitud se genera el código con
		la primera del nombre y el apellido completo que sea más largo de los dos. El código se
		genera en una función.*/

		
	    String nombre;
        String apellido1;
        String apellido2;
        String codigo;

		 Scanner sc=new Scanner(System.in);
	    

	        // 🔹 Entrada de datos
	        System.out.print("Introduce el nombre: ");
	        nombre = sc.nextLine();

	        System.out.print("Introduce el primer apellido: ");
	        apellido1 = sc.nextLine();

	        System.out.print("Introduce el segundo apellido: ");
	        apellido2 = sc.nextLine();

	        // 🔹 Llamada a la función
	        codigo = generarCodigo(nombre, apellido1, apellido2);

	        // 🔹 Salida de datos
	        System.out.println("El código generado es: " + codigo);

	        sc.close();
	    }

	    // 🔹 Función definida al final
	    public static String generarCodigo(String nombre, String apellido1, String apellido2) {
	        nombre = nombre.toUpperCase();
	        apellido1 = apellido1.toUpperCase();
	        apellido2 = apellido2.toUpperCase();

	        String codigo = "";

	        // Primera letra del nombre
	        codigo += nombre.charAt(0);

	        // Si el primer apellido tiene 3 o más letras
	        if (apellido1.length() >= 3) {
	            codigo += apellido1.substring(0, 3);
	        } 
	        // Si el primer apellido tiene menos de 3 letras
	        else {
	            if (apellido2.length() >= 3) {
	                codigo += apellido2.substring(0, 3);
	            } else {
	                // Ambos tienen menos de 3 letras → usa el más largo completo
	                if (apellido1.length() >= apellido2.length()) {
	                    codigo += apellido1;
	                } else {
	                    codigo += apellido2;
	                }
	            }
	        }

	        return codigo;
	}

}
