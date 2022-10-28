import java.util.Scanner;

public class Exercicio2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Entre com um numero: %n");
		int A = sc.nextInt();
		System.out.printf("Entre com outro numero: %n");
		int B = sc.nextInt();
		String resposta = (A%B==0 || B%A==0)?"São Multiplos":"Não são Multiplos";
		System.out.println(resposta);
		
		

	}

}
