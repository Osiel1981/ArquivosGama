import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] altura = new double[n];
		
		double somaAltura = 0;
		int menores16 = 0;
		double percentual = 0;
		
		for (int i = 0 ; i<vetor.length;i++) {
			System.out.printf("Digite o nome da " + (i+1) +"ª pessoa:");
			nomes[i] = sc.next();
			sc.nextLine();
			
			System.out.printf("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.printf("Altura: ");
			altura[i] = sc.nextDouble();
			somaAltura =+ altura[i];
			
			if (idades[i] < 16) {
				menores16++;
				percentual = ((menores16)*100)/n;
			}	
		}
		double media = somaAltura / n;
		System.out.println("Altura média: "+ media);		

		System.out.println("Pessoas com menos de 16 anos:" + percentual + "%");
		for (int i = 0; i < vetor.length; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);	
			}	
		}
		sc.close();
	}

}
