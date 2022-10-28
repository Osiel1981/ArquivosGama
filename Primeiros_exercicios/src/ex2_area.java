import java.util.Scanner;

public class ex2_area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio;
		double pi = 3.14159;
		raio = sc.nextDouble();
		
		System.out.printf("Área = %.4f", Math.pow(raio,2)*pi);
		
	}

}
