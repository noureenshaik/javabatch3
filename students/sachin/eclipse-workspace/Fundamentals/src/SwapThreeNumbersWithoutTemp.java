
public class SwapThreeNumbersWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		System.out.println("Before swapping: ");
		System.out.println("a : " + a + "\t" + " b : " + b + "\t" + " c : " + c);

		
		//Swapping operation
		
		a = a + b + c;
		c = a - b - c;
		b = a - b - c;
		a = a - b - c;
		
		System.out.println("After swapping: ");
		System.out.println("a : " + a + "\t" + " b : " + b + "\t" + " c : " + c);
		  
	}

}
