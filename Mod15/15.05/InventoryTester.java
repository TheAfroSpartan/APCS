import java.util.ArrayList;

public class InventoryTester {

	public static void main(String[] args) {
		
		ArrayList<Cars> vehicles = new ArrayList<Cars>();
		
		SportsCar car1 = new SportsCar("Mazda Rx-9", 90000);
		car1.drive();
		
		SportsCar car2 = new SportsCar("2010 Ford Mustang Gt", 8995);
		car2.drive();
		
		SportsCar car3 = new SportsCar("2015 Dodge Challenger R/T", 19990);
		car3.drive();
		
		SUV car4 = new SUV("2010 Ford Mustang Gt", 8995);
		car4.drive();
	}
}
