
public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 100;
		int y = 200;
		int z = 300;
		System.out.println("before swap");
		System.out.println("x value is :  "+x);
		System.out.println("y value is :  "+y);
		System.out.println("z value is  : "+z);
		
	    x = z;
	    y = y;
	    z = z-y;
	        
	    System.out.println("after swap");
	    System.out.println("value of x  : "+x);
	    System.out.println("value of y  : "+y);
	    System.out.println("value of z:  "+z);


	}

}
