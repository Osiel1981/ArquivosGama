import java.util.Scanner;

public class exercicio3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String quadrante = null; 
		
		double x = 1;
		double y = 1;
		
		while (y != 0 || x != 0) {
			System.out.println("Entre com o valor de x: ");
			x = sc.nextDouble();
			System.out.println("Entre com valor de y: ");
			y = sc.nextDouble();
			
			if (y > 0 && x > 0) {
				quadrante = "Primeiro";
			} else if (y > 0 && x < 0) {
				quadrante = "Segundo";
			} else if(y < 0 && x < 0) {
				quadrante = "Terceiro";
			}else
				quadrante = "Quarto";
			System.out.printf("%nQuadrante "+quadrante+"!%n");

		}		
	}
}
