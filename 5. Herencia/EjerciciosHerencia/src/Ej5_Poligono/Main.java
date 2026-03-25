package Ej5_Poligono;

import java.util.Scanner;

public class Main {

	static Scanner  sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op,cont=0;
		Cuadrado c=new Cuadrado(3);
		Poligono misPoligonos []=new Poligono[5];
		
		for (int i=0;i<5;i++) {
			op=menu();
			switch(op) {
				case 1:
					System.out.println("Introduce lado del cuadrado");
					int lado=sc.nextInt();
					misPoligonos[i]=new Cuadrado(lado);
					
					break;
				
				
		
		
			}
			misPoligonos[i].hallarArea();
			misPoligonos[i].hallarPerimetro();
	   }
	   
		
	}
	
	public static int menu() {
		int opcion;
		do {
		System.out.println("1. CUADRADO");
		System.out.println("2. TRIÁNGULO");
		System.out.println("3. CÍRCULO");
		System.out.println("Teclea tu opción: ");
		opcion=sc.nextInt();
		}while (opcion<1 || opcion>4);
		return opcion;
	}

}
