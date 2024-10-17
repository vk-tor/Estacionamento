package GerenciaDeEstacionamento;

public class Ticket {
    private int numero;
    private double valor;
    private boolean pago;
    private int horas;
    private static int contador = 1; // contador para gerar números sequenciais

    public Ticket() {
        this.numero = contador++; // incrementa o contador e atribui o valor ao ticket
        this.valor = 0; // valor inicial é 0
        this.pago = false;
        this.horas = 0; // horas inicial é 0
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void pagar(int horas) {
        this.horas = horas;
        this.valor = 5 + (horas * 0.5); // calcula o valor do ticket
        this.pago = true;
    }
}