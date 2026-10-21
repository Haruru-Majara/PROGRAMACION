package examenBucles21102026;

/**
 *Calcula la media de los 20 primeros impares. 
 * */

public class ejer1ForCorregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contImpares=0;
		int suma=0;
		
		for(int i=1;contImpares<=20;i++) {
			if(i%2!=0) {
				suma=suma+i;
				contImpares++;
			}
		}
		System.out.println("La media de los impares es: "+(double)suma/20);
	}

}
