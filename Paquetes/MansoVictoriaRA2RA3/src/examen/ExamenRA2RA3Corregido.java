package examen;

import java.util.Random;
import java.util.Scanner;

public class ExamenRA2RA3Corregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int edad,minutos,personasSuper=0;
		String tipo,carnet;
		boolean otro;
		double precio,total=0;
		int nS=r.nextInt(1,5);
		int nB=r.nextInt(1,5);
		
		do {
			System.out.println("Dime tu edad: ");
			edad=sc.nextInt();
			sc.nextLine();
			if(edad<16)
				System.out.println("Tienes que tener al menos 16 años para poder alquilar");
			else {
				do {
					System.out.println("Anota tipo de patin (basico o super):");
					tipo=sc.nextLine();
					if(!tipo.equalsIgnoreCase("basico") && !tipo.equalsIgnoreCase("super"))
						System.out.println("Tipo de patin incorrecto");
				}while(!tipo.equalsIgnoreCase("basico") && !tipo.equalsIgnoreCase("super"));
				
				if(tipo.equalsIgnoreCase("basico")) {
					if(nB==0) {
						System.out.println("No quedan patines básicos, quieres uno super (true/false): ");
						otro=sc.nextBoolean();
						if(otro==true) {
							System.out.println("Te damos un patín super");
							nS--;
						}else {
							System.out.println("Otra vez será");
							continue;
						}
					}else {
						nB--;
					}
						
				}else {
					if(nS==0) {
						System.out.println("No quedan patines súper, quieres uno básico (true/false): ");
						otro=sc.nextBoolean();
						if(otro==true) {
							System.out.println("Te damos un patín basico");
							nS--;
						}else {
							System.out.println("Otra vez será");
							continue;
						}
					}else {
						nS--;
					}
				}
				System.out.println("Anota por cuántos minutos quieres alquilar el patín: ");
				minutos=sc.nextInt();
				sc.nextLine();
				
				precio=calcularPrecio(tipo,minutos);
				
				System.out.println("El precio inicial es de: "+precio);
				System.out.println("Anota carnet de socio: ");
				carnet=sc.nextLine();
				if(carnet.matches("^[A-Za-z]{3}-[0-9]{1,2}$")) {
					double descuento=Double.parseDouble(carnet.substring(4));
					precio=precio-precio*descuento/100;
					if(tipo.equalsIgnoreCase("super"))
						personasSuper++;
				}
				else {
					if(minutos/60>3)
						precio=precio*0.9;
					else
						System.out.println("No tienes descuento");
				}
				System.out.println("El precio es: "+precio);
				total=total+precio;
			}
			
		}while(nS+nB>0);
		System.out.println("El importe recaudado ha sido de: "+total);
		System.out.println("Número de socios que han alquilado patinete super: "+personasSuper);
		//}while(nS!=0 || nB!=0);
		//Salgo porque nS==0 && nB==0
	}
	public static double calcularPrecio(String tipo, int minutos) {
		int horas=minutos/60;
		double precio;
		final double BAS=5,SUP=8;
		if(minutos%60>0)
			horas++;
		
		if(tipo.equalsIgnoreCase("basico"))
			precio=horas*BAS;
		else
			precio=horas*SUP;
		
		return precio;
	}
}
