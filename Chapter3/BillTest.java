public class BillTest {
	public static void main (String[] args) {
		Bill myBill = new Bill ("Q34R", "Ball" ,6, -56);
		System.out.printf("%s\n %s\n %d\n %.2f\n ", myBill.getPieceCode(), myBill.getDescription(), myBill.getQuantity(), myBill.getPrice());
		System.out.printf("The amount is: %.3f\n", myBill.amount());
	}
}
