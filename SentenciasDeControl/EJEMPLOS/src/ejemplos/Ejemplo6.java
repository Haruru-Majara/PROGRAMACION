package ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double n1,n2;
		
		System.out.println("Escribe la nota de programación: ");
		n1=sc.nextDouble();
		System.out.println("Escribe la nota de marcas: ");
		n2=sc.nextDouble();
		
		if(n1>=5 && n2>=5) {
			System.out.println("Ha aprobado las dos asignaturas");
		}else {
			if(n1<5 && n2>=5) {
				System.out.println("Ha aprobado solo marcas");
			}else {
				if(n1>=5 && n2<5) {
					System.out.println("Ha aprobado solo programación");
				}else {
					System.out.println("Ha suspendido las dos asignaturas");
				}
			}
		}
	}

}
