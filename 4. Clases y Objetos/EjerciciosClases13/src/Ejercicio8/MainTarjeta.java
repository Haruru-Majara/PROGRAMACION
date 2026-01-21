package Ejercicio8;

public class MainTarjeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarjeta t1=new Tarjeta("657876","Victoria Manso","1234",38.50);
		Tarjeta t2=new Tarjeta("650000","Joan Ayala","4321",70.80);
		
		System.out.println("INFORMACIÓN INICIAL:");
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println("\nt1 quiere pagar con la clave 1111 y 5 euros");
		
		if (t1.pagar("1111", 5)==false)
			System.out.println("No se ha podido realizar el pago");
		else
			System.out.println("Se ha podido realizar el pago");
		
		System.out.println("\nt1 quiere recargar su saldo con 20 euros");
		
		if (t1.recargar(20))
			System.out.println("Se ha actualizado el saldo de tu tarjeta");
		else
			System.out.println("No se ha podido actualizar el saldo de tu tarjeta");
		
		System.out.println("\na t1 vamos a bloquearle la tarjeta");
		
		if (t1.bloquear()) 
			System.out.println("Tarjeta t1 bloqueada correctamente");
		else
			System.out.println("La tarjeta t1 ya estaba bloqueada");
		
		System.out.println("\nVamos a intentar pagar con t1 con sus credenciales buenas");
		
		if (t1.pagar("1234", 5)==false)
			System.out.println("No se ha podido realizar el pago");
		else
			System.out.println("Se ha podido realizar el pago");
		
		System.out.println("\nVamos a desbloquear t1");
		
		if (t1.desbloquear()) 
			System.out.println("Tarjeta t1 desbloqueada correctamente");
		else
			System.out.println("La tarjeta t1 ya estaba desbloqueada");
		
	System.out.println("\nt2 quiere pagar con la clave 4321 y 10 euros");
		
		if (t1.pagar("1111", 5)==false)
			System.out.println("No se ha podido realizar el pago");
		else
			System.out.println("Se ha podido realizar el pago");
		
		System.out.println("\nt2 quiere recargar su saldo con -5 euros");
		
		if (t1.recargar(-3))
			System.out.println("Se ha actualizado el saldo de tu tarjeta");
		else
			System.out.println("No se ha podido actualizar el saldo de tu tarjeta");
		
		System.out.println("\nVamos a bloquear t2");
		
		if (t1.bloquear()) 
			System.out.println("Tarjeta t1 bloqueada correctamente");
		else
			System.out.println("La tarjeta t1 ya estaba bloqueada");
		
		System.out.println("\nVamos comparar las tarjetas");
		
		if(t1.mismaTarjeta(t2))
			System.out.println("Si son iguales");
		else
			System.out.println("No son la misma");
		
		System.out.println("\nINFORMACIÓN FINAL:");
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println("Las operaciones totales realizadas han sido: "+Tarjeta.operacionesTotales);
		System.out.println("Las operaciones totales realizadas han sido: "+t1.mismaTarjeta(t2));
	}

}
