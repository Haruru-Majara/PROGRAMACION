package examenBucles21102026;

public class ejer1WhileCorregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, suma=0, contImpares=0;
		
		while(contImpares<=20) {
			if(i%2!=0) {
				suma=suma+i;
				contImpares++;
			}
			i++;
		}
		System.out.println("La media es: "+(double)suma/20);
	}

}
