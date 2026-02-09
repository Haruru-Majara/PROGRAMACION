package ejArrayList;

import java.util.ArrayList;

public class ejArrayList1 {

	public static void main(String[] args) {
		//Para double es Double, para char es Character String es String 
		//Cuando aparece Object en cualquier funcion, le podemos pasar lo que sea (clase)
		//ArrayList mejor para: accesos directos
		//LinkedList mejor para: inserciones y borrados
		
		ArrayList <Integer> numeros=new ArrayList<Integer>();
		System.out.println("Elementos:"+numeros.size());
		
		numeros.add(5);
		numeros.add(7);
		numeros.add(10);
		
		System.out.println(numeros); // Aqui se puede o no, poner toString()
		
		System.out.println("Elementos:"+numeros.size());
		
		numeros.add(3,8);//numeros.add(8) porque es la siguiente vacia
		numeros.add(2,8); //Añade en la posicion que le digas el objeto, moviendo los otros
		System.out.println(numeros);
		
		System.out.println("Elemento posición 1:"+numeros.get(1));
		
		numeros.set(1,3); // Reemplaza en la posicion que le digas, el objeto que le pongas
		System.out.println(numeros);
		
		System.out.println("Elemento posición 1:"+numeros.get(1));
		
		numeros.remove(0); //Borra 1 objeto del arraylist
		
		System.out.println(numeros);
		
		numeros.clear(); //Limpia todo el arraylist
		
		System.out.println(numeros);
		
		//Si aqui añades algo que no no es posible te sale la expcecion
	}

}
