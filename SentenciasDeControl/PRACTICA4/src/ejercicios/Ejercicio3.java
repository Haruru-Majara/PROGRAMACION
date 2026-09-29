package ejercicios;

import java.util.Scanner;

/**
 * Programa que lee tres números y permite al usuario elegir si quiere verlos
 * ordenados en forma ascendente o descendente
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n1,n2,n3;
		char opcion;
		
		System.out.println("Introduce primer número: ");
		n1=sc.nextInt();
		System.out.println("Introduce segundo número: ");
		n2=sc.nextInt();
		System.out.println("Introduce tercer número: ");
		n3=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("¿Quieres mostrarlos en orden ascendente o descendente? (A o D)");
		opcion=sc.nextLine().charAt(0);
		
		switch(opcion) {
		case 'A':
		case 'a':
			if(n1>n2 && n1>n2 && n2>n3) 
				System.out.println(n3+","+n2+","+n1);
			else 
				if(n1>n2 && n1>n3 && n2<n3) 
					System.out.println(n2+","+n3+","+n1);
				else 
					if(n2>n1 && n2>n3 && n1>n3) 
						System.out.println(n3+","+n1+","+n2);
					else 
						if(n2>n1 && n2>n3 && n1<n3) 
							System.out.println(n1+","+n3+","+n2);
						else 
							if(n3>n1 && n3>n2 && n1>n2) 
								System.out.println(n2+","+n1+","+n3);
							else 
								System.out.println(n1+","+n2+","+n3);
			break;
		case 'D':
		case 'd':
			if(n1<n2 && n1<n2 && n2<n3) 
				System.out.println(n3+","+n2+","+n1);
			else 
				if(n1<n2 && n1<n3 && n2<n3) 
					System.out.println(n2+","+n3+","+n1);
				else 
					if(n2<n1 && n2<n3 && n1<n3) 
						System.out.println(n3+","+n1+","+n2);
					else 
						if(n2<n1 && n2<n3 && n1<n3) 
							System.out.println(n1+","+n3+","+n2);
						else 
							if(n3<n1 && n3<n2 && n1<n2) 
								System.out.println(n2+","+n1+","+n3);
							else 
								System.out.println(n1+","+n2+","+n3);
			break;
		default:
			System.out.println("Esta opción no existe.");
		}
	}

}
