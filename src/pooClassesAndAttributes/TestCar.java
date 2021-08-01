package pooClassesAndAttributes;

public class TestCar {

	public static void main(String[] args) {
		
		Car van = new Car();
		van.brand = "Fiat";
		van.model = "Ducato";
		van.numPassengers = 10;
		van.fuelConsumption = 100;
		van.fuelConsumption = 0.2F;
		
		System.out.println(van.brand);
		System.out.println(van.model);
	}

}
