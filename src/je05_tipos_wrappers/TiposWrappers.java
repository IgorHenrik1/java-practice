package je05_tipos_wrappers;

public class TiposWrappers {
    public static void main(String[] args) {
        // conversão de tipos explicita
        double d = 100.0;
        int i = (int) d;
        System.out.println(i); // 100

        // Métodos de parsing
        String num = "100";
        int n = Integer.parseInt(num);
        System.out.println(n); // 100

        //Métodos de conversão
        String number = "100";
        Integer obj = Integer.valueOf(number);
        System.out.println(obj); // 100

        //Métodos de comparação
        Integer obj1 = Integer.valueOf(100);
        Integer obj2 = Integer.valueOf(100);
        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1.compareTo(obj2)); // 0

    }
}
