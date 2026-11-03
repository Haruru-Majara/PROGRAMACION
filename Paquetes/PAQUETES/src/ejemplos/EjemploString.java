package ejemplos;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uno="Estoy probando String";
		String dos="     Otro   ";
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
		
		//Muestra el caracter 1 y 2 sin contar 0 ni llegar al 3
		System.out.println(dos.substring(1,3));
		
		/**Si el string es mas pequeño de lo que quieres mostrar saldra
		la excepcion de StringIndexOutOfBounds -> fuera de los limites*/
		
		//Devuelve el caracter que esté en la posicion indicada
		System.out.println(dos.charAt(2));
		
		for(int i=0;i<uno.length();i++) {
			System.out.println(uno.charAt(i));
		}
		
		//Replace reemplaza el string antiguo por uno nuevo
		String resultado=uno.replace("r","l");
		System.out.println(resultado);
		
		//Pasar a mayusculas y minusculas
		resultado=resultado.toUpperCase();
		System.out.println(resultado);
		resultado=resultado.toLowerCase();
		System.out.println(resultado);
		
		//Quitar los blancos del string
		System.out.println("Dos antes de quitar los blancos:"+dos+".");
		System.out.println("Dos antes de quitar los blancos:"+dos.trim()+".");
		
		//buscar una cadena en otra, si no la encuentra retorna -1
		int pos=uno.indexOf("ban");
		System.out.println(pos);
		pos=uno.indexOf("bar");
		System.out.println(pos);
	}

}
