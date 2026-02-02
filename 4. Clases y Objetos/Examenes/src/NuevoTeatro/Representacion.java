package NuevoTeatro;

import java.time.LocalDate;
import java.util.Scanner;

public class Representacion {

	 private String codigo;
	    private String titulo;
	    private LocalDate fecha;

	    private int entradasVip = 15;
	    private int entradasNormales = 25;

	    private boolean[][] asientos = new boolean[8][5];

	    private double recaudacion;
	    private static double totalRecaudado;

	    private final int PRECIO_VIP = 20;
	    private final int PRECIO_NORMAL = 14;

	    // =========================
	    // CONSTRUCTOR
	    // =========================
	    public Representacion(String codigo, String titulo, LocalDate fecha) {
	        this.codigo = codigo;
	        this.titulo = titulo;
	        this.fecha = fecha;
	    }

	    // =========================
	    // GETTERS
	    // =========================
	    public String getCodigo() {
	        return codigo;
	    }

	    public LocalDate getFecha() {
	        return fecha;
	    }

	    public static double getTotalRecaudado() {
	        return totalRecaudado;
	    }

	    // =========================
	    // ¿HAY ENTRADAS?
	    // =========================
	    public boolean tieneEntradas() {
	        return entradasVip > 0 || entradasNormales > 0;
	    }

	    // =========================
	    // COMPRAR
	    // =========================
	    public double comprar(int vip, int normales) {

	        if (vip > entradasVip || normales > entradasNormales)
	            return 0;

	        entradasVip -= vip;
	        entradasNormales -= normales;

	        double importe = vip * PRECIO_VIP + normales * PRECIO_NORMAL;

	        recaudacion += importe;
	        totalRecaudado += importe;

	        return importe;
	    }

	    // =========================
	    // ELEGIR ASIENTOS
	    // =========================
	    public void elegirAsientos(int cantidad, Scanner sc) {

	        for (int k = 0; k < cantidad; k++) {

	            int fila, col;

	            do {
	                System.out.println("Fila (0-7):");
	                fila = sc.nextInt();
	                System.out.println("Columna (0-4):");
	                col = sc.nextInt();

	            } while (fila < 0 || fila > 7 || col < 0 || col > 4 || asientos[fila][col]);

	            asientos[fila][col] = true;
	        }
	    }

	    // =========================
	    @Override
	    public String toString() {
	        return codigo + " | " + titulo + " | " + fecha +
	                " | VIP:" + entradasVip +
	                " | Normales:" + entradasNormales;
	    }
}
