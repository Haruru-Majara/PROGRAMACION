package Ejercicio1;

public class Satelite {

	private double distancia;
	private int meridiano;
	private int paralelo;
	
	public Satelite() {
		
	}
	
	public Satelite(int m, int p) {
		meridiano=m;
		paralelo=p;
	}
	
	public boolean estaOrbita() {
		return distancia > 0;
		/* if (distancia > 0)
			return true;
		return false;
		*/
	}
	
	public void setDistancia(double d) {
		distancia=d;
	}
	
	public void setPosicion( int m, int p, double d) {
		meridiano=m;
		paralelo=p;
	}

	@Override
	public String toString() {
		return "Satelite [distancia=" + distancia + ", meridiano=" + meridiano + ", paralelo=" + paralelo + "]";
	}
	
	

}
