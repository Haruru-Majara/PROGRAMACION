package ejemplos_casting;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media;
		int a,b,c;
		
		a=7;
		b=4;
		c=2;
		
		//media=(a+b+c)/3.0;
		media=(double)(a+b+c)/3;
		
		System.out.println("La media es: "+media);
	}

}
