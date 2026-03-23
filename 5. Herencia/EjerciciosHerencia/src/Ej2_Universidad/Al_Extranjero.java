package Ej2_Universidad;

public class Al_Extranjero extends Alumno {

	private String pais;
	static final double tasas=15;
	
	public Al_Extranjero(String nombre, String apellido, String curso, double importeMat, String pais) {
		super(nombre, apellido, curso, importeMat);
		this.pais = pais;
		this.importeMat=importeMat+(importeMat*tasas/100);
	}
	
	

	@Override
	public String toString() {
		return  super.toString()+"Al_Extranjero [pais=" + pais + "]";
	}
	
	
	
}
