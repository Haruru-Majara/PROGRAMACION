package ejemplos;

import java.util.Scanner;

public class OrdenarCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String nA1,nA2;
		
		System.out.println("Anota nombre del alumno 1:");
		nA1=sc.nextLine();
		System.out.println("Anota nombre del alumno 2:");
		nA2=sc.nextLine();
		
		System.out.println("Listado en orden: ");
		
		if(nA1.compareToIgnoreCase(nA2)==0) //iguales
			System.out.println("Son iguales");
		else {
			if(nA1.compareToIgnoreCase(nA2)<0) { //primero antes que segundo
				System.out.println(nA1);
				System.out.println(nA2);
			}else { //segundo antes que primero
				System.out.println(nA2);
				System.out.println(nA1);
			}
		}
	}

}
