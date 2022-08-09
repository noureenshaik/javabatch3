
// prime number 1 to 100 
package ProgrammingFundamental;

public class primeNumber2 {
	
	
	public static void main(String[] args) {
		
		
		for( int i=2; i<=100; i++)
		{
			
			
			if( isPrime(i))
			{
				
				System.out.println(i);
			}
		}
		
		
		
		
	}

	private static boolean isPrime(int num) {
		
		if(num ==2 || num == 3 )
		{
			
			return true;
		}
		if( num % 2 == 0 || num % 3 == 0)
		{
			
			return false;
			
			
		}
		for( int i = 3; i < Math.sqrt(num); i+= 2)
		{
			
			if( num % i == 0 || num % Math.sqrt(num )== 0)
			{
				
				return false;
			}
			
			
		}
		return true;
			
		}
		
		
		
	}


