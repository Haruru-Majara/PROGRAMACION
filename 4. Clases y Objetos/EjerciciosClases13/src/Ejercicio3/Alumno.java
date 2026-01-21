package Ejercicio3;

public class Alumno {

	private String numMat;
	private double programacion,bbdd,entornos,media;
	private static int numeroAprobProg=0;
	
	public Alumno (String n, double p, double b, double e) {
		numMat=n;
		programacion=p;
		bbdd=b;
		entornos=e;
		media=(p+b+e)/3;
	}
	public double getMedia() {return media;}
	
	public String getNumMat() {
		return numMat;
	}
	public double getBbdd() {
		return bbdd;
	}
	public double getEntornos() {
		return entornos;
	}
	public double getProgramacion() {
		return programacion;
	}
	
}
