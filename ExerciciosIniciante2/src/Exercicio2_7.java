import java.util.Scanner;

public class Exercicio2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor de x: ");
		double x = sc.nextDouble();
		System.out.println("Entre com valor de y: ");
		double y = sc.nextDouble();
		String quadrante; 
		if (y > 0 && x > 0) {
			quadrante = "Q1";
		} else if (y > 0 && x < 0) {
			quadrante = "Q2";
		} else if(y < 0 && x < 0) {
			quadrante = "Q3";
		}else if (y<0 && x>0) {
			quadrante = "Q4";
		}else {
			quadrante = "Origem";
		}
			
		System.out.println(quadrante);
	}

}
