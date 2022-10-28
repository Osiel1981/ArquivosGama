import java.util.Scanner;

import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas locações?");
		int n = sc.nextInt();
		
		Rent[] vetor = new Rent[10];
		
		for (int i = 0; i < n ; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vetor[roomNumber] = new Rent(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms");
		
		for (int i = 0; i < 10 ; i++) {
			if (vetor[i] != null) {
				System.out.println(i +":"+ vetor[i]);		
		}
		
	}}

}
