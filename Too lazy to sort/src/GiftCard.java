
public class GiftCard {
	
	private double balance;
	
	public GiftCard(double startBal) {
		balance = startBal;
	}
	
	public void spendFunds(double amount) {
		if(balance - amount < 0) {
			System.out.println("You owe: " + Math.abs(balance - amount));
			balance = 0;
		}else if(balance >= amount) {
			balance = balance - amount;
		}
	}
	
	public void addFunds(double amount) {
		if(amount >= 100) {
			balance = balance + amount + 10;
		}else {
			balance = balance + amount;
		}
	}
	
	public double checkBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiftCard balance = new GiftCard(100);
		
		System.out.println(balance.checkBalance());
		//spendFunds(52.8);
		balance.addFunds(90);
		System.out.println(balance.checkBalance());
		balance.spendFunds(200);
		System.out.println(balance.checkBalance());
		
	}

}
