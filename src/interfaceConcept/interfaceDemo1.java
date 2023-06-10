package interfaceConcept;

public class interfaceDemo1 {
	
	public static void main(String[] args) {
		CarsInterface myInterface = new interfaceDemo();
		myInterface.enginStart("6 cyl", true);
		
		
		
		interfaceDemo id = new interfaceDemo();
		id.carbonCumbution();
	    
		id.enginStart("6Cyl", true);
		id.headsUpNevigation();
	
	
	}

}
