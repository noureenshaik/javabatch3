package PatternProgramming;

public class Pattern3 {
	
	public static void main(String[] args) {
		
	int k = 0;
	
	for( int i = 0; i<=5; i++)
	{
		
			for( int j = 1; j<i-1; ++j)
			{
				
				
				System.out.print( "");
			}
			for ( k = 0; k <=i; k++)
			{
				
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
