package Ejercicio4;

public class MainRepartidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repartidor r1=new Repartidor();
		Repartidor r2=new Repartidor();
		
		r1.hacerPedido(30, 3);
		r2.hacerPedido(25, 5);
		r1.hacerPedido(33, 2);
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		System.out.println("El total de pedidos que han hecho los repartidores ha sido de: "+Repartidor.getTotalPedidos());
	}

}
