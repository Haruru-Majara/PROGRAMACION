package examenarrays;

import java.util.Arrays;
import java.util.Scanner;

public class examenarrays13126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double positivas[]=new double[10];
		double negativas[]=new double[10];
		double temperatura;
		int contp=0, contn=0;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			System.out.println("Anota temperatura: ");
			temperatura=sc.nextDouble();
			if (temperatura>=0) {
				positivas[contp]=temperatura;
				contp++;
			}
			else {
				negativas[contn]=temperatura;
				contn++;
			}
		}
		System.out.println("Las temperaturas positivas son: ");
		for (int i=0;i<contp;i++)
			System.out.println(positivas[i]);
		System.out.println("Las temperaturas negativas son: ");
		for (int i=0;i<contn;i++)
			System.out.println(negativas[i]);
		
		Arrays.sort(positivas,0,contp);
		Arrays.sort(negativas);
		
		System.out.println("Las temperaturas ordenadas --------");
		System.out.println("Las temperaturas positivas son: ");
		for (int i=0;i<contp;i++)
			System.out.println(positivas[i]);
		System.out.println("Las temperaturas negativas son: ");
		for (int i=0;i<contn;i++)
			System.out.println(negativas[i]);
		
		System.out.println("Introduce temperatura a buscar: ");
		temperatura=sc.nextDouble();
		
		if (temperatura>=0) {
			if (buscar(positivas,contp,temperatura)!=-1)
				System.out.println("La temperatura está en el array de positivas");
			else
				System.out.println("Temperatura no encontrada");
		}
		
		else {
			if (buscar(negativas,contn,temperatura)!=-1)
				System.out.println("La temperatura está en el array de positivas");
			else
				System.out.println("Temperatura no encontrada");
		}
		
	}
	public static int buscar(double temp[], int tam, double t) {
		for(int i=0;i<tam;i++)
			if (temp[i]==t)
				return i;
		return -1;
	}
}
