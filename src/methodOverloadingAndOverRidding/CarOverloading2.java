package methodOverloadingAndOverRidding;
/***
 * Difference in data type in arguments
 * @author Administrator
 *
 */

public class CarOverloading2 {
	
	public static void main(String[] args) {
		increaseSeatHeight(45);
		increaseSeatHeight("9");
	}

	public static void increaseSeatHeight(int heightToIncrease)
	{
		System.out.println("Increase seat height By" +heightToIncrease+" inches I am the Integer one");
		
		
	}
	
	public static void increaseSeatHeight(String heightToIncrease)
	{
		System.out.println("Increase seat height By" +heightToIncrease+" inches I am the String one");
		
		
	}
}




