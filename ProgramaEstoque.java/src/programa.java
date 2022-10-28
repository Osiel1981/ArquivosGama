import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com nome: ");
		String name = sc.nextLine();
		System.out.println("Entre valor: ");
		double price = sc.nextDouble();
		int quantity;
		
		Product product = new Product(name, price);

		System.out.println(product);
		
		System.out.println("Digite um quantidade para adicionar");
		quantity = sc.nextInt(); 
		product.AddProducts(quantity);
		
		product.setName("Radio");
		
		System.out.println(product);
		
		System.out.println("Digite um quantidade para remover");
		int remove = sc.nextInt(); 
		product.RemoveProducts(remove);

		System.out.println(product);
		
		sc.close();
	}

}
/*Rafaela, 12 anos de magalu
3 anos em produto
*/

