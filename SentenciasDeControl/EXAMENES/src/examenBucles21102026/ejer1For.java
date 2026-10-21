package examenBucles21102026;

/**
 *Calcula la media de los 20 primeros impares. 
 * */

public class ejer1For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,cont=1,acum=1,media;
		
		for(int i=1;i<19;i++) {
			num=num+2;
			acum=acum+num;
			cont++;
		}
		media=acum/cont;
		System.out.println("La media es: "+media);
	}

}
