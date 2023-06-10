package methodOverloadingAndOverRidding;

/***
 * Rules
 * 1. Arguments List: Arguments list in the overriding method should be same as the parent class overridden method
 * 2. Access Modifier: Access modifier of the overriding method cannot be more restrictive than the overridden method
 * 3. private, static and final methods cannot be overridden as they are local to the class
 */

public class CarsOveridingChild extends CarsOveridingParents {

	
	public static void main(String[] args) {
		CarsOveridingChild obj = new CarsOveridingChild();
		obj.engineStart(56);
		obj.increaseSpeed();
				
	}
	public void engineStart(int cyl)
	{
		super.engineStart(5665);
		System.out.println("I am from child class");
	}
	
	public void increaseSpeed()
	{
		System.out.println("Increase Speed at Child Level");
	}
}
