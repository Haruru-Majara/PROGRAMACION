package Ej2_Caducable;

import java.time.LocalDate;

public class Medicamento implements Caducable {

	private String nombre;
	private int gramos;
	private LocalDate fecha;
	
	
	@Override
	public boolean caducado() {
		if (LocalDate.now().isAfter(fecha))
			return false;
		return true;
	}

	@Override
	public int diasParaCaducar() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
