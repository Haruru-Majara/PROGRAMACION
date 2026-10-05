package ejemplos_casting;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		double b;
		
		//CONVERSIÓN IMPLÍCITA
		
		b=a;
		System.out.println("La var a: "+a);
		System.out.println("La var b: "+b);
		
		//CONVERSIÓN EXPLÍCITA
		
		b=7.9;
		a=(int) b;
		
		System.out.println("La var a: "+a);
		System.out.println("La var b: "+b);
		
	}

}
