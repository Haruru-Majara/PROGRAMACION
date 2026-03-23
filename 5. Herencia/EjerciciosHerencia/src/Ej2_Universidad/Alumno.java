package Ej2_Universidad;

public class Alumno {
	private String nombre;
	private String apellido;
	private String curso;
	protected double importeMat;
	
	public Alumno(String nombre, String apellido, String curso, double importeMat) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
		this.importeMat = importeMat;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", importeMat=" + importeMat
				+ "]";
	}
	
	
}
