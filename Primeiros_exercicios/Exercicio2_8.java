import java.util.Scanner;

public class Exercicio2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Entre com seu salário: %n");
		double salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			System.out.println("isento");
			
		}else if(salario<3000) {
			System.out.printf("%.2f"+(salario-2000)*0.08);
			
		}else if(salario<4500) {
			//Forma diferente de fazer com variavel local
			double imposto = (1000*0.08)+((salario-3000)*0.18);
			System.out.printf("%.2f", imposto);
		
		}else {
			System.out.printf("%.2f"+(1000*0.08)+(1500*0.18)+(salario-4500)*0.28);
		}

	}

}
