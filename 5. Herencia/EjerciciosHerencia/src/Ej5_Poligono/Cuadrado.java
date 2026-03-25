package Ej5_Poligono;

public class Cuadrado extends Poligono{
	int lado;
	
	public Cuadrado(int lado) {
		super(4);
		this.lado=lado;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hallarArea() {
		
		this.area=lado*lado;
	}

	@Override
	public void hallarPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro=lado*4;
	}

	

}
