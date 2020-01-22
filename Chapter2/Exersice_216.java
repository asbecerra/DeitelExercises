import java.util.Scanner;

public class Exersice_216 {

	
	public static void main (String[] args){

		Scanner enter = new Scanner(System.in);

		int num1;
		int num2;

		System.out.print("Insert value for num1 ");
		num1 = enter.nextInt();

		System.out.print("Inser value for num2 ");
		num2 = enter.nextInt();

		if (num1 > num2)
			System.out.printf("%d is mayor than %d\n", num1, num2);

		if (num1 < num2)
			System.out.printf("%d is mayor tha %d\n",num2, num1);

		if (num1 == num2)
			System.out.printf("%d is equal to %d\n", num1, num2);

	}

}