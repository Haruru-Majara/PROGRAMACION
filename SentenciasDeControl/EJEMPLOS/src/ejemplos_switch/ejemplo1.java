package ejemplos_switch;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int puesto;
		
		System.out.println("Introduce puesto: ");
		puesto=sc.nextInt();
		
		switch (puesto) {
		case 1:
			System.out.println("ORO");
			break;
		case 2:
			System.out.println("PLATA");
			break;
		case 3:
			System.out.println("BRONCE");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("DIPLOMA");
		default:
			System.out.println("SIN PREMIO");
			break;
		}
		
		/*
		if(puesto==1)
			System.out.println("ORO");
		else
			if(puesto==2)
				System.out.println("PLATA");
			else
				if(puesto==3)
					System.out.println("BRONCE");
				else
					System.out.println("SIN PREMIO");
		*/
	}

}
