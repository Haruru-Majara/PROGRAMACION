package Ejercicio2;

public class Garaje {
	private int numero;
	private double metrosCuadrados;
	private int planta;
	private double precioAlquiler;
	private boolean alquilado;
	
	private static final double precioBase=18;
	private static int totalAlquilados;
	private static double beneficioTotal;

	public Garaje(int numero, double metrosCuadrados, int planta) {
		this.numero = numero;
		this.metrosCuadrados = metrosCuadrados;
		this.planta = planta;
		
		if (this.planta==0) {
			precioAlquiler=precioBase+1;
			if(metrosCuadrados > 4 )
				precioAlquiler=precioAlquiler+1.5;
			else
				precioAlquiler=precioAlquiler+1;
		}
		else
			if(this.planta==1) {
				precioAlquiler=precioBase+3;
				if(metrosCuadrados > 4 )
					precioAlquiler=precioAlquiler+1.5;
				else
					precioAlquiler=precioAlquiler+1;
			}
			else
				if(this.planta==2) {
					precioAlquiler=precioBase+1.50;
					if(metrosCuadrados > 4 )
						precioAlquiler=precioAlquiler+1.5;
					else
						precioAlquiler=precioAlquiler+1;
				}
				
	}
	
	public double alquilarGaraje() {
		
		if (alquilado)
			return 0;
		
		alquilado=true;
		beneficioTotal+=precioAlquiler;
		totalAlquilados++;
		return precioAlquiler;
			
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public int getNumero() {
		return numero;
	}

	public static double getBeneficioTotal() {
		return beneficioTotal;
	}

	@Override
	public String toString() {
		return "Garaje [numero=" + numero + ", metrosCuadrados=" + metrosCuadrados + ", planta=" + planta
				+ ", precioAlquiler=" + precioAlquiler + ", alquilado=" + alquilado + "]";
	}
	
	public double aumentarPorcentaje (double porcentaje) {
		precioAlquiler=precioAlquiler*porcentaje/100;
		return precioAlquiler;
	}
	
}
