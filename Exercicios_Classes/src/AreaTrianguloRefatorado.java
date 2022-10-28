import java.util.Scanner;

import entities.triangulo;

public class AreaTrianguloRefatorado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		triangulo x,y;
		x = new triangulo();
		y = new triangulo();
		
		System.out.println("Areas de x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Areas de y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areax = x.area();
		double areay = y.area();
		System.out.println("Area x"+ areax);
		System.out.println("Area y"+ areay);

	}

}
