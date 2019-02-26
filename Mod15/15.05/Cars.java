
public abstract class Cars implements Product {
	
	private String name;
	private double cost;
	
	public Cars(String name, double cost) {
		
		this.name = name;
		this.cost = cost;
	}

	@Override
	public double getCost() {
		return cost; 
		
	}

	@Override
	public String getName() {
		
		return name;
		
	}

	public abstract void drive();
	/**
	public int compareTo(Cars obj) {
		if(cost < obj.cost)
			return 1;
		else if(cost == obj.cost)
			return 0;
		else
			return -1;
	}*/
}
