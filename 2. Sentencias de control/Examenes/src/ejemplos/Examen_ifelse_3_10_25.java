package ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class Examen_ifelse_3_10_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio=0, litros=0, precioLitro=0;
		final double GAS=1.52, DIE=1.38, BIO=1.71,pagar;
		char tipoCar;
		boolean correcto=true;
		int opcion;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		System.out.println("Introduce tipo carburante: (G,D,B)");
		tipoCar=sc.nextLine().charAt(0);
		
		switch(tipoCar) {
		case 'G':
		case 'g':
			precioLitro=GAS;
			break;
		case 'D':
		case 'd':
			precioLitro=DIE;
			break;
		case 'B':
		case 'b':
			precioLitro=BIO;
			break;
		default:
			System.out.println("Tipo de combustible incorrecto");
			correcto=false;
		}
		
		if (correcto) {
			System.out.println("Eligir \n1.Llenar depósito\n2.Importe");
			opcion=sc.nextInt();
			if (opcion==1) {
				System.out.println("Introduce litros a repostar: ");
				litros=sc.nextDouble();
				if (litros>100) {
					System.out.println("Número de litros incorrecto.");
					correcto=false;
				}
				else {
					precio=litros*precioLitro;
					System.out.println("Precio: "+precio);
				}
			}
			else
				if (opcion==2) {
					System.out.println("Introduce importe a repostar: ");
					precio=sc.nextDouble();
					if (precio%5==0 && precio>=10 && precio<=150) {
						litros=precio/precioLitro;
						System.out.println("Vas a repostar: "+litros+" estos litros");
					}
					else {
						System.out.println("Importe incorrecto");
						correcto=false;
					}
					
				}
				else {
					System.out.println("Opción introducida incorrecta");
					correcto=false;
				}
			if (correcto==true) {
				if (litros>=10 && litros<=20)
					if (tipoCar=='B' || tipoCar=='b' || tipoCar=='D' || tipoCar=='d')
						precio=precio*0.9;
					else
						precio=precio*0.95;
			}
				else
					if (litros>20)
						precio=precio*0.8;
				System.out.println("Su precio final es: "+precio);
				System.out.println("Anote importe con el que va a realizar el pago.");
				pagar=sc.nextDouble();
				if (pagar<precio)
					System.out.println("Insuficiente dinero para pagar");
				else {
					double vueltas=pagar-precio;
					int b20=(int)(vueltas/20);
					vueltas=vueltas%20;
					int b10=(int)(vueltas/10);
					vueltas=vueltas%10;
					int b5=(int)(vueltas/5);
					vueltas=vueltas%5;
					System.out.println("Tus vueltas son: "+b20+" bill de 20 "+b10+" bill de 10 "+b5+" bill de 5 "+vueltas+" euros");
				}
		}
	}
		
}



