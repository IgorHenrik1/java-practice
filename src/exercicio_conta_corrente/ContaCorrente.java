package exercicio_conta_corrente;

import java.time.LocalDate;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    private Double saldo;
    boolean ativo = true;

    Double consultarSaldo(){
        return saldo;
    }

    //List consultarExtrato(LocalDate dataInicial, LocalDate dataFinal){}

    void cancelar(String justificativa){
        //algoritimo irá manipular o atributo
        //ativo para que se torne false
    }

    void transferir(ContaCorrente contaDestino, Double valorTransferido){

    }

    void sacar(Double valorSolicitado){

    }





}
