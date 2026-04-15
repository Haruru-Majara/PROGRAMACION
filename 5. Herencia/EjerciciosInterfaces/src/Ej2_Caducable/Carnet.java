package Ej2_Caducable;

import java.time.LocalDate;

public class Carnet implements Caducable {
	
	private String nombre;
	private String numero;
	private LocalDate fecha;
	
	@Override
	public boolean caducado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int diasParaCaducar() {
		// TODO Auto-generated method stub
		return 0;
	}

}
