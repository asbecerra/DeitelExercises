public class Bill {
	private String pieceCode;
	private String desciption;
	private int quantity;
	private double price;
	public Bill (String pieceCode, String desciption, int quantity, double price) {
		this.setPieceCode(pieceCode);      //this permite acceder a la variable de instancia 
		this.setDescription(desciption);
		this.setQuantity(quantity);
		this.setPrice(price);

	}
	public void setPieceCode(String pieceCode) {
		this.pieceCode = pieceCode;
	}
	public String getPieceCode() {
		return pieceCode;
	}
	public void setDescription(String desciption) {
		this.desciption = desciption;
	}
	public String getDescription() {
		return desciption;
	}
	public void setQuantity(int quantity) {
		if (quantity < 0) {
			this.quantity = 0;
			return;
		}
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0;
			return;
		}
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public double amount() {
		double amount = quantity * price;
		return amount;
	}
}
