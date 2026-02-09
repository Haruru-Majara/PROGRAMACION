package MansoVictoriaRA4;

public class CocheMan {

	private String matricula;
	private double gananciasCoche;
	private int estado;
	private String codigo;
	
	public CocheMan(String matricula) {
		this.matricula = matricula;
		
	}

	@Override
	public String toString() {
		return "CocheMan [matricula=" + matricula + ", gananciasCoche=" + gananciasCoche + ", estado=" + estado + "]";
	}

	public String getMatricula() {
		return matricula;
	}
	
	public boolean reservarCoche(int estado) {
		if (estado == 0) {
			System.out.println("Este coche se puede reservar");
			codigo= matricula.substring(0,3).toLowerCase(); //Aqui hay que poner el numero random, pero no me acuerdo de como se hace y no se si puedo 
			estado=1;                                       //definir la clase random en una clase
			return true;
		}
		else {
			if (estado == 1) {
				System.out.println("Este coche ya esta reservado");
				return false;
			}
			else {
				if (estado == 2)
					System.out.println("Este coche ya está alquilado");
				return false;
			}
		}
	}
}
