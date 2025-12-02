package ejemplos;

import java.util.Scanner;

public class examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char nivel;
		int edad, dias;
		double impMes = 0, total;
		final double IMPA=450, IMPB=400, IMPC=350;
		boolean canarias=true;
		boolean becario=true;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el nivel del país destino A, B o C: ");
		nivel=sc.nextLine().charAt(0);
	
		
		switch (nivel) {
		case 'A':
		case 'a':
			impMes=IMPA;
		break;
		case 'B':
		case 'b':
			impMes=IMPB;
		break;
		case 'C':
		case 'c':
			impMes=IMPC;
		break;
		default:
			System.out.println("NIVEL INCORRECTO");
			//System.exit(0); //se sale fuera del programa
		}
		//solo continuo si el nivel es correcto
		if (impMes !=0) {
			System.out.println("Introduce la edad: ");
			edad=sc.nextInt();
			if (edad<18)
				impMes=impMes+250;
			else {
				System.out.println("Tienes la beca MEC? (true/false)");
				becario=sc.nextBoolean();
				System.out.println("Vives en canarias? (true/false)");
				becario=sc.nextBoolean();
				if (becario || canarias)
					impMes=impMes+100;
			}
			
			System.out.println("Dias de tu movilidad: ");
			dias=sc.nextInt();
			if (dias <60 || dias >90)
				System.out.println("Número de días incorrecto.");
			//Si los dias son correctos entro en el else
			else {
				total=(dias/30)*impMes+(dias%30)*impMes/30;
				System.out.println("Va a cobrar: "+total+" euros");
				if (total!=(int)total)
					System.out.println("Tiene decimales");
			}
		}
		
	}

}
