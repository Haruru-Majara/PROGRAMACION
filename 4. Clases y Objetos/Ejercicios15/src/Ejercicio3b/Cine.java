package Ejercicio3b;

import java.util.LinkedList;

public class Cine {
	private LinkedList <Usuario> cola;
	private int aforo,vendidas;
	
	public Cine(int aforo) {
		this.aforo = aforo;
		cola=new LinkedList<Usuario>();
	}
	
	public void llegarCola(String n, int num) {
		Usuario us=new Usuario(n,num);
		cola.add(us);
	}

	public void comprarEntradas() {
		
		Usuario us=cola.removeFirst();
		int resto= us.comprar();
		if (us.comprar()) {
			System.out.println("Se ha podido realizar la compra de las entradas.");
			usuarios.removeFirst();
		}
		
		if (usuarios.get(0).comprar()) {
			System.out.println("Siguiente en la cola: "+usuarios.get(0).toString());
			System.out.println("Se ha podido realizar la compra de las entradas.");
			usuarios.removeFirst();
			
			if (Usuario.getEntradasDisp()==0) {
				usuarios.clear();
			    opc=4;
			}
		}
		else {
			System.out.println("Siguiente en la cola: "+usuarios.get(0).toString());
			System.out.println("No se ha podido realizar la compra de las entradas");
			
		}
	}
}
