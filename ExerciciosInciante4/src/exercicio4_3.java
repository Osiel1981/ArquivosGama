import java.util.Scanner;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
peso 5 */
public class exercicio4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de testes: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("digite valor 1");
			double valor1 = sc.nextDouble();
			
			System.out.println("digite valor 1");
			double valor2 = sc.nextDouble();
			
			System.out.println("digite valor 1");
			double valor3 = sc.nextDouble();
			
			double soma = ((valor1 * 2)+(valor2*3)+(valor3*5))/10;
			System.out.println(soma);
			}
		}
			

}
/*3
6.5 4.3 6.2
5.1 4.2 8.1
8.0 9.0 10.*/
