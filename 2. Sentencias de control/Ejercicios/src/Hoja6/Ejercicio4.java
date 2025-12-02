package Hoja6;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalRecaudado=0,compra,maximo=0;
		int  adultos, niños, totalEntradas;
		boolean tarifaReduc;
		final double AD=3,INF=2,RAD=2,RINF=1.2;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Número de adultos: ");
			adultos=sc.nextInt();
			System.out.println("Número de niños: ");
			niños=sc.nextInt();
			System.out.println("¿Tienes tarifa reducida?: (true/false)");
			tarifaReduc=sc.nextBoolean();
			
			if (tarifaReduc) 
				compra=adultos*RAD+niños*RINF;
			
			else
				compra=adultos*AD+niños*INF;
				
			totalEntradas=adultos+niños;
			
			if (totalEntradas > maximo)
				maximo=totalEntradas;
			System.out.println("Tienes que pagar: "+compra);
			totalRecaudado +=compra;
		}while(totalRecaudado<=100);
		System.out.println("Total recaudado: "+totalRecaudado);
		System.out.println("El grupo que más entradas ha comprado, ha comprado un total de: "+maximo+" entradas.");
	}

}
