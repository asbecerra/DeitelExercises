import java.util.Scanner;

public class Exercise230 {
	public static void main (String[] args) {
		Scanner enter = new Scanner(System.in);
		int number;
		System.out.println("Insert a 5 digits number");
		number = enter.nextInt();
		int num1 = number/10000;
		if (num1 == 0) {
			System.out.println("The number has less than 5 digits");
			return;
		}
		if (num1 >= 10){
			System.out.println("The number has more than 5 digits");
			return;
		}
		int mod1 = number%10000;
		int num2 = mod1/1000;
		int mod2 = mod1%1000;
		int num3 = mod2/100;
		int mod3 = mod2%100;
		int num4 = mod3/10;
		int mod4 = mod3%10;
		int num5 = mod4/1;
		int mod5 = mod4%1;
		System.out.printf("%d   %d   %d   %d   %d\n ", num1, num2, num3, num4, num5);
	}
}
