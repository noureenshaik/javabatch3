
public class SwapThreeNumbersWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		int c = 300;
		int temp = 0;
		
		System.out.println("Before swapping: ");
		System.out.println("a : " + a + "\t" + " b : " + b + "\t" + " c : " + c);
		
		//After Swapping
		temp = a;
		a = b;
		b = c;
		c = temp;
		
		System.out.println("After swapping: ");
		System.out.println("a : " + a + "\t" + " b : " + b + "\t" + " c : " + c);
	}

}
