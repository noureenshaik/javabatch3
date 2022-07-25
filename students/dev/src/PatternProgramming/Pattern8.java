package PatternProgramming;

public class Pattern8 {
	
	public static void main(String[] args) {
		
		int k= 1;
		for( int i = 0; i<6; i++)
		{
			
			for( int j = 0; j<4; j++)
			{
				
				System.out.print(k + " ");
				k+=2;
			}
			System.out.println(k);
		}
	}

}
