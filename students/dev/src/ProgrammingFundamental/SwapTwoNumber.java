package ProgrammingFundamental;

public class SwapTwoNumber

{

	public static void withoutTempVariable() 
	{
		int a = 100;
		int b = 200;

		System.out.println(" without Temp Variable");

		b = b - a; // 100
		a = b + a; // 200

		System.out.println(" a = " + a + "\t" + " b = " + b);

		System.out.println(" ******************************");

	}

	public static void usingTempVariable() 
	{
		int a = 100, b = 200;
		System.out.println(" using Temp Variable");

		int temp = a; // 100
		
		a = b; // 200
		
		b = temp; // 100
	

		System.out.println(" a = " + a + "\t" + " b = " + b);

		System.out.println(" ******************************");

	}

	public static void main(String[] args) 
	{
		usingTempVariable();
		withoutTempVariable();
	}

}
