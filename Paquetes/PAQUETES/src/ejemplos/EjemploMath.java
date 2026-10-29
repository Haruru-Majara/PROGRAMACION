package ejemplos;

public class EjemploMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=7,resul,resul1;
		
		//Raiz cuadradra
		resul=Math.sqrt(num);
		System.out.println("La raíz cuadrada de "+num+" es "+resul);
		
		//Potencia
		resul=Math.pow(3,4);
		System.out.println("La potencia es: "+resul);
		
		//Random
		resul=Math.random()*10; //(0-9)
		System.out.println("El número aleatorio es: "+resul);
		
		//Round - Redondear
		resul1=Math.round(resul);
		System.out.println("El redondeo es: "+resul1);
		
		//Redondear por arriba
		resul1=Math.ceil(resul);
		System.out.println("El redondeo por arriba es: "+resul1);
		
		//Redondear por abajo
		resul1=Math.floor(resul);
		System.out.println("El redondeo por abajo es: "+resul1);
		
	}

}
