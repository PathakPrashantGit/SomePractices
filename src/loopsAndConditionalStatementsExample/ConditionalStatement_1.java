package loopsAndConditionalStatementsExample;

public class ConditionalStatement_1 {
	
	public void result(int marks)
	{
		if(marks>100)
		{
			System.out.println("Please enter correct Number");
		}
		if(marks==100 && marks >90)
		{
			System.out.println("Grade :"+"A+");
		}
		 else if (marks<=90 && marks>80)
		{
			System.out.println("Grade ;"+"A");
		}
		 else if (marks <=80 && marks >70)
		 {
			 System.out.println("Grade ;"+"B");
		 }
		 else if (marks<=70 && marks>60)
		 {
			 System.out.println("Grade =;"+"C");
		 }
		 else if (marks<60)
		 {
			 System.out.println("Grade ;"+"D");
		 }
	}

	public static void main(String[] args) {
		
		ConditionalStatement_1 cs = new ConditionalStatement_1();
		cs.result(88);
		
		
		
	}
}
