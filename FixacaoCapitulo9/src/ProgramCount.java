import java.util.Scanner;

import entities.DataCount;

public class ProgramCount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DataCount dataconta;
		
		System.out.println("Enter with number count");
		int NUMEROCONTA = sc.nextInt();
		
		System.out.println("Enter with name client");
		sc.nextLine();
		String NomeCliente = sc.nextLine();
		
		double deposito;
		
		System.out.println("Initial deposit? y/n");
		char opcao = sc.next().charAt(0);
		
		if (opcao == 'y') {
			System.out.println("Enter with value inital deposit: $");
			deposito = sc.nextDouble();
			dataconta = new DataCount(NUMEROCONTA, NomeCliente, deposito);
		}
		else {
			dataconta = new DataCount(NUMEROCONTA, NomeCliente);
		}
		
		System.out.println(dataconta);
		
		sc.nextLine();
		System.out.println("Enter with value deposit: $");
		deposito = sc.nextDouble();
		dataconta.getDeposito(deposito);
		
		System.out.println(dataconta);
		
		sc.nextLine();
		System.out.println("Entre com valor do saque: R$");
		double saque = sc.nextDouble();
		dataconta.saque(saque);
		
		System.out.println(dataconta);
		
		
		}

}
