import java.util.Scanner;

public class Exercicio2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Código do produto: %n");
		int codigo = sc.nextInt();
		System.out.printf("Quantidade: %n");
		int quantidade = sc.nextInt();
		double valor = 0;
		
		switch (codigo)	{
			case 1:
				valor = 4.00;
				break;
			case 2:
				valor = 4.50;
				break;		
			case 3:
				valor = 5.00;
				break;
			case 4:
				valor = 2.00;
				break;
			case 5:
				valor = 1.50;
				break;
			default :
				System.out.println("Código inválido");				
		}
		System.out.printf("Total: R$ %.2f", (quantidade*valor));

		

	}

}
