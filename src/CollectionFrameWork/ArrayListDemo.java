package CollectionFrameWork;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		
		//Add
		cars.add("BMW");
		cars.add("Honda");
		cars.add("audi");
		
		//size
		int size = cars.size();
		System.out.println(size);
		
		//get
		System.out.println("The Item on Index 1 = "+ cars.get(1));
	
		//Iterration
		
		for(int i = 0; i<size; i++)
		{
			System.out.println("Item on Index  "+i+ " "+cars.get(i));
		}
	
		//By for each loop
		System.out.println(".............By for each loop............");
		for(String car :cars)
		{
			System.out.println(car);
		}
		
		//removing
		cars.remove(size-1);
		
		System.out.println(".....After removing.........");
		
		for(String car :cars)
		{
			System.out.println(car);
		}
	
	}

}
