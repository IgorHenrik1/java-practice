package exercicio_conta_corrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente  conta = new ContaCorrente();
        String respostaEntrar = conta.Entrar();
        if (!respostaEntrar.equals("Falhou")) {
            conta.Sacar();
        }

    }
}
