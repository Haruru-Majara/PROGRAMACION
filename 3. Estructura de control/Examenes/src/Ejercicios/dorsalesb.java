package Ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class dorsalesb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char categoria;
		String dorsal,pais="";
		boolean correcto;
		int catM=0,catF=0,contNulos=0;
		double salto,mayorSalto, mayorFemenino=0, sumaSaltos=0;
		
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		do {
			do {
				System.out.println("Anota dorsal:");
				dorsal=sc.nextLine();
				correcto=validarDorsal(dorsal);
				if (correcto==false)
					System.out.println("Dorsal incorrecto");
			}while(correcto==false);
			
			do {
				System.out.println("Anota categoria (M/F)");
				categoria=sc.nextLine().charAt(0);
				if (categoria!='M' && categoria!='F')
					System.out.println("Categoría incorrecta");
			}while (categoria!='M' && categoria!='F');
			
			mayorSalto=0;
			for(int i=1; i<=3 ; i++) {
				System.out.println("Anota salto "+i+":");
				salto=sc.nextDouble();
				sc.nextLine();
				if (salto==-1) {
					mayorSalto=0;
					break;
				}
				if (esNulo(categoria,salto)) {
					System.out.println("Salto nulo");
					contNulos++;
				}
				else {
					if (salto > mayorSalto )
						mayorSalto=salto;
				}
			}
			if (mayorSalto>0) {
				System.out.println("El mayor salto del atleta ha sido:"+mayorSalto);
				if (categoria=='F' && mayorSalto > mayorFemenino) {
					mayorFemenino=mayorSalto;
					pais=dorsal.substring(0,3);
				}
				if (categoria=='M') {
					catM++;
					sumaSaltos+=mayorSalto;
				}
				else
					catF++;
			}
			else
				System.out.println("Atleta descalificado");
			
		}while(catM<2 || catF<2);
		//Salgo porque catM>=2 && catF>=2
		
		System.out.println("El mayor salto femenino ha sido de "+pais+" con longitud "+mayorFemenino);
		System.out.println("Número total de nulos:"+contNulos);
		System.out.println("El salto medio masculino es:"+ sumaSaltos/catM);

	}
	
	public static boolean validarDorsal(String d) {
		if (d.length()!=6)
			return false;
		for(int i=0;i<3;i++) {
			if (d.charAt(i)<'A' || d.charAt(i)>'Z')
				return false;
		}
		for(int i=3;i<6;i++) {
			//if (d.charAt(i)<'0' || d.charAt(i)>'9')
			if (!Character.isDigit(d.charAt(i)))
				return false;
		}
		return true;
	}
	
	public static boolean esNulo(char cat,double salto) {
		if (cat=='F' && salto<6.82)
			return true;
		if (cat=='M' && salto<8.22)
			return true;
		return false;
	}

}
