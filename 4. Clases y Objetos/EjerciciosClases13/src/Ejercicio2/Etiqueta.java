package Ejercicio2;

public class Etiqueta {
	
	private int ancho, alto;
	private char letra;
	
	public void setLetra (char nueva) {letra=nueva;}
	
	public Etiqueta (char l, int al, int an) {
		this.letra=l;
		ancho=an;
		alto=al;
	}

	public void dibujar () {
		for (int l=1; l<=alto;l++) {
			for (int i=1;i<=ancho;i++)
				System.out.print(letra);
			System.out.println();
		}
	}

}
