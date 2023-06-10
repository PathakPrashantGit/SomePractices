package interfaceConcept;

public class interfaceDemo implements CarsInterface, BMWCarsInterface {

	@Override
	public void enginStart(String  engineType, boolean isKeyLess) {
		System.out.println("This is implementation");
		
	}

	@Override
	public void headsUpNevigation() {
		System.out.println("This is HeadsUp Nevigatio");
	}
	
	public void carbonCumbution()
	{
		System.out.println("It has CI cumbution Gas");
	}

}
