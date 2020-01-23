import java.util.Scanner;
//Calculate the producto btw two numbers, and determine if the are multiples
public class Exersice_226 {
	public static void main (String[] args) {
		Scanner enter = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("Insert value for num1 ");
		num1 = enter.nextInt();
		System.out.print("Inser value for num2 ");
		num2 = enter.nextInt();
		int major = num1;
		int minor = num1;
		if (num2 > major) {
			major = num2;
		}
		if (num2 < minor) {
			minor = num2;
		}
		int module = major % minor;
		int product = major * minor;
		if (module == 0) {
			System.out.printf("%d and %d are multiples\n", num1, num2);
		}
		if (module != 0) {
			System.out.printf("%d and %d are not multiples\n", num1, num2);
		}
		System.out.printf("%d * %d = %d\n",num1, num2, product);
	}
}
