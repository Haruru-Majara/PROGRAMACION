package ejemplos;

public class EjemploCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra='m';
		
		// char es 'm'
		// string es "m"
		
		//Mayúscula
		letra=Character.toUpperCase(letra);
		System.out.println(letra);
		
		//Es Mayúscula?
		if(Character.isUpperCase(letra)==true)
			System.out.println("Es mayuscula");
		else
			System.out.println("Es minuscula");
		
		//Minúscula
		letra=Character.toLowerCase(letra);
		System.out.println(letra);
		
		//Es digito?
		if(Character.isDigit(letra))
			System.out.println("Es un digito");
		else
			System.out.println("No es un digito");
	}

}
