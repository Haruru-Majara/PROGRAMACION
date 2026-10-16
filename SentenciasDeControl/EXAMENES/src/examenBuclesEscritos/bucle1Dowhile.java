package examenBuclesEscritos;

import java.util.Scanner;

public class bucle1Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char letra,primeraLetra=' ';
		int cont=1;
		
		do {
			System.out.println("Introduce una letra: ");
			letra=sc.nextLine().charAt(0);
			if(cont==1)
				primeraLetra=letra;
			cont++;
		}while(letra!=primeraLetra);
		System.out.println("Ha habido "+cont+" letras distintas a la inicial.");
	}

}
