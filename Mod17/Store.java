
public class Store {

	private String name;
	private int productNum, quantity;
	private double price;
	
	public Store(String name, int productNum, double price, int quantity) {
		this.name = name;
		this.productNum = productNum;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		String itemName = String.format("%-20s",this.name);
		String itemProduct = String.format("%5s","Item #" + this.productNum);
		String itemPrice = String.format("%12s%6.2f", "Price: $", this.price);
		String itemQuantity = String.format("%13s%2d", "Amount: ", this.quantity);
		return itemName + itemProduct + itemPrice + itemQuantity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getProductNum() {
		return this.productNum;
	}
	
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
