package Ejercicio2b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import Ejercicio1.Alumno;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		String procedencia;
		int kilos, cont = 0;
		double compraKilo;
		double ventaKilo;
		double precioRebaja;
		int opcionCargamento;
		ArrayList<Cargamento> cargamentos = new ArrayList<Cargamento>();

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);

		do {
			System.out.println("Dar de alta un cargamento: ");
			System.out.println("Introduce nombre de cargamento: ");
			nombre = sc.nextLine();
			System.out.println("Introduce procedencia de cargamento: ");
			procedencia = sc.nextLine();
			System.out.println("Introduce kilos del cargamento: ");
			kilos = sc.nextInt();
			System.out.println("Introduce precio al que compraste el kilo: ");
			compraKilo = sc.nextDouble();
			System.out.println("Introduce el precio por el que se va a vender: ");
			ventaKilo = sc.nextDouble();
			cargamentos.add(new Cargamento(nombre, procedencia, kilos, compraKilo, ventaKilo));
			sc.nextLine();
			cont++;
		} while (cont < 3);

		System.out.println("Vamos a mostrar los cargamentos: ");
		for (int i = 0; i < cargamentos.size(); i++) {
			System.out.println(cargamentos.get(i).toString());
			/*System.out.println(cargamentos);*/
		}
		
		System.out.println("¿Tienen la misma procedencia el cargamento 0 y el cargamento 1? //Con 3 casos diferentes");
		/**
		 * Los 3 metodos de abajo sirven para lo mismo,
		 * En el primero le pasamos el metodo con los 2 objetos
		 * En el segundo le pasamos el metodo desde un objeto al otro objeto
		 * En el tercero simplemente cogemos con el metodo get ambas procedencias y comparamos.
		 * */
		
		if (Cargamento.mismoCargamento(cargamentos.get(0),cargamentos.get(1)))
			System.out.println("Tienen la misma procedencia");
		
		if (cargamentos.get(0).mismoCargamento(cargamentos.get(1)))
			System.out.println("Tienen la misma procedencia");
		
		if (cargamentos.get(0).getProcedencia().equalsIgnoreCase(cargamentos.get(1).getProcedencia()))
			System.out.println("Tienen la misma procedencia");
		
		System.out.println("Introduce cantidad a rebajar: ");
		precioRebaja=sc.nextDouble();
		if (cargamentos.get(2).rebajar(precioRebaja))
			System.out.println("Se ha podido hacer la rebaja");
		
		System.out.println("Introduce la cantidad de kilos a comprar: ");
		kilos=sc.nextInt();
		double importe=cargamentos.get(2).vender(kilos);
		if (importe==0)
			System.out.println("No ha podido vender exitosamente");
		else
			System.out.println("El importe es: "+importe);
		System.out.println(Cargamento.getBeneficioTotal());
		
		//Borrar todos los cargamentos con 0 kilos pero con iterator
		Iterator<Cargamento> it=cargamentos.iterator();
		while(it.hasNext()) {
			if (it.next().getKilos()==0)
				it.remove();
		}
	}

}
