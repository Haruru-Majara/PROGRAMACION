package Ej4_Empresa;

public abstract class Empleado {

	private String nombre,dni,direccion,telefono;
	private static int numEmple=1000;
	private int numeroEmpleado;
	protected int horasTrabajadas;
	
	public Empleado(String nombre, String dni, String direccion, String telefono, int numeroEmpleado,
			int horasTrabajadas) {
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.numeroEmpleado = numeroEmpleado;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
}
