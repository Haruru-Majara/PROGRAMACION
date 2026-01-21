package Ejercicio4;

public class Repartidor {

	private int codigo;
	private int numPedidos;
	private double ganancias;
	private static int totalPedidos;
	private static int totalRepartidores;
	
	public Repartidor() {
		totalRepartidores++;
		this.codigo=totalRepartidores;
		//No es necesario inicializar los atributos numéricos a 0 porque lo hace automaticamente
		this.numPedidos=0;
		this.ganancias=0;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getNumPedidos() {
		return numPedidos;
	}

	public double getGanancias() {
		return ganancias;
	}

	@Override
	public String toString() {
		return "Repartidor [codigo=" + codigo + ", numPedidos=" + numPedidos + ", ganancias=" + ganancias + "]";
	}
	
	public double hacerPedido(double importe,double propina) { //esto es un metodo
		double gan;
		numPedidos++;
		totalPedidos++;
		gan=(importe*0.20+propina);
		ganancias=ganancias+gan;
		return gan;
	}

	public static int getTotalPedidos() {
		return totalPedidos;
	}
	
	
}
