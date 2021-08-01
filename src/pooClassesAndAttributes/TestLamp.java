package pooClassesAndAttributes;

public class TestLamp {

	public static void main(String[] args) {
		
		Lamp lamp = new Lamp();
		lamp.model = "A60";
		lamp.tension = "Bivolt";
		lamp.power = 7;
		lamp.color = "Yellow";
		
		//Since arrays are object it's necessary to locate space in memory before using it
		lamp.types = new String[5];
		lamp.types[0] = "Lampshade";
	}

}
