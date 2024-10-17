Gerência de Estacionamento
Este é um projeto simples de gerenciamento de estacionamento implementado em Java. Ele simula um sistema de controle de tickets de estacionamento, onde os usuários podem emitir tickets, pagar por tempo de permanência, consultar saldo e listar os tickets emitidos.

Funcionalidades
Emitir Ticket: Gera um novo ticket para um cliente.
Pagar Ticket: Permite o pagamento do ticket informando o número e o tempo de permanência.
Consultar Saldo: Exibe o saldo total arrecadado pelo estacionamento.
Consultar Ticket: Verifica informações de um ticket específico.
Listar Tickets: Lista todos os tickets emitidos com seus respectivos status (pago ou não).
Estrutura de Classes
O projeto é dividido em três classes principais:

Main: Classe principal que contém o menu e controla a interação com o usuário.
Estacionamento: Gerencia os tickets emitidos e o saldo do estacionamento.
Ticket: Representa um ticket de estacionamento, armazenando informações como número, valor e status de pagamento.
Exemplo de Uso
Ao executar o programa, o usuário verá um menu com as seguintes opções:

csharp
Copiar código
=========================================
          ESTACIONAMENTO                
      Taxa: R$5,00 + R$0,50/hora       
=========================================
Opções:
[1] Emitir ticket
[2] Pagar ticket
[3] Consultar saldo
[4] Consultar ticket
[5] Listar tickets
[6] Sair
=========================================
Escolha uma opção: 
1. Emitir Ticket
Ao selecionar a opção 1, um novo ticket será emitido com um número sequencial.

2. Pagar Ticket
Ao selecionar a opção 2, o sistema solicitará o número do ticket e o tempo de permanência (em horas) para calcular o valor a ser pago.

3. Consultar Saldo
A opção 3 exibirá o saldo total arrecadado pelo estacionamento.

4. Consultar Ticket
Ao selecionar a opção 4, o sistema solicitará o número do ticket para exibir suas informações, incluindo o valor e se está pago ou não.

5. Listar Tickets
A opção 5 listará todos os tickets emitidos, mostrando seus valores e status de pagamento.

6. Sair
A opção 6 encerra o programa.
