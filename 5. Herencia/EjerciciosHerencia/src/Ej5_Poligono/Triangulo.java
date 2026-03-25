package Ej5_Poligono;

public class Triangulo extends Poligono{
	private int base;
	private int altura;
	private int lado1;
	private int lado2;
	
	public Triangulo(int base, int altura, int lado1,int lado2) {
		// TODO Auto-generated constructor stub
		super(3);
		this.base=base;
		this.altura=altura;
		this.lado1=lado1;
		this.lado2=lado2;
	}
	
	public void hallarArea() {
		
		this.area=base*altura/2;
	}

	@Override
	public void hallarPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro=this.base+this.lado1+this.lado2;
	}

	

}
