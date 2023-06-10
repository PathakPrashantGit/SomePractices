package static_NonStatics;

public class StaticDemo_1 {
	
	public static void main(String[] args) {
		StaticExampleClass sc1 = new StaticExampleClass("bmw");
		System.out.println("the car is  = "+sc1.getMake());
		System.out.println("Instance Number ="+StaticExampleClass.getInstanceNum());
		
		StaticExampleClass sc2 = new StaticExampleClass("Maruti");
		System.out.println("the car is  = "+sc2.getMake());
		System.out.println("Instance Number ="+StaticExampleClass.getInstanceNum());
	}

}
/*
So static field or static variables, methods, they are always associated with the class 
instead of the class instance and class instance is the object
So static variables, they're always associated with the class itself, not with the object of the class

any variable and method that don't need to change anywhere and any time

the static method cannot use a non static variable or method directly

This and super can not be used in static context
.

*/