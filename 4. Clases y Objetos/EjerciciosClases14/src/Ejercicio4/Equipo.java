package Ejercicio4;

public class Equipo {

	 private String nombre;
	    private int victorias;
	    private int derrotas;
	    private int empates;
	    private int golesFavor;
	    private int golesContra;
	    private int puntos;

	    // Constructor
	    public Equipo(String nombre) {
	        this.nombre = nombre;
	        this.victorias = 0;
	        this.derrotas = 0;
	        this.empates = 0;
	        this.golesFavor = 0;
	        this.golesContra = 0;
	        this.puntos = 0;
	    }

	    // Método para actualizar tras un partido
	    public void registrarPartido(int golesMarcados, int golesRecibidos) {
	        golesFavor += golesMarcados;
	        golesContra += golesRecibidos;

	        if (golesMarcados > golesRecibidos) {
	            victorias++;
	            puntos += 3;
	        } else if (golesMarcados == golesRecibidos) {
	            empates++;
	            puntos += 1;
	        } else {
	            derrotas++;
	        }
	    }

	    // Getters
	    public String getNombre() {
	        return nombre;
	    }

	    public int getPuntos() {
	        return puntos;
	    }

	    // Mostrar información
	    public String info() {
	        return nombre + " | V: " + victorias + " D: " + derrotas +
	                " E: " + empates + " GF: " + golesFavor +
	                " GC: " + golesContra + " Puntos: " + puntos;
	    }
}
