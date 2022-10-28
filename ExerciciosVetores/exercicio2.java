import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a quantidade de numeros? ");
		int n = sc.nextInt(); 
		double[] vetor = new double[n];
		
		
		for (int i=0; i<vetor.length; i++) {
			System.out.println("digite numero");
			vetor[i]= sc.nextDouble();
		}
		for (int i= 0; i<vetor.length; i++)
			System.out.printf(" %.1f", vetor[i]);
		
		double soma = 0;
		for (int i=0; i<vetor.length; i++) {
			soma += vetor[i];
		}
		
		double media = soma/n;
		System.out.printf("%nSoma, %.2f", soma);
		System.out.printf("%nMédia, %.2f", media);
		
		
		sc.close();
	}

}
