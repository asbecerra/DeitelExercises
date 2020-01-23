import java.util.Scanner;
//calculate the product of three numbers
public class Product {

	public static void main (String[] args) {
	
		Scanner enter = new Scanner(System.in);

		int x;
		int y;
		int z;
		int product;

		System.out.println("Enter the value for x");
		x = enter.nextInt();

		System.out.println("Enter the value for y");
		y = enter.nextInt();

		System.out.println("Enter the value for z");
		z = enter.nextInt();

		product = x*y*z;

		System.out.printf("The product is %d\n", product);

	}
}

