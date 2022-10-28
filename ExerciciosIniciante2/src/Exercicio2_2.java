import java.util.Scanner;

public class Exercicio2_2 {

	public static void main(String[] args) {
		System.out.printf("Insira um numero inteiro: %n");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		String resultado = (numero%2==0)?"PAR" : "IMPAR";
		System.out.println(resultado);
		

	}

}
