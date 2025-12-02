package ejemplos_ifelse;
import java.util.Scanner;
import java.util.Random;
public class dados {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
	        System.out.print("cuantas rondas quieres jugar?: ");
	        int r = sc.nextInt()+1;
	        sc.nextLine();
	        //dados del jugador
	        int p1 = 0;
	        int p2 = 0; 
	        int p3 = 0;
	        int p4e = 0;
	        //putnos del jugador
	        int puntosp = 0;
	        //dados de la maquina
	        int m1 = 0;
	        int m2 = 0; 
	        int m3 = 0;
	        int m4e = 0;
	        //putnos de la maquina
	        int puntosm = 0;
	       
	        	
	        	
	        for (int i = 1; i < r; i++) {	
	  

	        	System.out.println("\n \n=====================[Ronda "+i+"]=====================");
	        	

	        	System.out.println("─────────────────────────────────────");
	        	System.out.println("   Tú tienes:        " + puntosp + " puntos");
	        	System.out.println("   La máquina tiene: " + puntosm + " puntos");
	        	System.out.println("─────────────────────────────────────");
	        	System.out.println("");
	        	System.out.println("");
	        	System.out.println("Presiona [ENTER] para tirar tus dados");
	        	sc.nextLine();
	        	System.out.println("");
	        	System.out.println("");
	            p1 = rand.nextInt(6) + 1;
	            p2 = rand.nextInt(6) + 1; 
	            p3 = rand.nextInt(6) + 1;
	        	System.out.println("─────────[Dados del jugador]─────────");
	            System.out.println("Has sacado en tus dados: 🎲" + p1+" 🎲"+p2+" 🎲"+p3);
	            if (p1 == p2 || p1 == p3 || p2 == p3) {
		           	 System.out.println("✨Has sacado un dado extra✨");
		           	 
		           	 p4e = rand.nextInt(6) + 1;
			        	System.out.println("");
			        	System.out.println("");
			        	System.out.println("Presiona [ENTER] para tirar tu dado extra");
			        	sc.nextLine();
			        	System.out.println("");
			        	System.out.println("has sacado un "+ p4e+" en tu ✨Dado extra✨");
			        	System.out.println("");
			        	System.out.println("");
		           } 

	            puntosp =puntosp+( p1+p2+p3+p4e);
	            System.out.println("Ahora tienes "+puntosp+ " putnos");
	        	System.out.println("");
	        	System.out.println("");
	        	p4e = 0;
	        	
	        	
	        	
	        	m1 = rand.nextInt(6) + 1;
	            m2 = rand.nextInt(6) + 1; 
	            m3 = rand.nextInt(6) + 1;
	            System.out.println("────────[Dados de la maquina]────────");
	            System.out.println("la maquina ha sacado en sus dados: 🎲" + m1+" 🎲"+m2+" 🎲"+m3);
		           if (m1 == m2 || m1 == m3 || m2 == m3) {
			          	 System.out.println("✨Dado extra✨");
			          	 m4e = rand.nextInt(6) + 1;
			          	 System.out.println("la maquina ha sacado un "+ m4e+" en su ✨Dado extra✨");
			          } 
	            
	            puntosm = puntosm +(m1+m2+m3+m4e);
	        	System.out.println("");
	        	System.out.println("");
	            System.out.println("Ahora la maquina tiene "+puntosm+ " putnos");
	          	p4e = 0;
	 
	          	}
	        	System.out.println("");
	        	System.out.println("");
	        	System.out.println("");
	        	System.out.println("");
	        	System.out.println("Presiona [ENTER] para ver los resultados");
	        	sc.nextLine();
	        	System.out.println("");
	        	System.out.println("");
		        System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────");
		        if (puntosp > puntosm) {
		            System.out.println("🏆 Resultado: ¡Tú ganas esta partida con "+puntosp+" puntos frente a los "+puntosm+" puntos de la maquina!");
		        } else if (puntosm > puntosp) {
		            System.out.println("💻 Resultado: ¡La máquina se lleva la victoria con "+puntosm+" puntos frente a tus "+puntosp+"!");
		        } else {
		            System.out.println("⚖️ Resultado: ¡Empate totalcon "+puntosp+" puntos!");
		        }
		        System.out.println("──────────────────────────────────────────────────────────────────────────────────────────────");
	
		        	
	     
	        
	        
		
	}

}