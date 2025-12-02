package ejemplos_funciones;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("Anota un número: ");
		num=sc.nextInt();
		
		if (num<0 || num>=100)
			System.out.println("Número incorrecto.");
		}while(num<0 || num>=100);
		
		escribir(num);
		System.out.println("Fin del programa.");
	}
	
	public static void escribir(int n) { //void no retorna nada, acaba cuando sus instrucciones terminan
		for (int i=1;i<=n;i++) {
			System.out.println("Módulo ejecutándose "+i);
		}
		
	}
}
