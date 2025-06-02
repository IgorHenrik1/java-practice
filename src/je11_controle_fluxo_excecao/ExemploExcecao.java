package je11_controle_fluxo_excecao;

import java.text.NumberFormat;
import java.text.ParseException;


public class ExemploExcecao {
    public static void main(String[] args) {
        try{
            Number valor = NumberFormat.getInstance().parse("a1.75");
            double vd = valor.doubleValue();
            System.out.println(vd);

        }catch (ParseException e){
            e.printStackTrace();
        }


    }
}
