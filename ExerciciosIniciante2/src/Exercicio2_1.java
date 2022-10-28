import java.util.Scanner;

public class Exercicio2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		String condicao = (numero >= 0)? "NÃO NEGATIVO": "NEGATIVO";
		System.out.println(condicao);
		sc.close();
	}

}
