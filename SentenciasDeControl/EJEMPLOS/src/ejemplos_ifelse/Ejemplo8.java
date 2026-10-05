package ejemplos_ifelse;

/**
 * Construir un programa que calcule el índice de masa corporal 
 * de una persona
 * (IMC = peso [kg] / altura2 [m])
 * e indique el estado en el que se encuentra esa
 * persona en función del valor de IMC:
 * 
 * Valor de IMC            Diagnóstico
 * < 16                    Criterio de ingreso en hospital
 * de 16 a 17              infrapeso
 * de 17 a 18              bajo peso
 * de 18 a 25              peso normal (saludable)
 * de 25 a 30              sobrepeso (obesidad de grado I)
 * de 30 a 35              sobrepeso crónico (obesidad de grado II)
 * de 35 a 40              obesidad premórbida (obesidad degrado III)
 * >40                     obesidad mórbida (obesidad de grado IV)
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double peso,altura,imc;
		
		System.out.println("Escribe tu peso: ");
		peso=sc.nextDouble();
		System.out.println("Escribe tu altura: ");
		altura=sc.nextDouble();
		
		imc=peso/(altura*altura);
		
		if(imc < 16) {
			System.out.println("Criterio de ingreso en hospital");
		}else {
			if(imc<17) {
				System.out.println("Infrapeso");
			}else {
				if(imc<18) {
					System.out.println("Bajo peso");
				}else {
					if(imc<25) {
						System.out.println("Peso normal");
					}else {
						if(imc<30) {
							System.out.println("Sobrepeso");
						}else {
							if(imc<35) {
								System.out.println("Sobrepeso crónico");
							}else {
								if(imc<=40) {
									System.out.println("Obesidad premórbida");
								}else {
									System.out.println("Obesidad mórbida");
								}
							}
						}
					}
				}
			}
		}
	}

}
