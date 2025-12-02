package ejemplos_switch;

import java.util.Scanner;

public class ejemploswitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int puesto;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu puesto en la carrera: ");
		puesto=sc.nextInt();
/*		
		if (puesto ==1)
			System.out.println("ORO");
		else
			if (puesto == 2)
				System.out.println("PLATA");
			else
				if (puesto == 3);
					System.out.println("BRONCE");
				else
					System.out.println("No tienes premio.");
*/		
		switch(puesto) {
		case 1:
			System.out.println("ORO");
			break; // es como para parar de leer y saltar a otro case, sino sigue leyendo todo
		case 2:
			System.out.println("PLATA");
			break;
		case 3:
			System.out.println("BRONCE");
			break;
		case 4: //varios case juntos toman la misma variable ya que no llevan break ni tampoco un sysout
		case 5:
		case 6:
			System.out.println("DIPLOMA");
			break;
		default: // No tiene porque haber default en un switch pero siempre puede ser mejor ponerlo
			System.out.println("No tienes premio.");
		}
		System.out.println("Fin del programa.");
	}

}
