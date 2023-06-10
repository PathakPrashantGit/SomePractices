package DataTypes;

public class StringDemo {
	
	//String 
	
	public static void main(String[] args) {
		// String Literal - String Constant Pool
		String str1 = "Hello";
		
		String str3 = "Hello";
		
		
		System.out.println(str1);
		// String Object - Heap
		String str2 = new String("Welcome");
		
		String str4 = new String("Welcome");
		
		// Strings
		
		str1 = "More Hello";
		
		String stradd = str1 + str2;
		
		System.out.println(str1);
	}

}
