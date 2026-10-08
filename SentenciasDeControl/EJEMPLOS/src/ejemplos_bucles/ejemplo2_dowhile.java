package ejemplos_bucles;

import java.util.Scanner;

public class ejemplo2_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char car;
		
		do {
			System.out.println("Anota un caracter");
			car=sc.nextLine().charAt(0);
		}while(car!='*' && car!='+' && car!='-' && car!='/');
		
		//Salgo si car=='*' || car=='+' || car=='-' || car=='/'
		
		System.out.println("Fin del programa");
	}

}
