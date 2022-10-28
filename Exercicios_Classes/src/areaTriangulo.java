import java.util.Scanner;

public class areaTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3, y1, y2,y3, p, areax, areay;
		System.out.println("Areas de x");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		
		System.out.println("Areas de y");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		p = (x1+x2+x3)/2;
		areax = Math.sqrt(p*(p-x1)*(p-x2)*(p-x3));
		p = (y1+y2+y3)/2;
		areay = Math.sqrt(p*(p-y1)*(p-y2)*(p-y3));
		System.out.println("Area x"+ areax);
		System.out.println("Area y"+ areay);

	}

}
