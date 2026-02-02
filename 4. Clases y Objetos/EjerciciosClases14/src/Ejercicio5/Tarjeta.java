package Ejercicio5;

public class Tarjeta {

	 private String numero;
	    private String titular;
	    private String password;
	    private double saldo;
	    private boolean bloqueada;
	    private int anioEmision; // para saber cuál es más antigua

	    public Tarjeta(String numero, String titular, String password, double saldo, int anioEmision) {
	        this.numero = numero;
	        this.titular = titular;
	        this.password = password;
	        this.saldo = saldo;
	        this.bloqueada = false;
	        this.anioEmision = anioEmision;
	    }

	    // =====================
	    // GETTERS
	    // =====================
	    public String getNumero() { return numero; }
	    public String getTitular() { return titular; }
	    public boolean isBloqueada() { return bloqueada; }
	    public double getSaldo() { return saldo; }
	    public int getAnioEmision() { return anioEmision; }

	    // =====================
	    // BLOQUEAR / DESBLOQUEAR
	    // =====================
	    public void bloquear() { bloqueada = true; }
	    public void desbloquear() { bloqueada = false; }

	    // =====================
	    // MISMO TITULAR
	    // =====================
	    public boolean mismoTitular(Tarjeta otra) {
	        return this.titular.equalsIgnoreCase(otra.titular);
	    }

	    // =====================
	    // PAGO
	    // =====================
	    public boolean pagar(String pass, double importe) {
	        if (bloqueada || !password.equals(pass) || importe > saldo) return false;
	        saldo -= importe;
	        return true;
	    }

	    // =====================
	    // RECARGA
	    // =====================
	    public void recargar(double importe) {
	        if (!bloqueada) saldo += importe;
	    }

	    // =====================
	    // INFO
	    // =====================
	    public String info() {
	        return "Número: " + numero +
	                " | Titular: " + titular +
	                " | Saldo: " + saldo +
	                " | Bloqueada: " + bloqueada +
	                " | Año emision: " + anioEmision;
	    }
}
