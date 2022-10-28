import java.util.Scanner;

public class exercicio4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i<n;i++) {
			System.out.println("Numero 1:");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			if (a < 0) {
				System.out.println("Divisão impossível");
			} 
			else {
				System.out.printf("%.1f",a/b);
				
				
			}
			}
		sc.close();
		}

	}

