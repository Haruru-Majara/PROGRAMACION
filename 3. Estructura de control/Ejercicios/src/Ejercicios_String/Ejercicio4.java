package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Programa que valida un DNI introducido por teclado. Utilizar una función para validarlo*/

		/*
		 * Un DNI válido tiene:
			
			8 dígitos numéricos + 1 letra final.
			
			La letra se calcula según el resto de dividir el número entre 23, usando esta tabla:
			
			Resto	Letra	Resto	Letra	Resto	Letra
			0	      T	      1	      R	      2	      W
			3	      A	      4	      G	      5	      M
			6	      Y	      7	      F	      8	      P
			9	      D	      10	  X	      11	  B
			12	      N	      13	  J	      14	  Z
			15	      S	      16	  Q	      17	  V
			18	      H	      19	  L	      20	  C
			21	      K	      22	  E
			
			* */
		
		 // 🔹 Variables declaradas al inicio
        String dni;
        boolean valido;

        // 🔹 Inicialización del Scanner
        Scanner sc = new Scanner(System.in);

        // 🔹 Entrada de datos
        System.out.print("Introduce un DNI (8 números y una letra): ");
        dni = sc.nextLine().toUpperCase();

        // 🔹 Validación mediante la función
        valido = validarDNI(dni);

        // 🔹 Resultado
        if (valido) {
            System.out.println("✅ El DNI es válido.");
        } else {
            System.out.println("❌ El DNI no es válido.");
        }

        sc.close();
    }

    // 🔹 Función que valida el DNI
    public static boolean validarDNI(String dni) {
        // Comprobamos longitud correcta
        if (dni.length() != 9)
            return false;

        // Extraemos número y letra
        String numeroStr = dni.substring(0, 8);
        char letra = dni.charAt(8);

        // Comprobamos que los 8 primeros caracteres sean dígitos
        if (!numeroStr.matches("\\d+"))
            return false;

        // Convertimos a número entero
        int numero = Integer.parseInt(numeroStr);

        // Array de letras según el resto
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 
                         'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Calculamos la letra correcta
        char letraCorrecta = letras[numero % 23];

        // Comprobamos si coincide
        return letra == letraCorrecta;
	}

}
