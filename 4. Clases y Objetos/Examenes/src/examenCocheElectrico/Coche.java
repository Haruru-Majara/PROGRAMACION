package examenCocheElectrico;

import java.time.LocalTime;
import java.util.Random;

public class Coche {

	private String matricula, codigo;
	private double ganancias;
	private int estado;
	private LocalTime horaReserva;
	
	public Coche(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", codigo=" + codigo + ", ganancias=" + ganancias + ", estado="
				+ estado + ", horaReserva=" + horaReserva + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public int getEstado() {
		return estado;
	}
	
	public String reservar() {
		Random r=new Random();
		if (estado!=0)
			return null;
		estado=1;
		codigo=matricula.substring(4,7).toLowerCase()+(r.nextInt(10)+1);
		horaReserva=LocalTime.now();
		return codigo;
	}
}
