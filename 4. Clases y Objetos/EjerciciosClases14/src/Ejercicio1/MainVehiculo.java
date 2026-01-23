package Ejercicio1;

import java.util.Scanner;

public class MainVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String matricula,modelo,marca;
		int año,categoria,opc,pos,dias;
		boolean correcto=false;
		double importeAlquiler;
		
		Vehiculo vehiculos [] = new Vehiculo[2];
		
		Scanner sc=new Scanner(System.in);
		
		for (int i=0;i<vehiculos.length;i++) {
			do {
			System.out.println("Introduce matrícula: ");
			matricula=sc.nextLine();
			correcto=matricula.matches("[0-9]{4}[A-Z]{3}");
			}while(!correcto);
			
			System.out.println("Introduce marca: ");
			marca=sc.nextLine();
			System.out.println("Introduce modelo: ");
			modelo=sc.nextLine();
			System.out.println("Introduce año de compra: ");
			año=sc.nextInt();
			
			do {
				int temp;
			System.out.println("Introduce categoria 1 o 2: ");
			categoria=sc.nextInt();
			
				if (categoria != 1 || categoria != 2)
					System.out.println("Categoria erronea, vuelvela a introducir");
				
			}while(categoria!=1 || categoria!=2);
			
			vehiculos[i]=new Vehiculo(matricula,marca,modelo,año,categoria);
		}
		
		do {
			System.out.println("1.Alguilar.\n2.Devolver.\n3.Mostrar información de un coche.\n4.Mostrar información en general.\n5.Salir");
			opc=sc.nextInt();
			switch(opc) {
			case 1:
				sc.nextLine();
				System.out.println("Introduce matrícula: ");
				matricula=sc.nextLine();
				pos=buscarMatricula(vehiculos,matricula);
				if (pos==-1)
					System.out.println("No existe ese vehiculo");
				else {
					if (vehiculos[pos].isAlquilado())
						System.out.println("Ya está alquilado");
					else {
						System.out.println("Por cuántos días quieres alquilarlo?: ");
						dias=sc.nextInt();
						importeAlquiler=vehiculos[pos].alquilarVehiculo(dias);
						if (importeAlquiler==0)
							System.out.println("Error alquilando, avise a sistemas");
						System.out.println("El importe de su alquiler es: "+importeAlquiler);
					}
				}
				break;
			case 2:
				sc.nextLine();
				System.out.println("Introduce matrícula: ");
				matricula=sc.nextLine();
				pos=buscarMatricula(vehiculos,matricula);
				if (pos==-1)
					System.out.println("No existe ese vehículo");
				else
					if (vehiculos[pos].devolver())
						System.out.println("Vehículo devuelto con éxito");
					else
						System.out.println("El vehículo no estaba alquilado, no se puede devolver");
				break;
			case 3:
				sc.nextLine();
				System.out.println("Introduce matrícula: ");
				matricula=sc.nextLine();
				pos=buscarMatricula(vehiculos,matricula);
				if (pos==-1)
					System.out.println("No existe ese vehículo");
				else
					System.out.println(vehiculos[pos].toString());
				break;
			case 4:
				for (int i=0;i<vehiculos.length;i++)
					System.out.println(vehiculos[i].toString());
				break;
			case 5:
				System.out.println("Fin del programa");
				System.out.println("Total vehículos alquilados: "+Vehiculo.getTotalAlquilados());
				System.out.println("Total ganancias: "+Vehiculo.getGananciasTotales());
			default:
				System.out.println("Opción incorrecta");
			}
		}while(opc!=4);
		
	}
	/**
	 * Busca la matrícula en el array de vehículos 
	 * @param v
	 * @return Devuelve la posciión dónde ha encontrado el vehículo con esa matrícula, -1 si no lo encuentra
	 */
	public static int buscarMatricula(Vehiculo v[], String mat) {
		for(int i=0;i<v.length;i++) {
			if(v[i].getMatricula().equalsIgnoreCase(mat))
				return i;
		}
		return -1;
	}
}
