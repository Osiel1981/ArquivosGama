package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero");
		int n = sc.nextInt();
		double [] vetor = new double[n];
		
		for (int i=0 ; i<n; i++) {
			vetor[i] =  sc.nextDouble();
		}
		
		double soma = 0.0;
			for(int i = 0; i<n; i++) {
			soma += vetor[i];
		}
		double avg = soma/n;
		
		System.out.printf("Média de altura: %.2f", avg);
		
		
		
		sc.close();
	}

}
