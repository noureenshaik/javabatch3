package ProgrammingFundamental;

public class SwapThreeNumber {

	
	public static void WithoutTempVariable()
	{
		System.out.println(" without Temp Variable");
		int a = 100;
		int b = 200;
		int c = 300;
	
		a = a+ b;  // 300
		c = c -b; // 
		
		
		System.out.println( " a = " + a + " b = " + b + " c = " + c );
		
		
		
		
	}
	public static void WithTempVariable()
	{
		System.out.println(" with Temp Variable");

		int a = 100;
		int b = 200;
		int c = 300;
		
		int temp; 
		
		temp = c ;// 300
		c = a; //// a = 300
		a = b ; //200
		a = temp; //100
			
			System.out.println( " a = " + a + " b = " + b + " c = " + c );

		
		
		
		
		
	}

	

	public static void main(String[] args) {
		
		
		WithoutTempVariable();
		
		System.out.println(" *****************************");
		
		WithTempVariable();
		
		
		
	}
}
