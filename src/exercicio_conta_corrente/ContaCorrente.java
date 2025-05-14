package exercicio_conta_corrente;

import java.util.Scanner;

public class ContaCorrente {
    String numeroConta = "1234";
    int agencia = 12;
    String nomeCliente = "Igor Gonçalves";
    String dataNascimento = "03/04/2002";
    double saldoConta = 1000.00;

    public String Entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta:");
        String numeroContaRecebido = scanner.nextLine();

        System.out.println("Digite o número da sua agência:");
        int agenciaRecebida = scanner.nextInt();

        if (numeroConta.equals(numeroContaRecebido) && agencia == agenciaRecebida) {
            System.out.println("Bem vindo " + nomeCliente);
            System.out.println("Saldo disponivel " + saldoConta);
            return "Logado com sucesso";
        }

        System.out.println("Falhou");
        return "Falhou";
    }

    public void Sacar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor deseja sacar: ");
        double saqueSolicitado = scanner.nextInt();

        if(saqueSolicitado > saldoConta){
            System.out.println("erro: saldo indisponivel");
            return;
        }

        saldoConta = saldoConta - saqueSolicitado;
        System.out.println("Saque realizado com sucesso");
        System.out.println("Saldo disponivel: " + saldoConta);
    }

    
}
