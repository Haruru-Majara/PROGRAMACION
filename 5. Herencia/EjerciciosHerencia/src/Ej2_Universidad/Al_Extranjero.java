package Ej2_Universidad;

public class Al_Extranjero extends Alumno {

	private String pais;
	static final double tasas=15;
	
	public Al_Extranjero(String nombre, String apellido, String curso, Double importeMat, String pais) {
		super(nombre, apellido, curso, importeMat);
		this.pais = pais;
	}
	
	
	
	
}
