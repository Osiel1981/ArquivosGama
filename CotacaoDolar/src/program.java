import java.util.Scanner;

import Util.conversao;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price ?" );
		conversao.cotacaoDolar = sc.nextDouble();
		System.out.println("How many dollars will be bought? " );
		conversao.valorCompraEmDolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f" ,conversao.currencyConverter());
		
		sc.close();
	}

}
