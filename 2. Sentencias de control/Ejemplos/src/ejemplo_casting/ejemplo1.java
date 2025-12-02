package ejemplo_casting;

public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		long b=8;
		double c=23.5;
		char letra='d';
		b=a;
		a=(int)b;
		
		//c=a;
		a=(int)c; //recortar informacion
		
		System.out.println(a);
		System.out.println(letra);
		System.out.println((int)letra);
		//siempre que paso un tipo mas pequeño en uno grande no hay problema, si es al reves si
		//entonces hacemos lo que se conoce como "casting" , eso si, se suele perder informacion
	}

}
