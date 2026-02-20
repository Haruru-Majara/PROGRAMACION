package Ejercicio9;

import java.util.Objects;

public class Carta {
	private String apellido;
	private String nombre;
	private String ciudad;
	private String pais;
	
	
	public Carta(String apellido, String nombre, String ciudad, String pais) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
	}



	@Override
	public int hashCode() {
		return Objects.hash(apellido);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(apellido, other.apellido);
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}
