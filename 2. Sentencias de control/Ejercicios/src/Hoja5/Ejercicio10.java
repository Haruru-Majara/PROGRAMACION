package Hoja5;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota, contSus=0, contA=0, contN=0, contSobre=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce una nota: ");
		nota=sc.nextInt();
		
		while (nota !=-1) {
			if (nota >=0 && nota<=10)
				if (nota <5) 
					contSus=contSus+1;							
				else
					if (nota <=6) 
						contA=contA+1;				
					else
						if (nota <=8) 
							contN=contN+1;
						else 
							contSobre=contSobre+1;	
			
			System.out.println("Introduce la siguiente nota: ");
			nota=sc.nextInt();
		}
		System.out.println("El número de suspensos es: "+contSus);
		System.out.println("El número de aprobados es: "+contA);
		System.out.println("El número de notables es: "+contN);
		System.out.println("El número de sobresalientes es: "+contSobre);
			
	}

}
