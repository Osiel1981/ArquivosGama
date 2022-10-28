import java.util.Scanner;

public class Exerciocio3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.Álcool 2.Gasolina 3.Diesel 4.Fim)
		int codigo = 0;
		int vendasAlcool = 0;
		int vendasGasolina = 0;
		int vendasDiesel = 0;
		while (codigo != 4) {
			System.out.println("Entre com o código");
			codigo = sc.nextInt();
			switch (codigo) {
			case 1 :
				vendasAlcool +=1;
				break;
			case 2:
				vendasGasolina +=1;
				break;
			case 3:
				vendasDiesel += 1;
				break;
			case 4:
				break;
			default:
				System.out.println("Numero inválido");
				break;
			}

		}
		System.out.printf("Muito Obrigado!%n");
		System.out.printf("Vendas Alcool "+ vendasAlcool+"%n");
		System.out.printf("Vendas Gasolina "+vendasGasolina+"%n");
		System.out.printf("Vendas Diesel "+vendasDiesel +"%n");	
		sc.close();
	}

}
