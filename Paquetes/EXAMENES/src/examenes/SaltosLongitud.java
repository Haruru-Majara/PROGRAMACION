package examenes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Se quieren procesar las marcas de varios saltadores de longitud en una prueba.
 * 
Por cada atleta se anotan los siguientes datos:

- Su dorsal: validar que sea una cadena de longitud 6, con 3 letras en
mayúsculas, que es el país, y 3 dígitos. Leedlo hasta que sea correcto. Usad
una función para validar el código (1 pto)

- Su categoría: M (masculino) o F (femenino), leedla hasta que sea correcta
(0,5 pto).

- A continuación el atleta realiza 3 saltos de longitud (usad bucle) (1 ptos).

	Codificar una función que me diga si un salto es nulo (1 pto)
	Tenemos en cuenta que se considera un salto nulo:
	
		Por debajo de 6.82 metros en categoría femenina.
		Por debajo de 8.22 metros en categoría masculina.
		
	Si los tres saltos son nulos, o se anota un -1 en la longitud de uno de los
	saltos, el atleta queda descalificado en ese momento y se pasa al siguiente. (1 pto) En
	otro caso nos quedamos con la longitud del salto mayor de este atleta y lo mostramos
	por pantalla.(1 pto)
	
El proceso termina cuando se hayan anotado al menos 2 atletas de cada categoria.(1
pto)

Mostrad al terminar:
- El mejor salto femenino y el país de procedencia de la atleta. (1 pto)
- La longitud media de los saltos los atletas masculinos (1 pto)
- El total de saltos nulos realizados.(0,5 pto)

Modificad el programa para que el usuario pueda introducir tantas pruebas de salto
como quiera, mostrando al finalizar el número total de saltos realizados . (1 pto)
 * */

public class SaltosLongitud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		String dorsal,paisMejorSaltoFem="";
		boolean dorsalCorrecta,categoriaCorrecta,nulo;
		char categoria;
		double salto,saltoMayor=0,saltoMayorF=0,mediaSaltosMasc=0;
		int nuloCont=0,catM=0,catF=0,contAtletas=1,saltoCont=0,nuloContAtleta=0;
		
		
		//Anotar y validar el dorsal
		do {
			System.out.println("---Atleta "+contAtletas+"---");
			do {
				System.out.println("Anota el dorsal (3 letras mayúsculas y 3 números):");
				dorsal=sc.nextLine();
				
				dorsalCorrecta=validarDorsal(dorsal);
				
				if(!dorsalCorrecta)
					System.out.println("Dorsal incorrecta.");
			}while(!dorsalCorrecta);
			
			//Anotar y validar categoria
			do {
				System.out.println("Anota categoria (M o F):");
				categoria=Character.toUpperCase(sc.nextLine().charAt(0));
				
				if(categoria=='M' || categoria=='F') {
					System.out.println("Categoría correcta");
					categoriaCorrecta=true;
				}else {
					System.out.println("Categoria incorrecta");
					categoriaCorrecta=false;
				}
					
			}while(!categoriaCorrecta);
			
			//Hacer recuento de atletas femeninos y masculinos
			
			if(categoria=='M')
				catM++;
			else
				catF++;
			
			//Realizar bucle para saltos y clasificarlos
			
			for(int i=1;i<=3;i++) {
				System.out.println("Salto "+i+":");
				salto=sc.nextDouble();
				
				nulo=saltoNulo(categoria,salto);
				
				
				if(nulo) {
					System.out.println("El salto ha sido nulo");
					nuloCont++;
					nuloContAtleta++;
				}
				if(salto==-1) {
					System.out.println("Descalificado");
					break;
				}
				
				if(salto>=saltoMayor)
					saltoMayor=salto;
				
				if(categoria=='F') {
					if(saltoMayor>saltoMayorF) {
						saltoMayorF=saltoMayor;
						paisMejorSaltoFem=dorsal.substring(0, 3);
					}
				}
				
				if(categoria=='M' && salto>0) {
					mediaSaltosMasc=mediaSaltosMasc+salto;
					saltoCont++;
				}
		}
			sc.nextLine();
			//Contabilizar los nulos y decidir 
			if(nuloContAtleta==3){
				System.out.println("Descalificado");
				break;
			}else
				System.out.println("El mejor salto ha sido: "+saltoMayor);
		
			contAtletas++;
			saltoMayor=0;
			nuloContAtleta=0;
			System.out.println("");
			
		}while(catM<2 && catF<2);
		
		mediaSaltosMasc=mediaSaltosMasc/saltoCont;
		
		System.out.println("El mejor salto femenino ha sido: "+saltoMayorF+"m y su país es: "+paisMejorSaltoFem);
		
		System.out.println("La media de saltos masculinos es: "+mediaSaltosMasc);
		
		System.out.println("Ha habido "+nuloCont+" saltos nulos.");
	}
	
	public static boolean validarDorsal(String dorsal) {
		return dorsal.matches("^[A-Z]{3}[0-9]{3}");
	}
	
	public static boolean saltoNulo(char categoria,double salto) {
		if(categoria=='F' && salto<6.82)
			return true;
	
		if(categoria=='M' && salto<8.22)
			return true;
	
		return false;
	}
}

