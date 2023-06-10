package DataTypes;

public class Operaters {
	
	public static void main(String[] args) {
		
		//Arithmetic Operator
		int a =10;
		int b = 90 ;
		
		String h = "Hello"
		;
		System.out.println(h+a+b);
		System.out.println(a+b+h);
		System.out.println(h+(a+b));
		
		int c =90;
		int d = 90;
		
		System.out.println(c*d);
		
		int e = 100;
		int f = 20 ;
		
		System.out.println(e/f);  // give diviser
		
		int g = 120;
		int i = 7;
		
		System.out.println(g%i); // give remainder
		
		//Logical Operator
		
		int y = 45;
		int z = 78;
		int x = 89;
		
		if(y<z && y<x)  // both condition should be true in AND operator
		{
			System.out.println("Hello Morning");
		}
		
		if(x<z || x>y) // in OR operator any condition should be true
		{
			System.out.println("Hello its Good Afternoon");
		}
		
	}

}
