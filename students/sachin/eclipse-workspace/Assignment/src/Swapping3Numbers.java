
public class Swapping3Numbers {

	public static void main (String[] args) {
		
		System.out.println("Swapping numbers using temp");
		
		int a=100;
		int b = 200;
		int c = 300;
		int temp = 0;
		
		System.out.println("Before swap: ");
		System.out.println("a : "+a+"\t"+"b : "+b+"\t"+"c : "+c);
		
		temp= a;
		a = b;
		b = c;
		c = temp;
		
		System.out.println("After swap: ");
		System.out.println("a : "+a+"\t"+"b : "+b+"\t"+"c : "+c);
		
		System.out.println("Swapping numbers without using temp");
		
		int x = 100;
		int y = 200;
		int z = 300;
		

		System.out.println("Before swap: ");
		System.out.println("x : "+x+"\t"+"y : "+y+"\t"+"z : "+z);
		
		x = x + y + z;
		y = x - y- z;
		z = x - y - z;
		x = x- y- z;
		
		System.out.println("After swap: ");
		System.out.println("x : "+x+"\t"+"y : "+y+"\t"+"z : "+z);
	
	}
}
