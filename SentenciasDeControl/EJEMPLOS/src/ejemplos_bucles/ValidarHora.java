package ejemplos_bucles;

import java.util.Scanner;

public class ValidarHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Validar una hora
		Scanner sc=new Scanner(System.in);
		
		int h,m,s;
		
		do {
			System.out.println("Introduce hora: ");
			h=sc.nextInt();
			if(h<0 || h>23)
				System.out.println("Hora incorrecta");
		}while(h<0 || h>23);
		
		do {
			System.out.println("Introduce minutos: ");
			m=sc.nextInt();
			if(m<0 || m>59)
				System.out.println("Minutos incorrectos");
		}while(m<0 || m>59);
		
		do {
			System.out.println("Introduce segundos: ");
			s=sc.nextInt();
			if(s<0 || s>59)
				System.out.println("Segundos incorrectos");
		}while(s<0 || s>59);
		
		System.out.println("Hora leída: "+h+":"+m+":"+s);
	}

}
