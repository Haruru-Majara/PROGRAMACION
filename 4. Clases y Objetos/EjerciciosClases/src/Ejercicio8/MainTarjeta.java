package Ejercicio8;

public class MainTarjeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarjeta t1=new Tarjeta("657876","Victoria Manso","1234",38.50);
		Tarjeta t2=new Tarjeta("650000","Joan Ayala","4321",70.80);
		
		System.out.println("INFORMACIÓN INICIAL:");
		System.out.println(t1);
		System.out.println(t2);
		
		if (t1.pagar("1111", 5)==false)
			System.out.println("No se ha podido realizar el pago");
		else
			System.out.println("Se ha podido realizar el pago");
		
		
	}

}
