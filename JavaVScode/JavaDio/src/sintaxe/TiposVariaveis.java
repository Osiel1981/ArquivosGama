package sintaxe;

import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("minutos =");
        int minutos = sc.nextInt();

        double conta = 50;
        if(minutos >= 100){
            conta += (minutos - 100) * 2;
        }
        System.out.printf("Valor a pagar = %.2f", conta);

        sc.close();
    }
}
