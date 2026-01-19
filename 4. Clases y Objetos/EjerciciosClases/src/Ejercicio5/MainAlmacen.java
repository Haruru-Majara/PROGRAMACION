package Ejercicio5;

import Ejercicio4.Repartidor;

public class MainAlmacen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Almacen c1=new Almacen("manzana","madrid",33,1,1.2);
		Almacen c2=new Almacen("naranja","valencia",80,2,3);
		Almacen c3=new Almacen("uvas","sevilla",50,1.5,3);
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		if (Almacen.mismaProcedencia(c1, c2))
			System.out.println("Tienen la misma procedencia");
		else
			System.out.println("NO tienen la misma procedencia");
		
		System.out.println("Venta Cargamento 1: " + c1.vender(10));
		System.out.println("Venta Cargamento 2: " + c2.vender(20));
		System.out.println("Venta Cargamento 3: " + c3.vender(15));
		
		System.out.println("Beneficio total del almacén: " + Almacen.getBeneficioTotal());
	}

}
