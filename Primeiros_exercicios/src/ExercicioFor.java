import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("repetições");
		int x = sc.nextInt();
		int soma = 0;
		for (int i = 0; i<x ; i++) {
			x = sc.nextInt();
			soma += x;
			
		}	
		System.out.println(soma);
		sc.close();
	}

}
