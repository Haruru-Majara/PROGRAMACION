package Ej5_Poligono;

public class Rectangulo extends Poligono {
	int base;
	int altura;
	
	public Rectangulo(int base, int altura) {
		super(4);
		this.base=base;
		this.altura=altura;
	}

	@Override
	public void hallarArea() {
		
		this.area=this.base*this.altura;

	}

	@Override
	public void hallarPerimetro() {
		
		this.perimetro=2*(this.base+this.altura);

	}

	@Override
	public String toString() {
		return "Rectangulo: " + super.toString();
	}

	

	
}
