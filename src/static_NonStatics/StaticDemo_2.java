package static_NonStatics;

public class StaticDemo_2 {
	
	int a = 78;
	static int b = 89;
	
	public void demo()
	{
		int c = b+45;
		System.out.println(c);
	}
	
	public static void test()
	{
		//int v = a+78; 
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		test();
		StaticDemo_2 sd = new StaticDemo_2();
		sd.demo();
	}

}
/*
So static field or static variables, methods, they are always associated with the class 
instead of the class instance and class instance is the object
So static variables, they're always associated with the class itself, not with the object of the class

any variable and method that don't need to change anywhere and any time

the static method cannot use a non static variable or method directly

This and super can not be used in static context

Cannot access the non static variable in the static method

static variable can access in non static method
.

*/