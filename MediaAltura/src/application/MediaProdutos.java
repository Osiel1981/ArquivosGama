package application;

import java.util.Scanner;

import entities.Produto;

public class MediaProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for (int i=0 ; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		double soma = 0.0;
		for (int i=0; i<vetor.length;i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / vetor.length;
		
		System.out.printf("Média de preço é : %.2f", media);
		
		sc.close();
	}

}
