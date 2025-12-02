package ejbasicos;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primero,division,resto,multiplicacion;
		final int segundo; //final significa fija o constante, no deja cambiarlo
		final double PI=3.1416;
		
		primero=7;
		segundo=2; //Si le das la asignacion aqui en lugar de arriba, se queda con esta y no cambia
		
		primero++; //Esto es equivalente a hacer: primero=primero+1;
		primero--; //Esto es equivalente a hacer: primero=primero-1;
		
		division=primero/segundo;
		System.out.println("La división es:"+division);
		
		//Calculo el resto de vividir primero entre segundo
		resto=primero%segundo;
		System.out.println("El resto es:"+resto);
		
		multiplicacion=primero*segundo;
		System.out.println("EL producto es:"+multiplicacion);
		
		primero=primero+5; //Esto es equivalente a: primero=+5; CUIDADO CON PONER!: primero+=5;
		//primero=+5 le asigna el valor 5
		//primero+=5 le suma 5 al numero que ya tenia
		System.out.print("Así se queda en la misma linea");
		System.out.println("\tEsto es un espacio en la misma linea");
		System.out.println("Esto cambia la linea");
		System.out.println("La division "+
								"es: "+
									division);//Tambien se puede cortar de esta manera si la frase es muy larga
		
	}

}
