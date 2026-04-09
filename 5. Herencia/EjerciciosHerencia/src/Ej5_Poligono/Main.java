package Ej5_Poligono;

import java.util.Scanner;

public class Main {

	static Scanner  sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op,cont=0, lado1, lado2, base, altura;

		Poligono misPoligonos []=new Poligono[5];
		
		for (int i=0;i<4;i++) {
			op=menu();
			
			if (op == 4) {
				System.out.println("Saliendo del programa...");
				break;
			}
			
			switch(op) {
			
				case 1:
					System.out.println("Introduce lado del cuadrado");
					lado1=sc.nextInt();
					misPoligonos[i]=new Cuadrado(lado1);
					break;
				case 2:
					System.out.println("Introduce base del rectangulo");
					base=sc.nextInt();
					System.out.println("Introduce altura del rectangulo");
					altura=sc.nextInt();
					misPoligonos[i]=new Rectangulo(base,altura);
					break;
				case 3:
					System.out.println("Introduce primer lado del triangulo");
					lado1=sc.nextInt();
					System.out.println("Introduce segundo lado del triangulo");
					lado2=sc.nextInt();
					System.out.println("Introduce base del triangulo");
					base=sc.nextInt();
					System.out.println("Introduce altura del triangulo");
					altura=sc.nextInt();
					misPoligonos[i]=new Triangulo(lado1,lado2,base,altura);
					break;
			}
			misPoligonos[i].hallarArea();
			misPoligonos[i].hallarPerimetro();
			System.out.println(misPoligonos[i].toString());
	   }
	   
		
	}
	
	public static int menu() {
		int opcion;
		do {
		System.out.println("1. CUADRADO");
		System.out.println("2. RECTANGULO");
		System.out.println("3. TRIANGULO");
		System.out.println("4. SALIR");
		System.out.println("Teclea tu opción: ");
		opcion=sc.nextInt();
		}while (opcion<1 || opcion>4);
		return opcion;
	}

}
