package ejemplos;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uno="Estoy probando String";
		String dos="Otro";
		int num;
		
		//Si a un String no le pasar valor es null,no hay nada
		//no hay espacio asignado para el null es diferente de " "
		
		//Longitud de un String
		num=uno.length();
		System.out.println("Longitud: "+num);
		
		//Comparar si son iguales
		if(uno.equals(dos))
			System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
		
		//Comparar si alfabeticamente son iguales
		System.out.println(uno.compareTo(dos));
		/*Devuelve:
		 * 0 si son iguales
		 * <0 a<b uno es menor que dos
		 * >0 a>b uno es mayor que dos
		 * */
	}

}
