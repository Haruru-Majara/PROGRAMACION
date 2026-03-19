package Victoria;

public class Pedido {
	private int numPedido;
	private double precio;
	private String codUsu;
	private String destino;
	
	public Pedido(int numPedido, double precio, String codUsu, String destino) {
		this.numPedido = numPedido;
		this.precio = precio;
		this.codUsu = codUsu;
		this.destino = destino;
	}

	public String getCodUsu() {
		return codUsu;
	}
	
	
}
