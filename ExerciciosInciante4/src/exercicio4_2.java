import java.util.Scanner;

public class exercicio4_2 {
	/*
	 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
	 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
	 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
	 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
	 * "out" para fora do intervalo).
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com número de repetição:");
		int N = sc.nextInt();
		
		int in = 0;
		int out = 0;

		for(int i = 1 ; i <= N ; i++) {
			System.out.printf("Numero "+ i+1 );
			int x = sc.nextInt();
			if (x > 9 && x < 21) {	
				in = in+1;
			} else {
				out = out+1;
			}	
		}
		System.out.println("in "+ in);
		System.out.println("Out "+ out);
		sc.close();
		
	}
			
}


