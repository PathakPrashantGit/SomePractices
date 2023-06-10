package methodOverloadingAndOverRidding;



public class CarOverLoading {
	
	
	// number of  parameter could be different
	//Data type of parameter are different
	// sequence of type of data type is different
	
	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight(5,true);
	}
	
	public static void increaseSeatHeight(int heightToIncrease)
	{
		System.out.println("Increase seat height By" +heightToIncrease+" inches");
		
		
	}
	
	public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight)
	{
		System.out.println("Increase seat height By" +heightToIncrease+" inches");
		
		if(rememberHeight)
		{
			System.out.println("Your selection is saved");
		}
		else
		{
			System.out.println("Your selection is not saved");
		}
	}


}
