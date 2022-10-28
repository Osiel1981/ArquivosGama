import java.util.Scanner;

import entities.Aluno;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Name? ");
		aluno.name = sc.nextLine();
		System.out.println("Entre com notas 1, 2 e 3: ");
		aluno.notatrimestre1 = sc.nextDouble();
		aluno.notatrimestre2 = sc.nextDouble();
		aluno.notatrimestre3 = sc.nextDouble();
		
		System.out.println(aluno.toString());
		
		sc.close();
	}

}
