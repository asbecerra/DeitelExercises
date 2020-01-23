import java.util.Scanner;

public class Exercise_228{
	
	public static void main (String [] args){

		Scanner enter = new Scanner(System.in);


		int r;

		System.out.print("Insert the value for radio\n r=");

		r = enter.nextInt();

		System.out.printf("The diameter is %d\n",  2*r);

		System.out.printf("The circunference is %f\n",  2*Math.PI*r);

		System.out.printf("The area is %f\n",  Math.PI*(r*r));

	}
}