package methodOverloadingAndOverRidding;

/***
 * Sequence of data type of argument
 * @author Administrator
 *
 */

public class CarOverloading3 {

	public static void main(String[] args) {
		increaseSeatHeight(78, "45");
		increaseSeatHeight("45", 47);
	}
	public static void increaseSeatHeight(String variable1, int variable2)
	{
System.out.println(" I am the first overload");		
		
	}
	
	public static void increaseSeatHeight(int variable2, String variable1)
	{
System.out.println(" I am the first overload");		
		
	}
}
