
public class SportsCar extends Cars{

	private int miles;
	private double cost;
	
	public SportsCar(String name, double cost) {
		super(name, cost);
		this.cost = cost;
	}

	@Override
	public void drive() {
		if(cost > 25000)
			miles = 0;
		else if(cost < 25000 && cost > 10000)
			miles = 0 + (int)(Math.random() * ((8000 - 0) +1));
		else
			miles = 0 + (int)(Math.random() * ((12000 - 0) + 1));
		
		System.out.println("This car has been driven for " + miles + " miles.");
	}

}
