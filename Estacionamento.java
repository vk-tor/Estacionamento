package GerenciaDeEstacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    public List<Ticket> tickets;
    private double saldo;

    public Estacionamento() {
        this.tickets = new ArrayList<>();
        this.saldo = 0;
    }

    public void emitirTicket() {
        Ticket ticket = new Ticket();
        tickets.add(ticket);
        System.out.println("Ticket emitido com sucesso! Número do ticket: " + ticket.getNumero());
    }

    public void pagarTicket(int numero, int horas) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumero() == numero) {
                if (!ticket.isPago()) {
                    ticket.pagar(horas);
                    saldo += ticket.getValor();
                    System.out.println("Ticket pago com sucesso!");
                } else {
                    System.out.println("Ticket já pago!");
                }
                return;
            }
        }
        System.out.println("Ticket não encontrado!");
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void consultarTicket(int numero) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumero() == numero) {
                System.out.println("Ticket " + ticket.getNumero() + ": R$" + ticket.getValor() + " - Pago: " + ticket.isPago());
                return;
            }
        }
        System.out.println("Ticket não encontrado!");
    }

    public void listarTickets() {
        System.out.println("Lista de tickets:");
        for (Ticket ticket : tickets) {
            System.out.println("Ticket " + ticket.getNumero() + ": R$" + ticket.getValor() + " - Pago: " + ticket.isPago());
        }
    }
}