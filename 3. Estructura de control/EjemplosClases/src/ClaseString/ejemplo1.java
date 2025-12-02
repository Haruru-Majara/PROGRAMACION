package ClaseString;

public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="Hola";
		String cadena2="Vamonos";
		String cadena3="vamonos";
		//String cadena=new String("Esta es una cadena");
		String resultado="";
		String hola; //Su valor ahora es null
		
		System.out.println("resultado:"+resultado);
		System.out.println("El tamaño de cadena2 es: "+cadena2.length());
		if (cadena.equals(cadena2)==true) //cadena2.equals (cadena)
			System.out.println("cadena y cadena2 tienen el mismo valor");
		else
			System.out.println("cadena y cadena2 no tienen el mismo valor");
		
		int r=cadena.compareTo(cadena2);
		System.out.println(r);
		r=cadena2.compareTo(cadena);
		System.out.println(r);
		r=cadena2.compareToIgnoreCase(cadena3);
		System.out.println(r);
		System.out.println("Subsstring: "+cadena2.substring(2,6));
		System.out.println("Subsstring: "+cadena2.substring(0,3));
		// System.out.println("Subsstring: "+cadena2.substring(2,10)); esto es un ERROR
		System.out.println("Subsstring: "+cadena2.substring(cadena2.length()-4,cadena2.length()));
		System.out.println(cadena2.charAt(1));
		int cont=0;
		for(int i=0;i<cadena2.length();i++) {
			System.out.println(cadena2.charAt(i));
			if (cadena2.charAt(i)=='o')
				cont++;
		}
		System.out.println("La cadena tiene "+cont+" oes");
		/*System.out.println("hola:"+hola);
		
		resultado=cadena2.substring(3, 6);
		
		System.out.println("Resultado de substring:"+resultado);
		 */
	}

}
