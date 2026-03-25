package Ej5_Poligono;

public abstract class  Poligono {
	protected double area;
	protected double perimetro;
	private int numeroLados;
	
	public Poligono(int lados) {
		numeroLados=lados;
	}
	
	abstract public void hallarArea();
	abstract public void hallarPerimetro();
	
}
	

