import java.util.Scanner;

public class exercicio4_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i<=n ; i++) {
			System.out.print(i+" ");
			System.out.printf(Math.round(Math.pow(i, 2))+" ");
			System.out.printf(Math.round(Math.pow(i, 3))+" %n");
		}
		sc.close();

	}

}
