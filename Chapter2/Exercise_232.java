import java.util.Scanner;

public class Exercise_232 {
	public static void main (String[] args) {
		Scanner enter = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		System.out.print("Insert an integer \n num1: ");
		num1 = enter.nextInt();
		System.out.print("Insert an integer \n num2: ");
		num2 = enter.nextInt();
		System.out.print("Insert an integer \n num3: ");
		num3 = enter.nextInt();
		System.out.print("Insert an integer \n num4: ");
		num4 = enter.nextInt();
		System.out.print("Insert an integer \n num5: ");
		num5 = enter.nextInt();
		int positive = 0;
		int negative = 0;
		int zero = 0;

		if (num1 > 0) {
			positive = positive + 1;
		}
		if (num1 < 0) {
			negative = negative +1;
		}
		if (num1 == 0) {
			zero = zero + 1;
		}
		if (num2 > 0) {
			positive = positive + 1;
		}
		if (num2 < 0) {
			negative = negative +1;
		}
		if (num2 == 0) {
			zero = zero + 1;
		}
		if (num3 > 0) {
			positive = positive + 1;
		}
		if (num3 < 0) {
			negative = negative +1;
		}
		if (num3 == 0) {
			zero = zero + 1;
		}
		if (num4 > 0) {
			positive = positive + 1;
		}
		if (num4 < 0) {
			negative = negative +1;
		}
		if (num4 == 0) {
			zero = zero + 1;
		}
		if (num5 > 0) {
			positive = positive + 1;
		}
		if (num5 < 0) {
			negative = negative +1;
		}
		if (num5 == 0) {
			zero = zero + 1;
		}
		System.out.printf("From the number that was entered: %d are positive, %d are negative, %d are zero", positive, negative, zero);
	}
}
