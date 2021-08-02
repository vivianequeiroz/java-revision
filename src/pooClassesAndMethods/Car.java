package pooClassesAndMethods;

public class Car {
	
	String brand;
	String model;
	int numPassengers; 
	float fuelCapacity;
	float fuelConsumption; 

	//all methods starts by the declaration of its type
	//void methods does'not return any value
	//methods are usually but not always used for actions
	//it's a good practice starts the method name with a verb
	
	void showAutonomy() {
		System.out.println("The car autonomy is: " + fuelCapacity * fuelConsumption + " km/h.");
	}

}
