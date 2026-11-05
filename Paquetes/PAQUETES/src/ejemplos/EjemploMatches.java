package ejemplos;

/**
 *  + uno o mas
 *  * 0,1 o mas
 *  {numero} numero exacto de veces
 * 
 * */
import java.util.Scanner;

public class EjemploMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String cadena;
		
		String regex = "[0-9]{8}[A-Za-z]"; 
		/**
		 * EJEMPLOS DE MATCH-----
		 * 
		String regex = "\\d+";					//uno o mas numeros
		String regex = "[0-9]+";         		//es un numero entre 0 y 9
		String regex = "[A-Z]+"           		//letra mayuscula
		String regex = "[a-z]+"          		//letra minuscula
		String regex = "[0-9]{4}";       		//4 numeros entre 0 y 9
		String regex = "[A-Z]{4}";      		//4 letras en mayuscula
		String regex = "[A-Z]{2,4}";     		//entre 2 y 4 letras mayusculas
		String regex = "[A-Za-z]{2-4}";  		//entre 2 y 4 letras mayusculas y minusculas
		String regex = "[A-Za-z]{4}[0-9]*"; 	//4 letras mayusculas o minusculas y 0,1 o mas numeros
		String regex = "[0-9]{8}[A-Za-z]";      //Validar un dni, 8 numeros y 1 letra
		String regex = "^[0-9]{8}[A-Za-z]$";	//empieza por 8 numeros y termna por 1 letra
		String regex = "[0-9]{8}-[A-Za-z]";		//con un guion en medio de los numeros y letras
		String regex = "L[0-9]{2,3}-[A-Za-z]";	//Una L mayuscula, luego de 2 a 3 numeros un guion y una letra mayuscula o minuscula
		String regex = "[^A]{2}";				//2 caracteres cualquieras que no tengan A
		String regex = "(L|l)[A-Z]{2}";			//L o l y despues 2 letras mayusculas
		*/
		
		System.out.println("Anota cadena: ");
		cadena=sc.nextLine();
		
		if(cadena.matches(regex)) {
			System.out.println("Cadena correcta");
		}else {
			System.out.println("La cadena no se ajusta al patrón");
		}
	}

}
