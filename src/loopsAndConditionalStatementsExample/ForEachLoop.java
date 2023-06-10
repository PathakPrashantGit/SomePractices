package loopsAndConditionalStatementsExample;

public class ForEachLoop {

	public static void main(String[] args) {
		String arr = "Good Morning";  // doog gninrom
		
		String words [] = arr.split(" ");
		String revString= "";
		
		for(String word : words)
		{
			String revStr ="";
			for(int i =word.length()-1; i>=0; i-- )
			{
				revStr = revStr + word.charAt(i);
			}
			revString = revString + revStr+" ";
		}
		System.out.println(revString +" ");
	}
}
