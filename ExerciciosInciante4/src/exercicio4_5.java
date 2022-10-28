import java.util.Scanner;

public class exercicio4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma = 1; 
		for (int i = 1 ; i<= n ; i++) {
			soma *= i;
		}
		sc.close();
		System.out.println(soma);
	}

}
