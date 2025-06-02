package je12_poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente igor = new Cliente("Igor Gonçalves");
        System.out.println(igor.limiteCredito);
        igor.solicitarLimiteCredito(300.0);
        System.out.println(igor.limiteCredito);

        igor.comprar(90.0);

    }
}
