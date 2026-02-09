package MansoVictoriaRA4;

import java.util.Scanner;

public class MainCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,pos;
		String matricula;
		boolean correcto=true;
		
		Scanner sc=new Scanner(System.in);
		
		CocheMan [] coches=new CocheMan[10];
		
		for (int i=0;i<coches.length;i++) {
			do {
			System.out.println("Escribe una matrícula: ");
			matricula=sc.nextLine();
			if (correcto=matricula.matches("[0-9]{4}[A-Z]{3}"))
				System.out.println("Se ha guardado correctamente.");
			}while(!correcto);
		}
		
		do {
			System.out.println("------MENÚ DE OPCIONES------");
			System.out.println("1.Reservar un vehículo.");
			System.out.println("2.Alquilar un vehículo reservado.");
			System.out.println("3.Acabar el trayecto con el vehículo.");
			System.out.println("4.Poner a libres a todos los vehículos.");
			System.out.println("5.Salir");
			opcion=sc.nextInt();
			System.out.println("-----------------------------");
			
			switch (opcion) {
			case 1:
				int numero;
				System.out.println("------Vehiculos------");
				for (int i=0;i<coches.length;i++)
					System.out.println(coches[i].toString());
				System.out.println("Selecciona el número que quieres: ");
				numero=sc.nextInt();
				numero=coches[i];
				// Aqui iria el metodo de reservar...
				break;
			case 2:
				System.out.println("Escribe la matrícula");
				matricula=sc.nextLine();
				pos=buscarMatricula(coches,matricula);
				if (pos==-1)
					System.out.println("No existe esta matrícula");
				else {
					if
				}
					
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("Fin del programa.");
				
				break;
			default:
				System.out.println("Esta opción no existe, elige otra");
			}
		}while(opcion!=5);
	}
	public static int buscarMatricula(CocheMan c[], String mat) {
		for(int i=0;i<c.length;i++) {
			if(c[i].getMatricula().equalsIgnoreCase(mat))
				return i;
		}
		return -1;
	}
}
