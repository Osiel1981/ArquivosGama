import java.util.Scanner;

public class exercicio2_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario = 1;
		while(salario != 0) {
			System.out.printf("%nEntre com seu salário: %n");
			salario = sc.nextDouble();
		
			if (salario <= 2000.00) {
				System.out.printf("isento%n");
				
			}else if(salario<3000) {
				System.out.printf("%.2f%n",(salario-2000)*0.08);
				
			}else if(salario<4500) {
				//Forma diferente de fazer com variavel local
				double imposto = (1000*0.08)+((salario-3000)*0.18);
				System.out.printf("%.2f",imposto);
			
			}else {
				System.out.printf("%.2f%n",((1000*0.08)+(1500*0.18)+(salario-4500)*0.28));
			}
	}

}
}
