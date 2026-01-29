package examenteatro;

public class Teatro {
	private String codigo;
    private String titulo;
    private int dia;
    private int mes;
    private int año;

    private int entradasVIP;
    private int entradasNormales;

    private static final double precioVIP = 20;
    private static final double precioNormal = 14;

    public Teatro(String codigo, String titulo, int dia, int mes, int año) {

        this.codigo = codigo; 
        this.titulo = titulo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;

        this.entradasVIP = 15; // Porque quiero dejar claro que forman parte del estado inicial
        this.entradasNormales = 25; 
    }
}
