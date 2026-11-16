package examenes;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class SupermercadoCorregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		sc.useLocale(Locale.ENGLISH);
		
		double importeDisp,importeAct=0,precioUnidad,precio;
		String codigo;
		boolean correcto,domicilio;
		int unidades;
		
		System.out.println("Anota el importe del que dispones: ");
		importeDisp=sc.nextDouble();
		
		
		do {
			sc.nextLine(); //Limpio buffer
			do {
				System.out.println("Anota codigo: ");
				codigo=sc.nextLine();
				
				if(codigo.equalsIgnoreCase("fin"))
					break;
				
				correcto=validarCodigo(codigo);
				
				if(!correcto)
					System.out.println("Codigo incorrecto");
				
			}while(!correcto);
			
			if(!codigo.equalsIgnoreCase("fin")) {
				//Calculo unidades
				unidades=r.nextInt(1,5);
				//unidades=r.nextInt(4)+1;
				System.out.println("Unidades: "+unidades);
				do {
					System.out.println("Introduce precio unidad: ");
					precioUnidad=sc.nextDouble();
					if(precioUnidad<=0)
						System.out.println("Tiene que ser un número positivo");
				}while(precioUnidad<=0);
				
				precio=calcularPrecio(codigo,unidades,precioUnidad);
				if(importeAct+precio<=importeDisp) {
					System.out.println("Producto aceptado");
					importeAct=importeAct+precio;
				}else
					System.out.println("Producto anulado, no tienes suficiente dinero");
			}
			
		}while(!codigo.equalsIgnoreCase("fin"));
		
		System.out.println("En total te has gastado: "+importeAct+" euros, en productos");
		System.out.println("Desea envidio a domicilio? (true/false)");
		domicilio=sc.nextBoolean();
		
		if(domicilio) {
			
		}
		System.out.println("Total a pagar: "+importeAct);
	}
	
	public static boolean validarCodigo(String cod) {
		//si el codigo se adapta retorna true si no false
		return cod.matches("^P[A-Za-z][0-9]{3}$");
	}
	public static double calcularPrecio(String codigo, int uni,double pUni) {
		double precio;
		char seccion=codigo.charAt(1);
		
		if(seccion=='P')
			precio=uni*pUni*0.8;
		else
			if(seccion=='L') 
				precio=pUni*(uni-uni/3);
			else
				precio=pUni*uni;
		
		return precio;
	}
}
