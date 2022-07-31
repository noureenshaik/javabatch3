
public class Swap {

	public static void main(String[] args) {
		
		
		int x = 100;
		int y = 200;
		System.out.println("before swap");
		System.out.println("x value is :  "+x);
		System.out.println("y value is :  "+y);
		
	    x = x - y;
	    y = x + y;
	    x = y - x;
	        
	    System.out.println("after swap");
	    System.out.println("value of x  : "+x);
	    System.out.println("value of y  : "+y);

	}

}
