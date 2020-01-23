import java.util.Scanner;

public class Exercise_224 {
	public static void main (String[] args) {
		Scanner enter = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		System.out.print("Insert value for num1 ");
		num1 = enter.nextInt();
		System.out.print("Inser value for num2 ");
		num2 = enter.nextInt();
		System.out.print("Inser value for num3 ");
		num3 = enter.nextInt();
		System.out.print("Inser value for num4 ");
		num4 = enter.nextInt();
		System.out.print("Inser value for num5 ");
		num5 = enter.nextInt();
		int major = num1;
		int minor = num1;
		if (num2 > major) {
			major = num2; 
		}
		if (num2 < minor) {
			minor = num2;
		}
		if (num3 > major) {
			major = num3;
		}
		if (num3 < minor) {
			minor = num3;
		}
		if (num4 > major) {
			major = num4;
		}
		if (num4 < minor) {
			minor = num4;
		}
		if (num5 > major) {
			major = num5;
		}
		if (num5 < minor) {
			minor = num5;
		}
		System.out.printf("%d is the major number and %d, is the minor number ", major, minor);
	}
}
