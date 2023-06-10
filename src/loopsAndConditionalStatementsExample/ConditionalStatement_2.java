package loopsAndConditionalStatementsExample;

public class ConditionalStatement_2 {
	
	public static void main(String[] args) {
		int a =18; 
		int b = 4;
		int sum = 1;
		if(a<=b)
		{
			if((b%2==0))
			{
				for(int i =1; i<=b; i++)
				{
					sum = sum *i;
				}
			}
			System.out.println(sum);
		}
		
		
		
		
	}

}
