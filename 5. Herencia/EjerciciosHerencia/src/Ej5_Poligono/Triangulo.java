package Ej5_Poligono;

public class Triangulo extends Poligono{
	private int base;
	private int altura;
	private int lado1;
	private int lado2;
	
	public Triangulo(int lado1, int lado2, int base,int altura) {
		// TODO Auto-generated constructor stub
		super(3);
		this.lado1=lado1;
		this.lado2=lado2;
		this.base=base;
		this.altura=altura;
		
	}
	
	public void hallarArea() {
		
		this.area=base*altura/2;
	}

	@Override
	public void hallarPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro=this.base+this.lado1+this.lado2;
	}

	@Override
	public String toString() {
		return "Triangulo: " + super.toString();
	}


	

}
