package ejemploteoria;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, altura, IMC;
		
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		System.out.println("Introduce tu peso: ");
		peso=sc.nextDouble();
		System.out.println("Introduce tu altura: ");
		altura=sc.nextDouble();
		
		IMC=peso/(altura*altura);
		
		if ( IMC > 40)
			System.out.println("Obesidad mórbida (obesidad de grado IV)");
		else
			
			if ( IMC > 35)
				System.out.println("Obesidad premórbida (obesidad de grado III)");
			else
				
				if ( IMC > 30 )
					System.out.println("Sobrepeso crónico (obesidad de grado II)");
				else
					
					if ( IMC > 25 )
						System.out.println("(Obesidad de grado I)");
					else
						
						if ( IMC > 18 )
							System.out.println("Peso normal (saludable)");
						else
							
							if ( IMC > 17 )
								System.out.println("Bajo peso");
							else
								
								if ( IMC > 16 )
									System.out.println("Infrapeso");
								else
									System.out.println("Criterio de ingreso en hospital");
	}

}
