package GerenciaDeEstacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=========================================");
            System.out.println("          ESTACIONAMENTO                ");
            System.out.println("      Taxa: R$5,00 + R$0,50/hora       ");
            System.out.println("=========================================");
            System.out.println("Opções:");
            System.out.println("[1] Emitir ticket");
            System.out.println("[2] Pagar ticket");
            System.out.println("[3] Consultar saldo");
            System.out.println("[4] Consultar ticket");
            System.out.println("[5] Listar tickets");
            System.out.println("[6] Sair");
            System.out.println("=========================================");
            System.out.print("Escolha uma opção: ");

            String inputOpcao = scanner.nextLine().trim(); // Lê a entrada e remove espaços em branco



                if (inputOpcao.matches("\\d+")) { // Verifica se a entrada é um número
                    int opcao = Integer.parseInt(inputOpcao); // Converte a entrada para inteiro

                    if (opcao <= 6 && opcao >= 1) {
                        switch (opcao) {

                            case 1: //EMITIR TICKET
                                estacionamento.emitirTicket();
                                break;


                            case 2: //PAGAR TICKET
                                System.out.print("Informe o número do ticket a pagar: ");
                                int numeroPagar = 0;

                                if (scanner.hasNextInt()) {
                                    numeroPagar = scanner.nextInt();
                                    // Verifica se o número do ticket está dentro do intervalo válido
                                    if (numeroPagar > 0 && numeroPagar <= estacionamento.tickets.size()) {
                                        System.out.print("Informe o tempo de permanência (em horas): ");
                                        int horas = 0;

                                        if (scanner.hasNextInt()) {
                                            horas = scanner.nextInt();
                                            if (horas >= 0) {
                                                estacionamento.pagarTicket(numeroPagar, horas);
                                            } else {
                                                System.out.println("Tempo inválido!");
                                            }
                                        } else {
                                            System.out.println("Entrada inválida para horas!");
                                            scanner.next(); // descarta o input inválido
                                        }
                                    } else {
                                        System.out.println("Número inválido!");
                                    }
                                } else {
                                    System.out.println("Número inválido!");
                                    scanner.next(); // descarta o input inválido
                                }
                                break;


                            case 3: //CONSULTAR SALDO
                                estacionamento.consultarSaldo();
                                break;


                            case 4: //CONSULTAR TICKET
                                System.out.print("Informe o número do ticket a consultar: ");
                                int numeroConsultar = 0;

                                if (scanner.hasNextInt()) {
                                    estacionamento.consultarTicket(numeroConsultar);
                                    break;
                                } else {
                                    System.out.println("Entrada Inválida!");
                                }


                            case 5: //LISTAR TICKETS
                                estacionamento.listarTickets();
                                break;


                            case 6: //SAIR
                                System.out.println("Saindo...");
                                return;
                            default:
                                System.out.println("Opção inválida!");
                                scanner.next(); // descarta o input inválido
                        }
                    } else {
                        System.out.println("Opção inválida! Por favor, digite um número inteiro.");
                        scanner.next(); // descarta o input inválido
                    }
                }
                else {
                    System.out.println("Digite um número de 1 a 6.");
                }
            }
        }
    }