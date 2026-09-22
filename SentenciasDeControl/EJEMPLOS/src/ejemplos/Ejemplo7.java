package ejemplos;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double temp;
		System.out.println("Anota la temperatura: ");
		temp=sc.nextDouble();
		
		/**
		if (temp>30) {
			System.out.println("Natación");
		}else {   //menor o igual que 30
			if(temp>20) {
				System.out.println("Tenis");
			}else {  //menor o igual que 20
				if(temp>10) {
					System.out.println("Golf");
				}else { //menor o igual que 10
					if(temp>5) {
						System.out.println("Esquí");
					}else {
						System.out.println("Parchís");
					}
				}
			}
		}
		
		*/
		
		if(temp>30) {
			System.out.println("Natación");
		}
		if(temp>20 && temp<=30) {
			System.out.println("Tenis");
		}
		if(temp>10 && temp<=20) {
			System.out.println("Golf");
		}
		if(temp>5 && temp<10) {
			System.out.println("Esquí");
		}
		if(temp<=5) {
			System.out.println("Parchís");
		}
	}

}
