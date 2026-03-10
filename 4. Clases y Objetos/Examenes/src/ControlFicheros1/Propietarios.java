package ControlFicheros1;

public class Propietarios {
	private String dni;
	private String nombre;
	private String apellido;
	
	public Propietarios(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Propietarios [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
