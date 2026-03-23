package Ej2_Universidad;

public class Al_CursoPuente extends Alumno {

	private String carrera;

	public Al_CursoPuente(String nombre, String apellido, String curso, double importeMat, String carrera) {
		super(nombre, apellido, curso, importeMat);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	@Override
	public String toString() {
		return super.toString()+"Al_CursoPuente [carrera=" + carrera + "]";
	}


	
	

}
